package com.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

import java.net.URISyntaxException;



public class OpenMeteoClient {

    public static final String openMeteoUrl = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m";

    public HttpResponse getWeather() throws URISyntaxException, IOException, InterruptedException {
        HttpGet request = new HttpGet(openMeteoUrl);
        /*HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(openMeteoUrl))
                .GET()
                .build();*/
        HttpClient client = new DefaultHttpClient();

        return client.execute(request);

        //return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
    }

}
