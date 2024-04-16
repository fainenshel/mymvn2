package ru.netology.services;

public class MyService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int count = 0; // счётчик месяцев отдыха
        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц: " + month + ". Денег: " + money + " ");
            if (money >= threshold) { // можем ли отдыхать?
                System.out.print("Буду отдыхать.");
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                int restExpenses = money - money / 3;
                money = money / 3;
                System.out.print("Потратил -"+ expenses + ", затем ещё -" + restExpenses);
            } else {
                System.out.print("Придётся работать. Заработал +" + income + ", потратил -"+expenses);
                money = money + income - expenses;
            }
            System.out.println();
        }
        return count;
    }
}
