package org.group4.cims_sharding.algorithm;

import java.util.Collection;

/**
 * @TODO 分片算法接口
 * @author Jiong
 * @Date 2017年7月15日
 */
public interface DBShardingAlgorithm {
	
	//TODO 根据分片键的值选择要执行操作的分片
	public String selectShard(Collection<String> datasourceNames,String shardingKeyValue);
	
	
}
