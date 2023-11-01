package com.beds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	
	private static String history=System.lineSeparator();
	
	@GetMapping("/add")
    public String add(@RequestParam int op1, @RequestParam int op2) {
    	String result = op1 + "+" + op2 +"="+ new Double(op1+op2);
    	history = history + result + "<br/>";
        return result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam double op1, @RequestParam double op2) {
    	String result = op1 + "-" + op2 +"="+ (op1-op2);
    	history = history + result + "<br/>";
        return result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam double op1, @RequestParam double op2) {
    	String result = op1 + "*" + op2 +"="+ (op1*op2);
    	history = history + result + "<br/>";
        return result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam double op1, @RequestParam double op2) {
    	String result;

    	if ((int)op2 == 0) {
            result = (op1 + "/" + op2 +"="+ "Infinity");
        } else {
        	result = op1 + "/" + op2 +"="+ (op1/op2);
        }
    	
    	history = history + result + "<br/>";
        return result;
    }
    
    @GetMapping("/history")
    public String history() {
    	return history;
    }
    
    @GetMapping("/clear")
    public String clear() {
    	return history="<br/>";
    }
    
}


