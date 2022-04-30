package Lesson7.project;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AccuWeatherModel implements WeatherModel {

    //          http://dataservice.accuweather.com/forecasts/v1/daily/1day/26062

    private static final String PROTOCOL = "http";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String NOW = "1day" ;
    private static final String FIVE_DAYS = "5day";
    private static final String API_KEY = "lx56GG6SoZfK8PefR785jkBn6L21R4EO";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String LOKATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static OkHttpClient okHttpClient = new OkHttpClient();
    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void getWeather(String selectedCity, Period period) throws IOException {
        switch (period) {
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(NOW)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayForecastResponse.body().string();
                System.out.println(weatherResponse);

              //  JsonNode jsonNode = objectMapper.readTree(weatherResponse);
               // JsonNode jsonNode1 = jsonNode.at("/DailyForecasts").get(0).;
              //  JsonNode at = jsonNode1.at("/IconPhrase");
              //  String getWeatherHuman = at.asText();
         // System.out.println(getWeatherHuman);
                break;

//Сделать человекочитаемый вывод погоды. Выбрать параметры на свое усмотрение

            case FIVE_DAYS:
                HttpUrl httpUrl1 = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAYS)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request1 = new Request.Builder()
                        .url(httpUrl1)
                        .build();

                Response fiveDaysForecastResponse = okHttpClient.newCall(request1).execute();
                String weatherResponse1 = fiveDaysForecastResponse.body().string();
                System.out.println(weatherResponse1);
             break;

        }
    }

    private String detectCityKey(String selectedCity) throws IOException {
      //  http://dataservice.accuweather.com/locations/v1/cities/autocomplete

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(LOKATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectedCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response cityResponse = okHttpClient.newCall(request).execute();
        String weatherResponse = cityResponse.body().string();
        //System.out.println(weatherResponse);

  String cityKey = objectMapper.readTree(weatherResponse).get(0).at("/Key").asText();
        //System.out.println(cityKey);

return cityKey;
    }


    public static void main(String[] args) throws IOException {
        //AccuWeatherModel accuWeatherModel = new AccuWeatherModel();
        //accuWeatherModel.detectCityKey("Moscow");
        // accuWeatherModel.getWeather("Moscow", Period.NOW);

        UserInterfaseView userInterfaseView = new UserInterfaseView();
        userInterfaseView.runInterfase();
    }
}
