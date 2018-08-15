package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    public String getPermissions() {

        return "Hello Dubbo";
    }
}
