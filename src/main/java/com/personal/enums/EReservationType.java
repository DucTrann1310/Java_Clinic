package com.personal.enums;

public enum EReservationType {

    NOW("Now"),
    LATER("Later");

    private final String value;

    EReservationType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public static EReservationType getEReservationType(String name){
        for(EReservationType eReservationType : values()){
            if(eReservationType.getValue().equals(name)){
                return eReservationType;
            }
        }
        throw new IllegalArgumentException("Reservation type is not valid");
    }
}
