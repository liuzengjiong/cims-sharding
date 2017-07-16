package org.group4.cims_sharding.config;

/**
 * @TODO 常量定义
 * @author Jiong
 * @Date 2017年7月14日
 */
public enum Constant {
	LOGIC_NAME("logicname"),
	DRIVER("driver"),
	URL("url"),
	USERNAME("username"),
	PASSWORD("password"),
	DB_CONFIG_FILE("/datasources.xml");
	
	private final String value;
	Constant(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
}
