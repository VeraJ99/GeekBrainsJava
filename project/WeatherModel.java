package Lesson7.project;

import java.io.IOException;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period ) throws IOException;
}
 //     26062  Piter      http://dataservice.accuweather.com/forecasts/v1/daily/1day/26062

//http://dataservice.accuweather.com/forecasts/v1/daily/5day/