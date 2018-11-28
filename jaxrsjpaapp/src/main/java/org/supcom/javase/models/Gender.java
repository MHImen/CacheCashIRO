package org.supcom.javase.models;

public enum Gender {
    Male("Male"),Female("Female");
    private final String userGender;

    Gender(String userGender){
        this.userGender=userGender;
        }
    public String getUserGender() {
        return userGender;
    }

    @Override
    public String toString() {
        return userGender;
    }
}
