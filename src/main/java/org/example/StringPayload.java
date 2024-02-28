package org.example;

import org.json.JSONObject;

public class StringPayload {
    public static void main(String[] args) {


    }

    public static String graphqlToJson(String payload) {
        JSONObject json = new JSONObject();
        json.put("query", payload);
        return json.toString();
    }

}