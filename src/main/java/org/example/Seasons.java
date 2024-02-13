package org.example;

import java.time.Month;

public class Seasons {

    public enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    }


        public static Season detectSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.AUTUMN;
            default:
                throw new IllegalArgumentException("Nieprawidłowy miesiąc: " + month);
        }
    }




}
