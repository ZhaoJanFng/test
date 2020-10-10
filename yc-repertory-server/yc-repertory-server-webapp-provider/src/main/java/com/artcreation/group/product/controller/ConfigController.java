package com.artcreation.group.product.controller;


import com.artcreation.group.product.utils.ResponseObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RefreshScope
@RestController
@RequestMapping("product")
@Api(value = "商品服务，测试")
public class ConfigController {


    @Value("${product.category.name}")
    private String name;

    @Value("${product.category.id}")
    private Integer age;

    private final static Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @RequestMapping(value = "/getcat", method = RequestMethod.POST)
    @ApiOperation(value = "测试获取nacos配置中心信息")
    public ResponseEntity test(
            @ApiParam(required = true, value = "秘钥") @RequestParam(required = true) String secretKey
    ) {
        logger.info("测试获取nacos配置中心信息");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", name);
        hashMap.put("age", age);
        return ResponseObject.success(hashMap);

    }

}
