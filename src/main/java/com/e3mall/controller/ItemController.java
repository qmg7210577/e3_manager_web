package com.e3mall.controller;

import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qimenggao on 2017/12/19.
 */
@Controller
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/query/{id}")
    @ResponseBody
    public TbItem selectByPrimaryKey(@PathVariable("id") Long id){


        System.out.println("id============="+id);
        return itemService.selectByPrimaryKey(id);
    }

}
