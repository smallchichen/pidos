package com.steven.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


class ConnectLineApi {
	// TODO: Replace the following with your instance ID, Premium Client ID and Secret:
	  private static final String INSTANCE_ID = "YOUR_INSTANCE_ID_HERE";
	  private static final String CLIENT_ID = "1653973699";
	  private static final String CLIENT_SECRET = "e4f9a0cb1333f4b82817dfaa6b34c7fc";
	  private static final String GATEWAY_URL = "https://api.line.me/v2/bot/message/push";
	  private static final String Channel_access_token = "Bearer {}";
	  
	  /**
	   * Entry Point
	   */
	  public static void main(String[] args) throws Exception {
//	    String number = "12025550108";  // Specify the recipient's number (NOT the gateway number) here.
	    String message = "HelloWorld ! Line Message API I coming ...";  // FIXME

	    ConnectLineApi.sendMessage( message);
	  }

	  /**
	   * Sends out a Telegram message via WhatsMate Telegram Gateway.
	   */
	  public static void sendMessage(String message) throws Exception {
	    // TODO: Should have used a 3rd party library to make a JSON string from an object
	    String jsonPayload = new StringBuilder()
	      .append("{")
	      	.append("\"to\":")
	      	.append("\"\"")
	      	.append(",")
	      	.append("\"messages\":[")
	      		.append("{")
	      		.append("\"type\":\"text\",")
	      		.append("\"text\":\"")
	      		.append(message)
	      		.append("\"")
	      		.append("}")
	      .append("]")
	      .append("}")
//	      .append("}")
	      .toString();

	    URL url = new URL(GATEWAY_URL);
	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setDoOutput(true);
	    conn.setRequestMethod("POST");
//	    conn.setRequestProperty("X-WM-CLIENT-ID", CLIENT_ID);
//	    conn.setRequestProperty("X-WM-CLIENT-SECRET", CLIENT_SECRET);
	    conn.setRequestProperty("Content-Type", "application/json");
	    conn.setRequestProperty("Authorization", Channel_access_token);
//	    conn.setRequestProperty("to", CLIENT_ID);
	    
	    OutputStream os = conn.getOutputStream();
	    os.write(jsonPayload.getBytes());
	    os.flush();
	    os.close();

	    int statusCode = conn.getResponseCode();
	    System.out.println("Response from Telegram Gateway: \n");
	    System.out.println("Status Code: " + statusCode);
	    BufferedReader br = new BufferedReader(new InputStreamReader(
	        (statusCode == 200) ? conn.getInputStream() : conn.getErrorStream()
	      ));
	    String output;
	    while ((output = br.readLine()) != null) {
	        System.out.println(output);
	    }
	    conn.disconnect();
	  }
}
