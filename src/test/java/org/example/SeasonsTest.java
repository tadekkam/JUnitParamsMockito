package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Month;

import static org.example.Seasons.detectSeason;
import static org.junit.jupiter.api.Assertions.*;
class SeasonsTest {

    @ParameterizedTest
    @ValueSource(ints = {12, 1, 2})
    void testDetectSeasonForWinter(int monthValue) {
        Month month = Month.of(monthValue);
        assertEquals(Seasons.SeasonsOfDeclare.Season.WINTER, detectSeason(month));
    }



}