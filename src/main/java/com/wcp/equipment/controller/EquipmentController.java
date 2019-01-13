package com.wcp.equipment.controller;

import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@CrossOrigin( maxAge = 3600)
@Controller
@RequestMapping("/equipment")
public class EquipmentController {
    @Autowired
    private IEquipment iEquipment;

    @RequestMapping("/create")
    @ResponseBody
    public Result createEquipment(String equipmentName,String equipmentDesc, int account, String pic){
        return iEquipment.createEquipment(equipmentName,equipmentDesc,account,pic);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result Equipment(@RequestParam  String equipmentId) {
        if (null!=equipmentId && !"".equals(equipmentId)){
            return iEquipment.deleteEquipment(equipmentId);
        }else {
            return new Result(0,"装备ID不能为空");
        }

    }

    @RequestMapping("/query")
    @ResponseBody
    public Result queryEquipment() {
        return iEquipment.queryEquipment();
    }

    @RequestMapping("/change")
    @ResponseBody
        public Result changeEquipment(@RequestParam String equipmentId, String equipmentName, String equipmentDesc, int account, String pic,int maxSuccess) {
        if (null!=equipmentId && !"".equals(equipmentId)){
            return iEquipment.changeEquipment(equipmentId,equipmentName,equipmentDesc,account,pic);
        }else {
            return new Result(0,"装备ID不能为空");
        }
    }
}
