package com.company;

public class JavaTeamLead extends DevoloperDecorator {
    public JavaTeamLead(Devoloper devoloper) {
        super(devoloper);
    }

    public String senweekRepoert() {
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + senweekRepoert();
    }
}
