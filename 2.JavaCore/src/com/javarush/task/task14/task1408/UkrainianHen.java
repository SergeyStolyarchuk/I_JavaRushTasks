package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    private int countOfEggPM= 20;
    @Override
    int getCountOfEggsPerMonth() {
        return countOfEggPM;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.UKRAINE +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
