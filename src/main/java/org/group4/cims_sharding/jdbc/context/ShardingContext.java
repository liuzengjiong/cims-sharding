package org.group4.cims_sharding.jdbc.context;

import org.group4.cims_sharding.algorithm.DBShardingAlgorithm;
import org.group4.cims_sharding.jdbc.executor.ExecutorEngine;

/**
 * @TODO 数据源运行时上下文
 * @author Jiong
 * @Date 2017年7月15日
 */
public final class ShardingContext {
	
	private final String shardingKey;  //分片键
	private final DBShardingAlgorithm algorithm; //分片算法
	private final ExecutorEngine excutorEngine; //SQL执行引擎
	
	//TODO 构造方法
	public ShardingContext(
			final String shardingKey,
			final DBShardingAlgorithm algorithm,
			final ExecutorEngine excutorEngine){
		
		this.shardingKey = shardingKey;
		this.algorithm = algorithm;
		this.excutorEngine = excutorEngine;
	}
	
	
	public DBShardingAlgorithm getAlgorithm() {
		return algorithm;
	}

	public ExecutorEngine getExcutorEngine() {
		return excutorEngine;
	}


	public String getShardingKey() {
		return shardingKey;
	}
}
