package com.universidad;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGetRecommendationSunnyAndWarm() {
        assertEquals("Perfecto para hacer un picnic", WeatherApp.getRecommendation(25, "soleado"));
    }

    @Test
    public void testGetRecommendationColdAndRainy() {
        assertEquals("Abrígate y lleva paraguas", WeatherApp.getRecommendation(5, "lluvioso"));
    }

    @Test
    public void testGetRecommendationHotAndSunny() {
        assertEquals("Lleva gorra y protector solar", WeatherApp.getRecommendation(30, "soleado"));
    }

    @Test
    public void testIsWeatherSafeForJoggingSunnyAndMild() {
        assertTrue(WeatherApp.isWeatherSafeForJogging(20, "nublado"));
    }

    @Test
    public void testIsWeatherSafeForJoggingSnowyAndCold() {
        assertFalse(WeatherApp.isWeatherSafeForJogging(-5, "nevado"));
    }

    @Test
    public void testIsWeatherSafeForJoggingRainyAndModerate() {
        assertFalse(WeatherApp.isWeatherSafeForJogging(15, "lluvioso"));
    }

}

