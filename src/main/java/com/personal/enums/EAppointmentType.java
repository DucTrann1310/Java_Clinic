package com.personal.enums;

public enum EAppointmentType {

    FIRST("First"),
    RETURN("Return");

    private final String value;

    EAppointmentType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public static EAppointmentType getEAppointmentType(String name){
        for(EAppointmentType eAppointmentType : values()){
            if(eAppointmentType.getValue().equals(name)){
                return eAppointmentType;
            }
        }
        throw new IllegalArgumentException("Appointment type is not valid");
    }
}
