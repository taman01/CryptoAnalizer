package ru.javarush.tomanov.cryptoanalizer.command;

import ru.javarush.tomanov.cryptoanalizer.constant.Const;
import ru.javarush.tomanov.cryptoanalizer.entity.Result;
import ru.javarush.tomanov.cryptoanalizer.entity.ResultCode;

public class Exit extends AbstractAction{

    @Override
    public Result execute(String[] parameters) {
        return new Result(ResultCode.OK, Const.APPLICATION_CLOSED);
    }

}
