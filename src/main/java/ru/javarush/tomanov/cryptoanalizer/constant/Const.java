package ru.javarush.tomanov.cryptoanalizer.constant;

import java.io.File;

public class Const {

   public static String ENCODE = "encode";
   public static String DECODE = "decode";
   public static String BRUTEFORCE = "bruteforce";
   public static String ANALYZE = "analyze";

   public static String TXT_FOLDER = System.getProperty("user.dir") +
            File.separator +
            "text" +
            File.separator;

   public static String NOT_FOUND_ACTION_FORMAT = "not found action: %s";
   public static String INCORRECT_FILE = "Incorrect file: ";
   public static String APPLICATION_CLOSED = "application closed";

}
