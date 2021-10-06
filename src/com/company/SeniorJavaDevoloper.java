package com.company;

class SeniorJavaDevoloper extends DevoloperDecorator {
    public SeniorJavaDevoloper(Devoloper devoloper) {
        super(devoloper);
    }

    public String makeCodeReview() {
        return " Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}

