package com.senacor.services.base;

/**
 * Created by WinzingeR on 20.01.2015.
 */
public abstract class MSService {
    public abstract String getDescription();

    protected void signalOnline() {
        System.out.println(this.getClass().getSimpleName()+" is online now");
    }
}
