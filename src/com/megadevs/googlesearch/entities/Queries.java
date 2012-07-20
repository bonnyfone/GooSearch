
package com.megadevs.googlesearch.entities;

import java.util.List;

public class Queries{
   	private List<NextPage> nextPage;
   	private List<Request> request;

 	public List<NextPage> getNextPage(){
		return this.nextPage;
	}
	public void setNextPage(List<NextPage> nextPage){
		this.nextPage = nextPage;
	}
 	public List<Request> getRequest(){
		return this.request;
	}
	public void setRequest(List<Request> request){
		this.request = request;
	}
}
