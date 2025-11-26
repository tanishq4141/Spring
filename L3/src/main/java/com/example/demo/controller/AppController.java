package com.example.demo.controller;


import com.example.demo.config.AppinfoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class AppController {
    @Autowired
    private AppinfoConfig appinfoConfig;

    @GetMapping("/info")
    public Map<String, Objects> getAppInfo(){
        return Map.of(
                "name",appinfoConfig.getName();
                "version",appinfoConfig.getVersion();
                "desc",appinfoConfig.getdesc();
                "maintainer",Map.of(

                )

        );
    }


}
