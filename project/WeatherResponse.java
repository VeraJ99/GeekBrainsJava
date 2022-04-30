package Lesson7.project;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherResponse {
    private static final String DATE = "";
    private static final String EPOCHDATE = "";
    private static final String TEMPERATURE = "";
    private static final String DAY = "";
    private static final String NIGHT = "";
    private static final String SOURSES = "";

    WeatherResponse weatherResponse1 = new WeatherResponse();
    private static ObjectMapper objectMapper = new ObjectMapper();

    // {"Headline":{
    // "EffectiveDate":"2022-04-29T07:00:00+03:00",
    // "EffectiveEpochDate":1651204800,
    // "Severity":5,
    // "Text":"Expect showers Friday",
    // "Category":"rain",
    // "EndDate":"2022-04-29T19:00:00+03:00",
    // "EndEpochDate":1651248000,
    // "MobileLink":"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?lang=en-us",
    // "Link":"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?lang=en-us"},


    // "DailyForecasts":[{
    // "Date":"2022-04-28T07:00:00+03:00",
    // "EpochDate":1651118400,
    // "Temperature":{"Minimum":{"Value":34.0,"Unit":"F","UnitType":18},"Maximum":{"Value":49.0,"Unit":"F","UnitType":18}},
    // "Day":{"Icon":6,"IconPhrase":"Mostly cloudy","HasPrecipitation":false},
    // "Night":{"Icon":38,"IconPhrase":"Mostly cloudy","HasPrecipitation":false},
    // "Sources":["AccuWeather"],
    // "MobileLink":"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=1&lang=en-us",
    // "Link":"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=1&lang=en-us"}]}

    public static void main(String[] args) {

//WeatherResponse weatherResponseFromJSON = objectMapper.readValue(weatherResponse1, WeatherResponse.class);

//WeatherResponse weatherResponse1 = objectMapper.readValue(weatherResponseFromJSON, WeatherResponse.class);



       // String weatherFromJSON = objectMapper.writeValueAsString(weatherResponse);
      //  System.out.println(weatherFromJSON);

        //  Car carWithSeatFromJSON = objectMapper.readValue(carWithSeatJSON, Car.class);
        //        System.out.println(carWithSeatFromJSON); //
    }
}
