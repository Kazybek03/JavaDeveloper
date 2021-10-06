package com.company;

public class Main {
    public static void main(String[] args) {

        Devoloper devoloper = new JavaTeamLead(new SeniorJavaDevoloper(new JavaDevoloper()));

        System.out.println(devoloper.makeJob());
    }
}

