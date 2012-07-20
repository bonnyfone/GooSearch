
package com.megadevs.googlesearch.entities;

import java.util.List;

public class SearchInformation{
   	private String formattedSearchTime;
   	private String formattedTotalResults;
   	private Number searchTime;
   	private String totalResults;

 	public String getFormattedSearchTime(){
		return this.formattedSearchTime;
	}
	public void setFormattedSearchTime(String formattedSearchTime){
		this.formattedSearchTime = formattedSearchTime;
	}
 	public String getFormattedTotalResults(){
		return this.formattedTotalResults;
	}
	public void setFormattedTotalResults(String formattedTotalResults){
		this.formattedTotalResults = formattedTotalResults;
	}
 	public Number getSearchTime(){
		return this.searchTime;
	}
	public void setSearchTime(Number searchTime){
		this.searchTime = searchTime;
	}
 	public String getTotalResults(){
		return this.totalResults;
	}
	public void setTotalResults(String totalResults){
		this.totalResults = totalResults;
	}
}
