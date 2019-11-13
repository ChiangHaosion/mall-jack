package com.example.malljack.mbg.mapper;

import com.example.malljack.mbg.domain.PmsBrand;
import com.example.malljack.query.PmsQueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    List<PmsBrand> selectAll();

    int updateByPrimaryKey(@Param("id") Long id, @Param("pmsBrand") PmsBrand pmsBrand);

    List<PmsBrand> selectByCondition(PmsQueryObject pmsQueryObject);
}