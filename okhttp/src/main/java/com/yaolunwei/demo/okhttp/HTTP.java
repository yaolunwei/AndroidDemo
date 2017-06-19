package com.yaolunwei.demo.okhttp;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by bigoat on 17-6-19.
 */

public class HTTP {
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");


    // GET A URL
    public String get(final String url) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();

        return response.body().string();
    }

    // POST TO A SERVER
    private String post(final String url, String json) {
        RequestBody body = RequestBody.create(JSON, json);
        Request request
    }


}
