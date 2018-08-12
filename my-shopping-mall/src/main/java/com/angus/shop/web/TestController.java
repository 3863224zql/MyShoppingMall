/**
 * Baijiahulian.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */
package com.angus.shop.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouqinglai
 * @version version
 * @title TestController
 * @desc 测试SpringBoot
 * @date: 2018年08月13日
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/query")
    public String getString(String q){
        System.out.println(q);
        return q;
    }
}
