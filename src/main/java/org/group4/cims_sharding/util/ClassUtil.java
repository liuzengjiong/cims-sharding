package org.group4.cims_sharding.util;

import java.io.InputStream;

/**
 * @TODO 类方法工具类，静态方法中调用非静态方法封装
 * @author Jiong
 * @Date 2017年7月14日
 */
public class ClassUtil {
	 private static ClassUtil instance = new ClassUtil(); //实例化私有静态对象  
     
	    /** 
	     * 通过资源名称或资源路径得到资源输入流 
	     * @param name 资源名称或资源路径 
	     */  
	    public static InputStream getResourceAsStream(String name) {  
	        /* 
	         * 这里用到了回调方法 
	         * 使用静态的私有对象，在静态方法中调用非静态的方法 
	         * 并且loadResource是私有方法，对外不可见 
	         */  
	        return instance.loadResource(name);  
	    }  
	      
	    private ClassUtil() {}  
	      
	    /** 
	     * 通过资源名称或资源路径加载资源 
	     * @param name 资源名称或资源路径 
	     * @return InputStream 
	     */ 
	    private InputStream loadResource(String name) {  
	         return getClass().getResourceAsStream(name);  
	     }  
}
