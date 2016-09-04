package com.whispon.constructProcessing;

/**
 * Created by noriakioshita on 2016/09/04.
 */
public class NetWorkException extends Exception {
    public String getDetailMessage() {
        return detailMessage;
    }

    String detailMessage;
    public NetWorkException(String detailMessage){
        this.detailMessage = detailMessage;
    }

    public NetWorkException(Throwable throwable){
        super(throwable);
    }
}
