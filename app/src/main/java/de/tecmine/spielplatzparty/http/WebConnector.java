package de.tecmine.spielplatzparty.http;

import java.net.URL;
import java.net.URLConnection;

public class WebConnector implements Runnable {

    private String json;
    private String uri;

    public WebConnector(String uri){
        this.uri = uri;
    }

    public void run(){

        try{

            URL url = new URL(this.uri);
            URLConnection urlConnection = url.openConnection();



        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public String get(){
        return this.json;
    }

}
