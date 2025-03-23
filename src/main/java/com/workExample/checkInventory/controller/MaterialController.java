package com.workExample.checkInventory.controller;

import com.workExample.checkInventory.dataObject.Material;
import com.workExample.checkInventory.server.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("api/materail/{name}")
    public Material getMaterel(@PathVariable("name") String name){
        //@PathVariable 表示spring會到endpoint用{name}這個變數
        // 拿來當傳入getMaterel()這個方法的參數=>String name
        return materialService.getMaterial(name);
    }

    @PostMapping("api/materail")
    public Material createMaterial(@RequestBody Material request){
        //@RequestBody 指POST 方法帶進來的參數
        return materialService.createMaterial(request.getName(), request.getKg(), request.getExp());
    }

    @DeleteMapping("api/materail/{name}")
    public String createMaterial(@PathVariable("name") String name){
        //@RequestBody 指POST 方法帶進來的參數
        return materialService.deleteMaterial(name);
    }



}
