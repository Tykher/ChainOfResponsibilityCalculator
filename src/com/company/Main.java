package com.company;

import com.company.HandlerExtensions.AdditionHandler;
import com.company.HandlerExtensions.DivisionHandler;
import com.company.HandlerExtensions.MultiplicationHandler;
import com.company.HandlerExtensions.SubtractionHandler;

public class Main {

    public static void main(String[] args) {
	Handler chain = new AdditionHandler(new SubtractionHandler(new MultiplicationHandler(new DivisionHandler(null))));

    }
}
