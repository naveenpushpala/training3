package com.sapient;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) 
			throws Exception {
		
		Class c = Class.forName("com.sapient.X");
//		X x = (X) c.newInstance();
		Constructor constructor=c.getConstructor(int.class);
//		Constructor constructor1=c.getDeclaredConstructor(int.class);
//		constructor1.setAccessible(true);
//		X x =(X) c.newInstance();
		X x1  = (X) constructor.newInstance(123);
		Method m = c.getDeclaredMethod("doSomeThing", String.class);
//		Method m = c.getDeclaredMethod ("doSomeThing", String.class);
		m.setAccessible(true);
		m.invoke(x1, "ABCD");
		
	}
}
