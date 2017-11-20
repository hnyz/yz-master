package com.yzgaming.util.common;



public class RandomUtil {


	public  static String getRandNum(){
		return String.valueOf((Math.random()*9+1)*100000);
	}
}
