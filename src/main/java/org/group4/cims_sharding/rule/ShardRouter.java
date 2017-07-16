package org.group4.cims_sharding.rule;

import javax.sql.DataSource;

import org.group4.cims_sharding.algorithm.DBShardingAlgorithm;
import org.group4.cims_sharding.jdbc.context.ShardingContext;
import org.group4.cims_sharding.jdbc.datasource.ShardingDataSource;
import org.group4.cims_sharding.jdbc.executor.ExecutorEngine;

/**
 * @TODO 分片路由
 * @author Jiong
 * @Date 2017年7月15日
 */
public class ShardRouter {
	
	private String shardingKey;
	private DBShardingAlgorithm algorithm;
	
	public ShardRouter(String shardingKey,DBShardingAlgorithm algorithm){
		this.shardingKey = shardingKey;
		this.algorithm = algorithm;
	}
	
	public DataSource getDataSource(){
		ExecutorEngine engine = new ExecutorEngine();
		//创建刚数据源运行所需上下文
		ShardingContext context = new ShardingContext(shardingKey, algorithm, engine);
		//需参考sharding-jdbc
		return new ShardingDataSource(context);
	}
	
	public String getShardingKey() {
		return shardingKey;
	}
	public void setShardingKey(String shardingKey) {
		this.shardingKey = shardingKey;
	}
	public DBShardingAlgorithm getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(DBShardingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	
	
}

