package com.company;

import com.company.HandlerExtensions.AdditionHandler;
import com.company.HandlerExtensions.DivisionHandler;
import com.company.HandlerExtensions.MultiplicationHandler;
import com.company.HandlerExtensions.SubtractionHandler;

public class Main {

    public static void main(String[] args) {
	Handler chain = new AdditionHandler(new SubtractionHandler(new MultiplicationHandler(new DivisionHandler(null))));
    Request addition = new Request(5,5,'+');
    Request subtraction = new Request(5,5,'-');
    Request multiplication = new Request(5,5,'*');
    Request division = new Request(5,5,'/');
    chain.process(addition);
    chain.process(subtraction);
    chain.process(multiplication);
    chain.process(division);
    }
}
