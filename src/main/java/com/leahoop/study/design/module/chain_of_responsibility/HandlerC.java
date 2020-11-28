package com.leahoop.study.design.module.chain_of_responsibility;

public class HandlerC extends Handler{
    @Override
    String handleRequest(String msg) {
        if (msg.contains("$")) {
            msg = msg.replace("$", "+");
        } else {
            msg = this.successor.handleRequest(msg);
        }
        return msg;
    }
}
