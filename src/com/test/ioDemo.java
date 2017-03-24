package com.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class ioDemo {
	@Test
	public void intputStreamdemo() throws IOException{
		FileInputStream fis=new FileInputStream("d:/asd.txt");
		byte[]  by=new byte[fis.available()/2];
		fis.read(by);
		System.out.println(new String(by));
		System.out.println("===");
		fis.read(by);
		System.out.println(new String(by));
//		byte[]  by=new byte[1];
//		int i = 0;
//		int j = 0;
//		while ((i = fis.read(by))!=-1) {
//			System.out.println(new String(by));
//			j++;
//			if(j>(fis.available()+1)/2){
//				break;
//			}
//		}
//		System.out.println("-------------");
//		while ((i = fis.read(by))!=-1) {
//			System.out.println(new String(by));
//		}
//		fis.close();
	}
}
