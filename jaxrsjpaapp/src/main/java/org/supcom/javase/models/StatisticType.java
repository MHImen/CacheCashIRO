package org.supcom.javase.models;

public enum StatisticType {
    today("today"),week("week"),month("month"),year("year");
    private final String statistiqueType;

    StatisticType(String statistiqueType){
        this.statistiqueType=statistiqueType;
    }
    public String getStatistiqueType() {
        return statistiqueType;
    }

    @Override
    public String toString() {
        return statistiqueType;
    }
}
