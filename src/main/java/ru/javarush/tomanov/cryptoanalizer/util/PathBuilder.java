package ru.javarush.tomanov.cryptoanalizer.util;

import ru.javarush.tomanov.cryptoanalizer.constant.Const;

import java.nio.file.Path;

public class PathBuilder {

    private PathBuilder() {
    }

    public static Path get(String filename) {
        Path path = Path.of(filename);
        return path.isAbsolute()
                ? path
                : Path.of(Const.TXT_FOLDER + filename);
    }

}
