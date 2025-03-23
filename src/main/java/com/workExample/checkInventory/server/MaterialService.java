package com.workExample.checkInventory.server;


import com.workExample.checkInventory.dataObject.Material;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MaterialService {

    private static Map<String, Material> map= new HashMap<>();

    public Material createMaterial(String name, int kg, long exp){
        Material materel = new Material();
        materel.setName(name);
        materel.setExp(exp);
        materel.setKg(kg);
        map.put(name,materel);
        return materel;
    }

    public Material getMaterial(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }
        return  null;
    }

    //Q:
    public String deleteMaterial(String name){
        if(!map.containsKey(name)){
            return  "delete is not exist";
        }
        map.remove(name);
        return "delete is successed";
    }

}
