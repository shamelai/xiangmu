/**
 * @Title: Result.java
 * @Package com.itek.spring.day04.commons
 * @Description: TODO(用一句话描述该文件做什么)
 * @author mlsong
 * @date 2019年3月15日
 * @version v1.0
 */
package com.hj.commons;

import java.io.Serializable;

/**
 * @ClassName: Result
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mlsong
 * @date 2019年3月15日
 *
 */
public class Result<T> implements Serializable {
    
    
    public Result () {
        setResultCode(ResultCode.SUCCESS);
    }
    
    public void setResultCode(ResultCode rc) {
        this.state = rc.getCode();
        this.msg = rc.getMessage();
    }
    
    /**
     * @Fields 序列化id
     */
    private static final long serialVersionUID = 2952442377380582998L;


    /**
     * @Fields 状态标示
     */
    private int state;
    
    
    /**
     * @Fields 状态描述
     */
    private String msg;
    
    /**
     * @Fields 返回数据
     */
    private T data;

    /**
     * @return state
     */
    public int getState() {
        return state;
    }

    /**
     * @param {bare_field_name} to set
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param {bare_field_name} to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return data
     */
    public T getData() {
        return data;
    }

    /**
     * @param {bare_field_name} to set
     */
    public void setData(T data) {
        this.data = data;
    }
    
    
}
