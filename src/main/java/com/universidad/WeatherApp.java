package com.universidad;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class WeatherApp {

    public static String getRecommendation(int temperature, String weather) {
        if (weather.equals("soleado") && temperature >= 30) {
            return "Lleva gorra y protector solar";
        } else if (weather.equals("soleado") && temperature >= 25) {
            return "Perfecto para hacer un picnic";
        } else if (weather.equals("lluvioso") && temperature < 10) {
            return "Abrígate y lleva paraguas";
        }
        return "Disfruta tu día";
    }

    public static boolean isWeatherSafeForJogging(int temperature, String weather) {
        if (temperature > 0 && temperature < 30 && !weather.equals("lluvioso") && !weather.equals("nevado")) {
            return true;
        }
        return false;
    }

}


