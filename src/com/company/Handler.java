package com.company;

public abstract class Handler {
    Handler nextHandler;

    public Handler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract int calculate(Request request);

    public void process(Request request){
        if(nextHandler != null)
            nextHandler.process(request);
    }
}
