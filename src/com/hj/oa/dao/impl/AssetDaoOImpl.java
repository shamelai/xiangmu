package com.hj.oa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hj.oa.bean.AssetType;
import com.hj.oa.dao.IAssetTypeDao;

@Repository("assetTypeDao")
public class AssetDaoOImpl implements IAssetTypeDao {
    
    @Autowired
    @Qualifier("template")
    private JdbcTemplate template;

    /* (非 Javadoc)
     *
     * @return
     * @see com.hj.oa.dao.IAssetTypeDao#selectAll()
     */
    @Override
    public List<AssetType> selectAll() {
        String sql = "select id, pId, name from t_zc_prop_type";
        // 使用template查询数据
        List<AssetType> types = template.query(sql, new BeanPropertyRowMapper<AssetType>(AssetType.class));
        System.out.println(types);
        return types;
    }

    /**
     * @return template
     */
    public JdbcTemplate getTemplate() {
        return template;
    }

    /**
     * @param {bare_field_name} to set
     */
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    

}
