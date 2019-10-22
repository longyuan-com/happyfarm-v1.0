package com.ssm.mapper;

import com.ssm.entity.HappyFarmLandinfo;
import com.ssm.entity.HappyFarmLandinfoExample;
import com.ssm.entity.PageBean;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HappyFarmLandinfoMapper {
    long countByExample(HappyFarmLandinfoExample example);

    int deleteByExample(HappyFarmLandinfoExample example);

    int deleteByPrimaryKey(Integer landid);

    int insert(HappyFarmLandinfo record);

    int insertSelective(HappyFarmLandinfo record);

    List<HappyFarmLandinfo> selectByExample(HappyFarmLandinfoExample example);

    HappyFarmLandinfo selectByPrimaryKey(Integer landid);

    int updateByExampleSelective(@Param("record") HappyFarmLandinfo record, @Param("example") HappyFarmLandinfoExample example);

    int updateByExample(@Param("record") HappyFarmLandinfo record, @Param("example") HappyFarmLandinfoExample example);

    int updateByPrimaryKeySelective(HappyFarmLandinfo record);

    int updateByPrimaryKey(HappyFarmLandinfo record);
    
    int updatestatus(@Param("landid")int landid ,@Param("status")int status);
    
    /*
	 * 查询数据库中所有的土地条数
	 * */
	public int getCount();
	/*
	 * 查询pageBean
	 * */
	public PageBean getPageBean();
	/*
	    *   使用注解方式传入多个参数
	    *   分页查询  
	 */
	public List<HappyFarmLandinfo> getPageData(@Param(value="index") Integer index,@Param(value="pageCount") Integer pageCount);
}