package org.group4.cims_sharding.jdbc.datasource;

import javax.sql.DataSource;

import org.group4.cims_sharding.jdbc.context.ShardingContext;

/**
 * @TODO 分片数据源
 * @author Jiong
 * @Date 2017年7月16日
 */
public class ShardingDataSource extends BasicDataSource implements AutoCloseable{
	private final ShardingContext context;
	
	
	public ShardingDataSource(final ShardingContext context){
		this.context = context;
	}

	public ShardingContext getContext() {
		return context;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.AutoCloseable#close()
	 */
	public void close() throws Exception {
		// TODO Auto-generated method stub
	}
	
}
