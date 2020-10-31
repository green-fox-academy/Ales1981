package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
    private static int nextId = 1;
    private int accountId;

    private String name;
    private int balance;
    private String animalType;
    private boolean isKing;
    private boolean isGoodGuy;

    public BankAccount() {
    }

    public BankAccount(String name, int balance, String animalType , boolean isKing , boolean isGoodGuy) {
        this.accountId = nextId++;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGoodGuy = isGoodGuy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        BankAccount.nextId = nextId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public boolean getIsKing() {
        return isKing;
    }

    public void setIsKing(boolean king) {
        isKing = king;
    }

    public boolean getIsGoodGuy() {
        return isGoodGuy;
    }

    public void setIsGoodGuy(boolean goodGuy) {
        isGoodGuy = goodGuy;
    }

    public void increaseBalance(){
        if (isKing){
            balance +=100;
        }else {
            balance +=10;
        }

    }
}
