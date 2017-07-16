package org.group4.cims_sharding.util;

import java.util.Map;

import javax.management.RuntimeErrorException;

/**
 * 前置条件检查
 * @author Jiong
 */
public class PreCondition {
	/**
	 * 检查不为空
	 * @param obj 检查对象
	 * @param errorMsg 错误信息
	 */
	public static void isNotNull(Object obj,String errorMsg){
		if(obj == null){
			throw new RuntimeException(errorMsg);
		}
	}
	
	public static void isNotNull(Object obj){
		isNotNull(obj,"空值异常");
	}
	
	/**
	 * 检查不能包含
	 * @param key
	 * @param map
	 */
	@SuppressWarnings("rawtypes")
	public static void isNotContain(String key,Map map){
		if(map.containsKey(key)){
			throw new RuntimeException("key:"+key+"在map中重复");
		}
	}
}
