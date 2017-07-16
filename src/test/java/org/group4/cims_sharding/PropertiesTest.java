package org.group4.cims_sharding;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.group4.cims_sharding.config.Constant;
import org.group4.cims_sharding.util.DataSourceManager;
import org.junit.Test;

public class PropertiesTest {
	
	//@Test
	public void testProperties() throws IOException{
		Properties prop = new Properties();
		
		InputStream in =
				getClass().getResourceAsStream("/datasources.properties");
		prop.load(in);
		in.close();
		System.out.println(prop.getProperty("user.*"));
		Iterator<String> ite = prop.stringPropertyNames().iterator();
		while(ite.hasNext()){
			String key = ite.next();
			System.out.println(key + " - " + prop.getProperty(key));
		}
	}
	
	@Test
	public void testXML(){
		try{
	        SAXReader saxReader = new SAXReader(); //使用SAXReader方式读取XML文件  
	        //加载数据库XML配置文件，得到Document对象  
	        Document document = 
	        		saxReader.read(getClass().getResourceAsStream(Constant.DB_CONFIG_FILE.getValue()));   
	        Element root = document.getRootElement(); //获得根节点  
	        //得到database节点  
	        Element dbs = (Element)root.selectSingleNode("/cims/dbs");   
	        List dbList = dbs.elements(); //dbs元素下的子元素集合  
	        /* 
	         * 循环遍历集合中的每一个元素 
	         * 将每一个元素的元素名和值在控制台中打印出来 
	         */  
	        for(Object obj:dbList){  
	            Element element = (Element)obj;  
	            
	            for(Object ele : element.elements()){
	            	Element elem = (Element) ele;
	            	 //getName()是元素名,getText()是元素值  
	                System.out.println(elem.getName()+": "+elem.getText()); 
	            }
	           System.out.println();
	        }  
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDBManager(){
		System.out.println(DataSourceManager.getDataSourceCount());
	}
}
