package com.example.malljack.service;

import com.example.malljack.mbg.domain.PmsBrand;
import com.example.malljack.query.PmsQueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface PmsBrandService {

    /**
     * 查询出所有品牌
     * @return
     */
    List<PmsBrand> listAllBrand();

    /**
     * 通过ID查询一个品牌
     * @param id
     * @return
     */
    PmsBrand getBrand(Long id);
    /**
     * 创建一个品牌
     * @param brand
     * @return
     */
    int createBrand(PmsBrand brand);

    /**
     * 根据ID更新一个品牌
     * @param id
     * @param brand
     * @return
     */
    int updateBrand(Long id, PmsBrand brand);

    /**
     * 根据ID删除一个品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);


    /**
     * 分页查询
     * @param queryObject 查询的条件
     * @return 查询的结果对象
     */
    PageInfo<PmsBrand> selectListByQueryObject(PmsQueryObject queryObject);

}
