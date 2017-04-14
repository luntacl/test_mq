package com.ulic.common.util;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @Description okhttp
 * Created by liutao on 2017/3/22.
 */
@Slf4j
@Service
public class OkHttpUtil {
    private OkHttpClient client = new OkHttpClient.Builder().connectTimeout(20, TimeUnit.SECONDS).build();
    public static final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("text/x-markdown; charset=utf-8");
    public static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");

    public String get(String url) throws IOException {
        log.info("要访问的url是:{}", url);
        Request request = new Request.Builder().url(url).build();
        return execute(request);
    }

    public String post(String url) throws IOException {
        log.info("要访问的url是:{}", url);
        RequestBody body = RequestBody.create(MEDIA_TYPE_MARKDOWN, "");
        Request request = new Request.Builder().url(url).post(body).build();
        return execute(request);
    }

    public String post(String url,String data) throws IOException {
        log.info("要访问的url是：{} ,post方式提交的json为：{}", url, data);
        RequestBody body = RequestBody.create(MEDIA_TYPE_JSON, data);
        Request request = new Request.Builder().url(url).post(body).build();
        return execute(request);
    }

    private String execute(Request request) throws IOException {
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("error code:" + response);
        }
        ResponseBody responseBody = response.body();
        String result = responseBody.string();
        log.info("调用接口返回结果为：{}", result);
        responseBody.close();
        return result;
    }
}
