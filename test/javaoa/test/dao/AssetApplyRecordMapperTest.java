/**
 * @Title: AssetApplyRecordMapperTest.java
 * @Package javaoa.test.dao
 * @Description: TODO(用一句话描述该文件做什么)
 * @author mlsong
 * @date 2019年3月22日
 * @version v1.0
 */
package javaoa.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hj.oa.bean.AssetApplyRecord;
import com.hj.oa.bean.Role;
import com.hj.oa.dao.AssetApplyDetailMapper;
import com.hj.oa.dao.AssetApplyRecordMapper;

/**
 * @ClassName: AssetApplyRecordMapperTest
 * @Description: AssetApplyRecordMapper DAO接口测试类
 * @author mlsong
 * @date 2019年3月22日
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml", "classpath:dispatcher-servlet.xml"})
public class AssetApplyRecordMapperTest {

    @Autowired
    private AssetApplyRecordMapper recordMapper;
    
    @Test
    public void selectByRecordTest() {
        AssetApplyRecord record = new AssetApplyRecord();
//        record.setId(13);
        record.setApplyer("宋民亮");
        List<AssetApplyRecord> records = recordMapper.selectByRecord(record );
        System.out.println(records);
        Assert.assertEquals(1, records.size());
    }
    
    @Test
    public void selectRecordsByRolesTest() {
        List<Role> roles = new ArrayList<Role>();
        Role r1 = new Role();
        r1.setId(1);
        r1.setName("aaa");
        Role r2 = new Role();
        r2.setId(56);
        r2.setName("bbb");
        roles.add(r1);
        roles.add(r2);
        
        List<AssetApplyRecord> records = recordMapper.selectRecordsByRoles(roles );
        System.out.println(records);
    }
    
}
