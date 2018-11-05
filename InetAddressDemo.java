package com.java8.javawithjavascript;

import java.net.InetAddress;

public class InetAddressDemo {

	public static void main(String[] args){  
		try{  
		InetAddress ip=InetAddress.getByName("0917-2505");  
		System.out.println("Host Name: "+ip.getHostName());  
		System.out.println("IP Address: "+ip.getHostAddress());  
		}catch(Exception e){System.out.println(e);}  
		}  
		}  