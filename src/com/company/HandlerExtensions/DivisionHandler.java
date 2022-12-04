package com.company.HandlerExtensions;

import com.company.Handler;
import com.company.Request;

public class DivisionHandler extends Handler {

    public DivisionHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public int calculate(Request request) {
        return request.n1 / request.n2;
    }

    public void process(Request request){
        if(request.symbol == '/'){
            calculate(request);
        }else{
            super.process(request);
        }
    }




}
