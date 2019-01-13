package com.wcp.equipment.service.impl;

import com.wcp.equipment.dao.EquipmentMapper;
import com.wcp.equipment.pojo.Equipment;
import com.wcp.equipment.pojo.EquipmentExample;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IEquipment;
import com.wcp.equipment.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentImpl implements IEquipment {

    @Autowired
    private EquipmentMapper equipmentMapper;
    @Override
    public Result createEquipment(String equipmentName,String equipmentDesc, int account, String pic) {
        Equipment equip = new Equipment();
        equip.setId(UUID.getAccountIdByUUId());
        equip.setCount(account);
        equip.setEquipmentname(equipmentName);
        if (null!=equipmentDesc && !"".equals(equipmentName)){
            equip.setEquipmentdesc(equipmentDesc);
        }
        if (null!=pic && !"".equals(pic)){
            equip.setPic(pic);
        }
        int i = equipmentMapper.insertSelective(equip);
        if (i>0){
            return new Result();
        }else {
            return new Result(1,"增加装备插入数据库失败");
        }
    }

    @Override
    public Result deleteEquipment(String equipmentId) {
        int i = equipmentMapper.deleteByPrimaryKey(equipmentId);
        if (i>0){
            return new Result();
        }else {
            return new Result(1,"删除装备失败");
        }
    }

    @Override
    public Result queryEquipment() {
        EquipmentExample equipmentExample = new EquipmentExample();
        EquipmentExample.Criteria criteria = equipmentExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Equipment> equipments = equipmentMapper.selectByExample(equipmentExample);
        if (null!=equipments && equipments.size()>0){
            return new Result<List<Equipment>>(equipments);
        }else {
            return new Result(1,"查询装备失败");
        }
    }

    @Override
    public Result changeEquipment(String equipmentId, String equipmentName, String equipmentDesc, int account, String pic) {
        Equipment equipment = equipmentMapper.selectByPrimaryKey(equipmentId);
        if (null!=equipment && null!= equipment.getId()){
            if (null!=pic && !"".equals(pic)){
                equipment.setPic(pic);
            }
            if (null!=equipmentName && !"".equals(equipmentName)){
                equipment.setEquipmentname(equipmentName);
            }
            if (null!=equipmentDesc && !"".equals(equipmentDesc)){
                equipment.setEquipmentdesc(equipmentDesc);
            }
            if (account>0){
                equipment.setCount(account);
            }

            int i = equipmentMapper.updateByPrimaryKey(equipment);
            if (i>0){
                return new Result();
            }else {
                return new Result(1,"更新装备失败");
            }
        }else {
            return new Result(0,"查询不到该装备");
        }
    }

    @Override
    public Result<Equipment> selectEquipment(String equipmentId) {
        Equipment equipment = equipmentMapper.selectByPrimaryKey(equipmentId);
        return new Result<>(equipment);
    }

}
