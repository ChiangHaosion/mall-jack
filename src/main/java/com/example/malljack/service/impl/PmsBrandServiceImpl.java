package com.example.malljack.service.impl;

import com.example.malljack.mbg.domain.PmsBrand;
import com.example.malljack.mbg.mapper.PmsBrandMapper;
import com.example.malljack.query.PmsQueryObject;
import com.example.malljack.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PmsBrandServiceImpl
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/14
 * @Version V1.0
 **/
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectAll();
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int createBrand(PmsBrand brand) {
        //PmsBrand pmsBrand = new PmsBrand(null,"锤子手机","C",0,0,0,100,100,"SSS","www","hello");
        return pmsBrandMapper.insert(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        return pmsBrandMapper.updateByPrimaryKey(id,brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<PmsBrand> selectListByQueryObject(PmsQueryObject queryObject) {
        PageHelper.startPage(queryObject.getCurrentPage(),queryObject.getPageSize());
        List<PmsBrand> list=pmsBrandMapper.selectByCondition(queryObject);
        return new PageInfo<PmsBrand>(list);

    }
}
