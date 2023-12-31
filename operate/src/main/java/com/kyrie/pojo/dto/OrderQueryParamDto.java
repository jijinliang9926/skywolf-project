package com.kyrie.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

/**
 * @auther: jijin
 * @date: 2023/10/15 21:43 周日
 * @project_name: skywolf-project
 * @version: 1.0
 * @description 多条件查询参数类,根据订单号、时间、产品名字、ASIN、SKU、负责人等查询
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class    OrderQueryParamDto {

    //订单号
    private String id;
    //订单状态
    private String state;
    //产品名字
    private String name;
    //asin
    private String asin;
    //sku
    private String sku;
    //国家
    private String country;
    //负责人
    private String manager;
    //订单日期
    private LocalDate beforeData;

    private LocalDate aftereData;



}
