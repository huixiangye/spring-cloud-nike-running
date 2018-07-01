package demo.model;

/**
 * Created by yehuixiang on 6/29/18.
 */

import lombok.Data;

@Data
public class MedicalInfo {
    private long medicalInfoId;
    private String bandMake;
    private String medicalInfoClassification;
    private String description;
    private String aidInstructions;

    public MedicalInfo(){

    }
}