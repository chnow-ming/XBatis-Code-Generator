package com.raycloud.util.daogen.test;
import com.squareup.okhttp.*;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

import net.sf.json.JSONObject;
 

/**
 * okhttp
 * @author wushaoming
 * 2016年7月18日
 */
public class HttpUtil {
 
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static final MediaType HTTP = MediaType.parse("application/x-www-form-urlencoded;charset=UTF-8");
    public static final MediaType XML = MediaType.parse("application/xml; charset=utf-8");
    private static HttpUtil instance;
    private OkHttpClient client;
 
    private HttpUtil() {
        client = new OkHttpClient();
        client.setConnectTimeout(20, TimeUnit.SECONDS);//设置请求超时，20s
        client.setReadTimeout(20, TimeUnit.SECONDS);//设置读取超时，20s
        client.setWriteTimeout(20, TimeUnit.SECONDS);//设置写入超时，20s
    }
 
    public static HttpUtil getInstance() {
        return instance == null ? instance = new HttpUtil() : instance;
    }
 
    public static void main(String[] args) throws Exception {
        String post = HttpUtil.getInstance().post("http://192.168.16.115:8080/logistic-front/group/addGroup?userId=50&token=222", "{\"name\":\"试一下\"}");
        System.out.println("第二种方法："+post);
        JSONObject json = new JSONObject();
        json.put("account", "13729817965");
        json.put("password", "123456");
        json.put("phoneModel", "pro5");
        json.put("phoneMac", "D123456");
        String method = "login";
        String post2 = HttpUtil.getInstance().post2("http://192.168.16.217:8080/logistic/app/member/login.do",
        		json,method);
        System.out.println("第一种方法："+AESUtil.Decrypt(post2));
    }
 
    /**
     * 提交POST请求
     *
     * @param url       地址
     * @param mediaType 请求体文本类型
     * @param content   请求体
     * @param headers   请求头
     * @return
     * @throws IOException
     * @throws NoSuchAlgorithmException 
     */
    public String post(String url, MediaType mediaType, String content, String... headers) throws IOException{
        RequestBody body = RequestBody.create(mediaType, content);
        Request.Builder builder = new Request.Builder().url(url);
        if (headers != null && headers.length > 0 && headers.length % 2 == 0) {
            for (int i = 0; i < headers.length - 1; i++)
                if (i % 2 == 0) builder.addHeader(headers[i], headers[i + 1]);
        }
        Request request = builder.post(body).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    /**
     * 提交POST请求
     *
     * @param url       地址
     * @param mediaType 请求体文本类型
     * @param content   请求体
     * @param headers   请求头
     * @return
     * @throws IOException
     * @throws NoSuchAlgorithmException 
     */
    public String post2(String url, MediaType mediaType,  JSONObject obj,String method, String... headers) throws IOException, NoSuchAlgorithmException {
    	String reqType = "Android";
    	String toKen = MD5.getMD5(method + "cz"+reqType);
		StringBuffer params = new StringBuffer();
		String pp = null;
		try {
			pp = AESUtil.Encrypt(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		params.append("czparams").append("=").append(pp).append("&")
				.append("appToken").append("=").append(toKen)
				.append("&").append("reqType").append("=").append(reqType);
    	RequestBody body = RequestBody.create(mediaType, params+"");
    	Request.Builder builder = new Request.Builder().url(url);
    	if (headers != null && headers.length > 0 && headers.length % 2 == 0) {
    		for (int i = 0; i < headers.length - 1; i++)
    			if (i % 2 == 0) builder.addHeader(headers[i], headers[i + 1]);
    	}
    	Request request = builder.post(body).build();
    	Response response = client.newCall(request).execute();
    	return response.body().string();
    }
 
    /**
     * 提交POST请求
     *
     * @param url     地址
     * @param content 请求体
     * @return
     * @throws IOException
     */
    public String post(String url, String content) throws IOException {
        return post(url, HttpUtil.JSON, content, null);
    }
    /**
     * 提交POST请求
     *
     * @param url     地址
     * @param content 请求体
     * @return
     * @throws IOException
     */
    public String post2(String url, JSONObject json,String method) throws IOException {
    	String rs = null;
    	try {
			rs =  post2(url, HttpUtil.HTTP, json,method, null);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return rs;
    }
 
    /**
     * 提交GET请求
     *
     * @param url 地址
     * @return
     * @throws IOException
     */
    public String get(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}