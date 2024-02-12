package org.example;

import java.time.Month;

public class Seasons {
    public static class SeasonsOfDeclare {
        enum Season {
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN
        }
    }


    public static SeasonsOfDeclare.Season detectSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return SeasonsOfDeclare.Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return SeasonsOfDeclare.Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return SeasonsOfDeclare.Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return SeasonsOfDeclare.Season.AUTUMN;
            default:
                throw new IllegalArgumentException("Nieprawidłowy miesiąc: " + month);
        }
    }




}
