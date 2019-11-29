/**
 * @Title: AssetType.java
 * @Package com.hj.oa.bean
 * @Description: TODO(用一句话描述该文件做什么)
 * @author mlsong
 * @date 2019年3月19日
 * @version v1.0
 */
package com.hj.oa.bean;

/**
 * @ClassName: AssetType
 * @Description: 资产类别实体类
 * @author mlsong
 * @date 2019年3月19日
 *
 */
public class AssetType {
    
    public AssetType() {
        // TODO Auto-generated constructor stub
    }

    public AssetType(Integer id, Integer pId, String name) {
        super();
        this.id = id;
        this.pId = pId;
        this.name = name;
    }

    private Integer id;
    private Integer pId;
    private String name;
    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param {bare_field_name} to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return pId
     */
    public Integer getpId() {
        return pId;
    }
    /**
     * @param {bare_field_name} to set
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }
    /**
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * @param {bare_field_name} to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /* (非 Javadoc)
     *
     * @return
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((pId == null) ? 0 : pId.hashCode());
        return result;
    }
    /* (非 Javadoc)
     *
     * @param obj
     * @return
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AssetType other = (AssetType) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (pId == null) {
            if (other.pId != null)
                return false;
        } else if (!pId.equals(other.pId))
            return false;
        return true;
    }
    /* (非 Javadoc)
     *
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AssetType [id=" + id + ", pId=" + pId + ", name=" + name + "]";
    }
    
    
    
}
