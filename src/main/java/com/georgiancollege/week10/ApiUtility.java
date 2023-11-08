package com.georgiancollege.week10;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class ApiUtility {
    /*
    This function will parse the json data from a file
    and create object from that
     */
    public static ApiResponse getDataFromFile(String filename){
        ApiResponse response = null;
        Gson gson = new Gson();

        // try with resource block
        try(
                FileReader fileReader = new FileReader(filename);
                JsonReader jsonReader = new JsonReader(fileReader);
                ) {
            response = gson.fromJson(jsonReader, ApiResponse.class);
        } catch (Exception e){
            e.printStackTrace();
        }

        return response;
    }

    /*
    This method will accept search term from the user, and
    will parse the json data from a file
    and create object from that
     */
    public static ApiResponse getDataFromAPI(String searchName){

    }
}
