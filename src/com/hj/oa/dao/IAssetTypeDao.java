/**
 * @Title: IAssetTypeDao.java
 * @Package com.hj.oa.dao
 * @Description: TODO(用一句话描述该文件做什么)
 * @author mlsong
 * @date 2019年3月19日
 * @version v1.0
 */
package com.hj.oa.dao;

import java.util.List;

import com.hj.oa.bean.AssetType;

/**
 * @ClassName: IAssetTypeDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mlsong
 * @date 2019年3月19日
 *
 */
public interface IAssetTypeDao {

    /**
     * @Title: selectAll
     * @Description: 查询所有数据
     * @param @return 参数
     * @return List<AssetType> 返回类型
     * @throws
     */
    List<AssetType> selectAll();

}
