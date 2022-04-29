package com.company;

public class PairOfDice {
    Die dice1 = new Die();
    Die dice2 = new Die();

    public Die getDice1() {
        return dice1;
    }

    public void setDice1(Die dice1) {
        this.dice1 = dice1;
    }

    public Die getDice2() {
        return dice2;
    }

    public void setDice2(Die dice2) {
        this.dice2 = dice2;
    }

    public void rollDice(){
        dice1.roll();
        dice2.roll();
    }

    public int sumOfDie(){
        return dice1.getFaceValue() + dice2.getFaceValue();
    }

    @Override
    public String toString() {
        return "The sum of the die is " + this.sumOfDie() + ".";
    }
}
