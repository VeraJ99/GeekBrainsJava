package Homework6;


import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

//http://dataservice.accuweather.com/forecasts/v1/daily/5day/

public class AccuWeather {

    public static void main(String[] args) throws IOException {
        AccuWeather accuWeather = new AccuWeather();
        accuWeather.getWeather();
    }

    private static final String PROTOCOL = "http";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "lx56GG6SoZfK8PefR785jkBn6L21R4EO";
    private static final String API_KEY_QUERY_PARAM = "apikey";


    private static OkHttpClient okHttpClient = new OkHttpClient();

// Moscow id = 294021

    public void getWeather() throws IOException {

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(FORECASTS)
                .addPathSegment(VERSION)
                .addPathSegment(DAILY)
                .addPathSegment(FIVE_DAY)
                .addPathSegment("294021")
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .build();

        Response fiveDayForecastResponse = okHttpClient.newCall(request).execute();
        String weatherResponse = fiveDayForecastResponse.body().string();
        System.out.println(weatherResponse);

    }
}