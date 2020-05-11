/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httprequests;

/**
 *
 * @author oulis
 */
public class HttpRequests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<2000; i++) {
            new MyHttpRequest("http://34.66.26.200/high-load").start();
        }
    }
    
}
