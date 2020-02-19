package com.example.testnavigationdrawer.repository;

import com.example.testnavigationdrawer.model.MyWeather;
import com.example.testnavigationdrawer.model.WeatherResponse;
import com.example.testnavigationdrawer.repository.local.LocalDataSource;
import com.example.testnavigationdrawer.repository.remote.RemoteDataSource;

import java.util.Arrays;
import java.util.Collections;

import io.reactivex.Observable;

public class Repository {

    private RemoteDataSource api = RemoteDataSource.getInstance();
    private LocalDataSource db = new LocalDataSource();

    public Observable<WeatherResponse> getWeather(String lat, String lon){
        return api.getWeatherService().getWeather(
                "8c9aa1633f68b7d59b3a520a966ea546",
                lat,
                lon,
                Arrays.asList("minutely", "alert", "flags")
        );
    }
    public void saveWeather(MyWeather weather){

    }
}
