package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    private int countOfEggPM= 55;
    @Override
    int getCountOfEggsPerMonth() {
        return countOfEggPM;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.MOLDOVA +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
