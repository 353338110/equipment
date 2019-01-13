package com.wcp.equipment.service;

import com.wcp.equipment.pojo.Equipment;
import com.wcp.equipment.pojo.Result;

public interface IEquipment {

    Result createEquipment(String equipmentName,String equipmentDesc, int account,String pic);

    Result deleteEquipment(String equipmentId);

    Result queryEquipment();

    Result changeEquipment(String equipmentId,String equipmentName,String equipmentDesc,int account,String pic);

    Result<Equipment> selectEquipment(String equipmentId);

}
