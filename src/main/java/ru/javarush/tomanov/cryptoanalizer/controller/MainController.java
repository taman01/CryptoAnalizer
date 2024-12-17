package ru.javarush.tomanov.cryptoanalizer.controller;

import ru.javarush.tomanov.cryptoanalizer.command.Action;
import ru.javarush.tomanov.cryptoanalizer.entity.Result;
import ru.javarush.tomanov.cryptoanalizer.entity.ResultCode;
import ru.javarush.tomanov.cryptoanalizer.exception.AppException;

public class MainController {

    public Result doAction(String actionName, String[] parameters) {
        Action action = ActionContainer.get(actionName);
        try {
            return action.execute(parameters);
        } catch (NumberFormatException | AppException e) {
            return new Result(ResultCode.ERROR, e.getMessage());
        }
    }
}
