package httprequests;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oulis
 */
public class MyHttpRequest extends Thread{
    private String url;
    
    public MyHttpRequest(String Url) {
        this.url = Url;
    }
    
    @Override
    public void run() {
        try {
            for (int i=0; i<50; i++) {
                URL url_site = new URL(this.url);
                URLConnection yc = url_site.openConnection();
                BufferedReader in = new BufferedReader(
                                        new InputStreamReader(
                                        yc.getInputStream()));
                /*String inputLine;

                while ((inputLine = in.readLine()) != null) 
                    System.out.println(inputLine);*/
                in.close();
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(MyHttpRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyHttpRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
