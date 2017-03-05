package com.sapient;

public class X {

	private int i;
	
	/*public X(){
		System.out.println("In default Constructor of X;");
	}
	*/
	public X(int i){
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	
	private void doSomeThing(String s){
		
		System.out.println(s+" "+i);
		
	}
	
}
