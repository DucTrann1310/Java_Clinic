package com.personal.enums;

public enum EGender {

    MALE("Male"),
    FEMALE("Female");

    private final String value;

    EGender(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public static EGender getEGender(String name){
        for(EGender eGender : values()){
            if(eGender.getValue().equals(name)){
                return eGender;
            }
        }
        throw new IllegalArgumentException("Gender is not valid");
    }
}
