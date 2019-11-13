package com.example.malljack.query;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName QueryObject
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/14
 * @Version V1.0
 **/
@Setter
@Getter
public class QueryObject {

    private int currentPage = 1; // 当前页
    private int pageSize = 3; // 每页显示多少数量

}
