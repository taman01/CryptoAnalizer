package ru.javarush.tomanov.cryptoanalizer.command;

import ru.javarush.tomanov.cryptoanalizer.entity.Result;

public interface Action {

    Result execute(String[] parameters);

}
