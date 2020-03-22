package fplAPIs;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.apache.log4j.Logger;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class UrlUtils {

    public static Logger LOG = Logger.getLogger(UrlUtils.class);

    private UrlUtils() {
    }

    public static Gson createGson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Gson gson = gsonBuilder.create();
        return gson;
    }

    public static JSONObject connectToUrlAndRetrieveJSON(URL url) {
        //inline will store the JSON data streamed in string format
        String inline = "";
        JSONObject jobj = new JSONObject();
        try {
            //Parse URL into HttpURLConnection in order to open the connection in order to get the JSON data
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //Set the request to GET or POST as per the requirements
            conn.setRequestMethod("GET");
            //Use the connect method to create the connection bridge
            conn.connect();
            //Get the response status of the Rest API
            int responsecode = conn.getResponseCode();
            System.out.println("Response code is: " + responsecode);

            //Iterating condition to if response code is not 200 then throw a runtime exception
            //else continue the actual process of getting the JSON data
            if (responsecode != 200)
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            else {
                //Scanner functionality will read the JSON data from the stream
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }
                System.out.println("\nJSON Response in String format");
                System.out.println(inline);
                //Close the stream when reading the data has been finished
                sc.close();
            }
            //Disconnect the HttpURLConnection stream
            conn.disconnect();
            //JSONParser reads the data from string object and break each data into key value pairs
            JSONParser parse = new JSONParser();
            //Type caste the parsed json data in json object
            jobj = (JSONObject) parse.parse(inline);
            //Store the JSON object in JSON array as objects (For level 1 array element i.e Results)
        } catch (Exception e) {
            LOG.error("Failed to connect/retrieve data from the URL: " + url.toString());
        }
        return jobj;
    }


}
