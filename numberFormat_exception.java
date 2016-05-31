package com.acadgild.assignment.numberFormat.exception;

public class numberFormat_exception {
	
	public static void main(String[] args) {
		
		try{
			int num=Integer.parseInt ("XYZ"); 
		}
		catch(NumberFormatException e){
			System.out.println("The string cannot be parsed to int "+e);
		}
	}
}
