package ru.netology.service;

public class NotFoundException extends RuntimeException {

    //Внесение негативной суммы
    public NotFoundException(int amount) {
        super("Wrong amount entered: " + amount);
    }
}
