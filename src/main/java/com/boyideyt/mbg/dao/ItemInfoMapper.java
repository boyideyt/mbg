package com.boyideyt.mbg.dao;

import com.boyideyt.mbg.entity.ItemInfo;
import com.boyideyt.mbg.entity.ItemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemInfoMapper {
    long countByExample(ItemInfoExample example);

    int deleteByExample(ItemInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);

    List<ItemInfo> selectByExample(ItemInfoExample example);

    ItemInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemInfo record, @Param("example") ItemInfoExample example);

    int updateByExample(@Param("record") ItemInfo record, @Param("example") ItemInfoExample example);

    int updateByPrimaryKeySelective(ItemInfo record);

    int updateByPrimaryKey(ItemInfo record);
}