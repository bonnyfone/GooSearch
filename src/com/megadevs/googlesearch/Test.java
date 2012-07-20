package com.megadevs.googlesearch;
import java.net.URISyntaxException;
import java.util.List;

import com.megadevs.googlesearch.entities.GoogleResults;
import com.megadevs.googlesearch.entities.Items;

/**
 * Example class
 * @author ziby
 */
public class Test {
	public static void main(String[] args) throws URISyntaxException {
		String apiKey ="your api key here!";
		String cx = "your custom search engine id here!";

		//Create a new GoogleSearch object
		GoogleSearch s = new GoogleSearch(apiKey, cx);
		
		//Set some params
		s.setNumberOfResults(5);
		s.setStartIndexOfResult(13);
		
		//Set extra params: this is an example of how to add an extra param
		//watch https://developers.google.com/custom-search/v1/using_rest
		
		//s.addExtraParam("num", "5");
		
		
		//run the search
		GoogleResults r = s.search("github");
		
		//print results
		List<Items> items = r.getItems();
		for(Items i:items) System.out.println(i.getLink());
		
	}
}
