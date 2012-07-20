
package com.megadevs.googlesearch.entities;

import java.util.List;

public class NextPage{
   	private Number count;
   	private String cx;
   	private String inputEncoding;
   	private String outputEncoding;
   	private String safe;
   	private String searchTerms;
   	private Number startIndex;
   	private String title;
   	private String totalResults;

 	public Number getCount(){
		return this.count;
	}
	public void setCount(Number count){
		this.count = count;
	}
 	public String getCx(){
		return this.cx;
	}
	public void setCx(String cx){
		this.cx = cx;
	}
 	public String getInputEncoding(){
		return this.inputEncoding;
	}
	public void setInputEncoding(String inputEncoding){
		this.inputEncoding = inputEncoding;
	}
 	public String getOutputEncoding(){
		return this.outputEncoding;
	}
	public void setOutputEncoding(String outputEncoding){
		this.outputEncoding = outputEncoding;
	}
 	public String getSafe(){
		return this.safe;
	}
	public void setSafe(String safe){
		this.safe = safe;
	}
 	public String getSearchTerms(){
		return this.searchTerms;
	}
	public void setSearchTerms(String searchTerms){
		this.searchTerms = searchTerms;
	}
 	public Number getStartIndex(){
		return this.startIndex;
	}
	public void setStartIndex(Number startIndex){
		this.startIndex = startIndex;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
 	public String getTotalResults(){
		return this.totalResults;
	}
	public void setTotalResults(String totalResults){
		this.totalResults = totalResults;
	}
}
