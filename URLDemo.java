package com.java8.javawithjavascript;

import java.net.*;  
public class URLDemo{  
	public static void main(String[] args){    
		try{    
		URL url=new URL("https://www.google.com");    
		HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
		for(int i=1;i<=8;i++){  
		System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
		}  
		huc.disconnect();   
		}catch(Exception e){System.out.println(e);}    
		}    
		}