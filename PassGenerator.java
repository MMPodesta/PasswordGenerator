package com.griffith;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class PassGenerator {
    //Creates random object and sets upperbound to the amount of items in characters (0-63)
    private Random random = new Random();
    private int upperbound = 64;

    //Possible characters to be used
    private String[] characters = {"A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z", "a",	"b",	"c",	"d",	"e",	"f",	"g",
            "h",	"i",	"j",	"k",	"l",	"m",	"n",	"o",	"p",	"q",
            "r",	"s",	"t",	"u",	"v",	"w",	"x",	"y",	"z", "0", "1",
            "2", "3", "4", "5", "6", "7", "8", "9","!", "@"};

    //Convert "characters" array into list
    private List<String> myCharactersList = Arrays.asList(characters);
    //Initialize list that will store all randomly chosen characters
    private ArrayList<String> listPassword = new ArrayList<>();


    //Method that generates password based on the number of characters
    public String GeneratePassword(int numberOfCharacters){

        //Loop that runs based on the amount of characters
        //Adds a new random character from "myCharacterList" to "listPassword" each time it runs
        for (int i = 0; i <numberOfCharacters ; i++) {
            int r1 = random.nextInt(upperbound);
            listPassword.add(myCharactersList.get(r1));
        }

        //Returns all character in listPassword without delimiter(one single String)
        return String.join("", listPassword);
    }
}
