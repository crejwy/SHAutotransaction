package com.controller;

import com.service.ToolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/18.
 */
@Controller
@RequestMapping("tool")
public class ToolController {
    @Autowired
    private ToolServiceImpl toolService;
    @RequestMapping("addTool")
    public void  addTool(){
        toolService.AddTools();
    }
}
