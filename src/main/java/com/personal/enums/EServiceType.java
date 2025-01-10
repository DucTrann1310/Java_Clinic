package com.personal.enums;

public enum EServiceType {

    FOR_MALE("For_Male"),
    FOR_FEMALE("For_Female");
    private final String value;

    EServiceType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public static EServiceType getEServiceType(String name){
        for(EServiceType eServiceType : values()){
            if(eServiceType.getValue().equals(name)){
                return eServiceType;
            }
        }
        throw new IllegalArgumentException("Service type is not valid");
    }
}
