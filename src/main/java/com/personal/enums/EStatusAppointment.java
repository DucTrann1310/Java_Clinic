package com.personal.enums;

public enum EStatusAppointment {

    REVERSED("Reversed"),
    ACCEPTED("Accepted"),
    CANCEL("Cancel"),
    COMPLETED("Completed");

    private final String value;

    EStatusAppointment(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static EStatusAppointment getEStatusAppointment(String name) {
        for (EStatusAppointment eStatusAppointment : values()) {
            if (eStatusAppointment.getValue().equals(name)) {
                return eStatusAppointment;
            }
        }
        throw new IllegalArgumentException("Reservation type is not valid");
    }
}
