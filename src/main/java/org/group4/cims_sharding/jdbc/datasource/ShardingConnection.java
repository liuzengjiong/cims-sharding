package org.group4.cims_sharding.jdbc.datasource;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.group4.cims_sharding.jdbc.context.ShardingContext;

/**
 * @TODO 分片数据库连接
 * @author Jiong
 * @Date 2017年7月16日
 */
public class ShardingConnection extends BasicConnection{
	
	private ShardingContext context ;
	
	public ShardingConnection(ShardingContext context){
		this.context = context;
	}
	
	//重写
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		
		return null;
	}
	
}
