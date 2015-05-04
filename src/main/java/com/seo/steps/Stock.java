package com.seo.steps;

public class Stock {
	
	private String name;
	private double val;
	private String status="OFF";
	
	public Stock(String str,double val){
		this.name=str;
		this.val=val;
	}
	
	public void tradeAt(double val){
		if(val>=10)
			status="ON";
		else
			status="OFF";
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
