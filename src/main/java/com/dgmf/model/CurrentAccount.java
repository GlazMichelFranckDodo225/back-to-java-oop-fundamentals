package com.dgmf.model;

public class CurrentAccount extends BankAccount {
    private double overDraft;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(String currency, double initialBalance, double overDraft) {
        super(currency, initialBalance);
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return "Current Account Overdraft : " + this.overDraft + super.toString();
    }

    @Override
    public String getType() {
        return "CURRENT ACCOUNT";
    }
}
