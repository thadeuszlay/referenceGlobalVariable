package com.example.referenceglobalvariable;

import android.app.Application;

public class GlobalVariable extends Application{

	private int counter;
	
	public int getCounter(){
		return this.counter;
	}
	
	public void setCounter(int newCounter){
		this.counter=newCounter;
	}
	
	public void addCounter(){
		this.counter+=1;
	}
	
	public void resetCounter(){
		this.counter=0;
	}
	
}
