package com.company.HandlerExtensions;

import com.company.Handler;
import com.company.Request;

public class AdditionHandler extends Handler {

    public AdditionHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public int calculate(Request request) {
        return request.n1 + request.n2;
    }

    public void process(Request request){
        if(request.symbol == '+'){
            System.out.println(calculate(request));
        }else{
            super.process(request);
        }
    }




}
