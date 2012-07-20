
package com.megadevs.googlesearch.entities;

import java.util.List;

public class Items{
   	private String cacheId;
   	private String displayLink;
   	private String formattedUrl;
   	private String htmlFormattedUrl;
   	private String htmlSnippet;
   	private String htmlTitle;
   	private String kind;
   	private String link;
   	private Pagemap pagemap;
   	private String snippet;
   	private String title;

 	public String getCacheId(){
		return this.cacheId;
	}
	public void setCacheId(String cacheId){
		this.cacheId = cacheId;
	}
 	public String getDisplayLink(){
		return this.displayLink;
	}
	public void setDisplayLink(String displayLink){
		this.displayLink = displayLink;
	}
 	public String getFormattedUrl(){
		return this.formattedUrl;
	}
	public void setFormattedUrl(String formattedUrl){
		this.formattedUrl = formattedUrl;
	}
 	public String getHtmlFormattedUrl(){
		return this.htmlFormattedUrl;
	}
	public void setHtmlFormattedUrl(String htmlFormattedUrl){
		this.htmlFormattedUrl = htmlFormattedUrl;
	}
 	public String getHtmlSnippet(){
		return this.htmlSnippet;
	}
	public void setHtmlSnippet(String htmlSnippet){
		this.htmlSnippet = htmlSnippet;
	}
 	public String getHtmlTitle(){
		return this.htmlTitle;
	}
	public void setHtmlTitle(String htmlTitle){
		this.htmlTitle = htmlTitle;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public String getLink(){
		return this.link;
	}
	public void setLink(String link){
		this.link = link;
	}
 	public Pagemap getPagemap(){
		return this.pagemap;
	}
	public void setPagemap(Pagemap pagemap){
		this.pagemap = pagemap;
	}
 	public String getSnippet(){
		return this.snippet;
	}
	public void setSnippet(String snippet){
		this.snippet = snippet;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
}
