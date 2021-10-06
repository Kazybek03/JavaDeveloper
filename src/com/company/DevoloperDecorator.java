package com.company;

public class DevoloperDecorator implements Devoloper {

    Devoloper devoloper;

    public DevoloperDecorator(Devoloper devoloper) {
        this.devoloper = devoloper;
    }

    @Override
    public String makeJob() {
        return devoloper.makeJob();
    }
}

