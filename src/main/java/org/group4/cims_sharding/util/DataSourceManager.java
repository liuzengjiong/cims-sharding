package org.group4.cims_sharding.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.group4.cims_sharding.config.Constant;
import org.group4.cims_sharding.exception.DataBaseManageException;

/**
 * @TODO 数据源管理类 
 * @author Jiong
 * @Date 2017年7月14日
 */
public class DataSourceManager {
	 
	private static Element domRoot; //根元素  
	
	private static Map<String,DataSource> dsMap; //数据源集合
	
	
	/**
	 * 获取数据源总数
	 * @return
	 */
	public static int getDataSourceCount(){ 
		return dsMap.size();
	}
	
	/**
	 * 获取数据源名字
	 * @return
	 */
	public static Collection<String> getDataSourceNames(){
		return dsMap.keySet();
	}
	
	/**
	 * 获取数据源
	 * @param logicname 数据库逻辑名
	 * @return 数据源
	 */
	public static DataSource getDataSource(String logicname){
		return dsMap.get(logicname);
	}
	
	//TODO 静态初始化
    static{  
        try {
			load();
			initDataSourceMap();
		} catch (DataBaseManageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}  
    } 
	
	 /** 
     * 加载数据源配置文件，取得根元素 
	 * @throws DataBaseManageException 
     */  
    private static void load() throws DataBaseManageException{  
        
		try {
			SAXReader saxReader = new SAXReader(); //使用SAXReader方式读取XML文件  
	        //加载数据库XML配置文件，得到Document对象  
	        Document document = 
	        		saxReader.read(ClassUtil.getResourceAsStream(Constant.DB_CONFIG_FILE.getValue()));
	        domRoot = document.getRootElement(); //获得根节点
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new DataBaseManageException("解析数据源配置文件失败");
		}   
    }  
  
    
    /**
     * 初始化数据源集合
     */
    private static void initDataSourceMap(){
    	 dsMap = new HashMap<String, DataSource>();
    	 Element dbs = (Element) domRoot.selectSingleNode("/cims/dbs"); //得到dbs节点  
         PreCondition.isNotNull(domRoot, "获取不到数据源配置");
    	 for(Object oneDB : dbs.elements()){
         	Element db = (Element) oneDB;
         	Map<String,String> dbConfigMap = getDBConfig(db);
         	String logicname = dbConfigMap.get(Constant.LOGIC_NAME.getValue());
         	PreCondition.isNotNull(logicname, "数据库逻辑名不能为空，请指定"+Constant.LOGIC_NAME.getValue());
         	PreCondition.isNotContain(logicname, dsMap);
         	DataSource dataSource = createDataSource(dbConfigMap);
         	dsMap.put(logicname, dataSource);
         }
         
    }
    
    /** 
     * 取得数据源配置信息返回HashMap
     * @param db 单个数据源元素 
     * @return 返回存放信息的HashMap 
     */  
    private static HashMap<String,String> getDBConfig(Element db){  
    	HashMap<String,String> hashmap = new HashMap<String,String>();
    	
        try{  
            List list = db.elements(); //得到db元素下的子元素集合  
            /* 
             * 循环遍历集合中的每一个元素 
             * 将每一个元素的元素名和值作为键值对放入HashMap中 
             */  
            for(Object obj:list){  
                Element element = (Element)obj;  
                //getName()是元素名,getText()是元素值  
                hashmap.put(element.getName(), element.getText());  
            }          
        }catch(Exception e){  
            e.printStackTrace();  
        }  
        return hashmap;  
    } 
    
    /** 
     * 创建数据源 
     * @param dbConfigMap 数据源配置信息 
     * @return 数据源
     */  
    private static DataSource createDataSource(Map<String,String> dbConfigMap) {  
        BasicDataSource result = new BasicDataSource();  
        result.setDriverClassName(dbConfigMap.get(Constant.DRIVER.getValue()));  
        result.setUrl(dbConfigMap.get(Constant.URL.getValue()));  
        result.setUsername(dbConfigMap.get(Constant.USERNAME.getValue()));
        result.setPassword(dbConfigMap.get(Constant.PASSWORD.getValue()));  
        return result;  
    }
    
}



