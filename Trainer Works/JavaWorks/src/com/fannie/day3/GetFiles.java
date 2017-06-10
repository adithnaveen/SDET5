package com.fannie.day3;

import java.io.File;

public class GetFiles {
	public static void main(String[] args) {
		File f = new File("fannie");

		File files [] = f.listFiles();
		for(File temp : files){
			System.out.println(temp.getName());
		}

	}
}
