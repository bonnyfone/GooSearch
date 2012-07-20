
package com.megadevs.googlesearch.entities;

import java.util.List;

public class Pagemap{
   	private List<Cse_image> cse_image;
   	private List<Cse_thumbnail> cse_thumbnail;

 	public List<Cse_image> getCse_image(){
		return this.cse_image;
	}
	public void setCse_image(List<Cse_image> cse_image){
		this.cse_image = cse_image;
	}
 	public List<Cse_thumbnail> getCse_thumbnail(){
		return this.cse_thumbnail;
	}
	public void setCse_thumbnail(List<Cse_thumbnail> cse_thumbnail){
		this.cse_thumbnail = cse_thumbnail;
	}
}
