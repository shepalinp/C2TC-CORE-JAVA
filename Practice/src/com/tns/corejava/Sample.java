package com.tns.corejava;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		do
		{
			x++;//148
			System.out.println(x);
			if(++x<5)//2...true false
				continue;
			x++;
			System.out.println(x);
			
		}while(++x<10);
		}

	}


