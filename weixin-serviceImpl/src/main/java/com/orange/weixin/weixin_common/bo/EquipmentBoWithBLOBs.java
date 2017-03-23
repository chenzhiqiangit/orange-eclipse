package com.orange.weixin.weixin_common.bo;

public class EquipmentBoWithBLOBs extends EquipmentBo {
    private String remarks;

    private String equipmentBindingRecord;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getEquipmentBindingRecord() {
        return equipmentBindingRecord;
    }

    public void setEquipmentBindingRecord(String equipmentBindingRecord) {
        this.equipmentBindingRecord = equipmentBindingRecord == null ? null : equipmentBindingRecord.trim();
    }
}