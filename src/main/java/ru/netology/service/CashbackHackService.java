package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    /*
    Метод реализован: если сумма является негативной (с минусом), вывод сообщения "Wrong amount entered:".
    Не равно 1000, вывод недостающей суммы.
    Равно 1000, вывод 0.
     */
    public int remain(int amount) {
        if (amount <= 0) {
            throw new NotFoundException(amount);
        }

        if (amount != 1000) {
            return boundary - amount % boundary;
        } else {
            return amount = 0;
        }
    }

}