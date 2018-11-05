package com.java8.javawithjavascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EmbeddedJavascript_into_Java {

	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub
		
		   // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Evaluating Nashorn code  
        ee.eval("print('Hello Nashorn');");  

	}

}
