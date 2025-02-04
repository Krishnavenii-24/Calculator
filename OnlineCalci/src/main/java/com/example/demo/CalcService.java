package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double add(double n1,double n2) {
    	return n1+n2;
    }
    public double sub(double n1,double n2) {
    	return n1-n2;
    }
    public double mul(double n1,double n2) {
    	return n1*n2;
    }
    public double div(double n1,double n2) {
    	return n1/n2;
    }

}
