package com.megadevs.googlesearch;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.megadevs.googlesearch.entities.GoogleResults;

/**
 * Google Search engine
 * @author ziby
 */
public class GoogleSearch {
	
	public static String CHAR_SET = "UTF-8";
	public static String GOOGLE_API_URL = "https://www.googleapis.com/customsearch/v1?";
	
	private String APIKey;
	private String customSearchEngineID;
	private HashMap<String,String>extraParams;

	/**
	 * Create a GoogleSearch with the specified api and cx
	 * @param APIkey your Google API key
	 * @param cx your Google Custom Search Engine id
	 */
	public GoogleSearch(String APIkey, String cx){
		this.APIKey = APIkey;
		customSearchEngineID = cx;
	}
	
	
	/**
	 * Index of the first result.
	 * @param start a number between 1 and 101-num (where <b>num</b> is the number of results to return)
	 */
	public void setStartIndexOfResult(int start){
		if(start<1)start=1;
		else if(start>101-getNumberOfResults())start=101-getNumberOfResults();
		
		addPair("start", ""+start);
	}
	
	/**
	 * Set how many results return. 
	 * @param n an integer between 1 and 10 (max). 
	 */
	public void setNumberOfResults(int n){
		if(n<1)n=1;
		else if(n>10)n=10;
		
		addPair("num", ""+n);
	}
	
	/**
	 * Add a custom extra params to the query (Read Google api docs https://developers.google.com/custom-search/v1/using_rest)
	 * @param key
	 * @param value
	 */
	public void addExtraParam(String key, String value){
		if(key!=null && value!=null)
			addPair(key, value);
	}
	
	/**
	 * Remove all extra params
	 */
	public void clearExtraParams(){
		extraParams = null;
	}
	
	
	private void addPair(String k, String v){
		if(extraParams == null) extraParams=new HashMap<String, String>();
		extraParams.put(k, v);
	}
	
	private String generateExtraParams(){
		String params ="";
		
		if(extraParams !=null){
			for(Entry<String, String> e  : extraParams.entrySet())
				params += "&"+e.getKey()+"="+e.getValue();
		}
		
		return params;
	}
	
	
	/**
	 * Search using the specified keywords
	 * @param keywords
	 * @return
	 */
	public GoogleResults search(String keywords){
		if(keywords==null)return null;
		
		String google = GOOGLE_API_URL+"&key="+APIKey+"&cx="+customSearchEngineID+generateExtraParams()+"&q=";
		URL url;
		try {
			url = new URL(google + URLEncoder.encode(keywords, CHAR_SET));
			Reader reader = new InputStreamReader(url.openStream(), CHAR_SET);
			GoogleResults results = new Gson().fromJson(reader, GoogleResults.class);
			return results;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}


	public String getCustomSearchEngineID() {
		return customSearchEngineID;
	}

	public void setCustomSearchEngineID(String customSearchEngineID) {
		this.customSearchEngineID = customSearchEngineID;
	}

	public String getAPIKey() {
		return APIKey;
	}

	public void setAPIKey(String aPIKey) {
		APIKey = aPIKey;
	}

	/**
	 * Get how many result will be returned
	 * @return
	 */
	public int getNumberOfResults() {
		if(extraParams!=null){
			String r= extraParams.get("num");
			if(r!=null)return Integer.parseInt(r);
		}
		return 10;
	}


}
