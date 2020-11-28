package com.leahoop.study.design.module.chain_of_responsibility;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }


    abstract String handleRequest(String msg);
}
