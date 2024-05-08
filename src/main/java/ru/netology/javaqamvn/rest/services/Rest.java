package ru.netology.javaqamvn.rest.services;

public class Rest {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; //месяцы отдыха
        int money = 0; //сумма в наличии
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
