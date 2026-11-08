package com.chency.lzy;

import java.util.Scanner;
import java.util.Random;

public class Game {

    public final static String[] start = new String[] {
            """
    
                      "You, come here."
                                    ╔══════════╗ ™
                     ESCAPE FROM    ║  SCHOOL  ║
           "Come out of here!"      ╚══════════╝
    
                       "Did you finish your homework?"
            "Give it
                     to me!"
    
    """
    };
    public final static String[] endInterface = new String[]{"         ------   Game over   ------       " + System.lineSeparator()
            , "        Thank you for playing the game I made . " + System.lineSeparator()
            , " - List of production personnel " + System.lineSeparator()
            , "ChencyWang" + System.lineSeparator() + System.lineSeparator()
            , " - Special Acknowledgments " + System.lineSeparator()};
    public static void sleep_print(String say, int ms) throws InterruptedException {
        for (int i = 0;i < say.length();i ++) {
            System.out.print(say.charAt(i));
            System.out.flush();
            Thread.sleep(ms);
        }
    }
    public static void main(String[] args){

    }
}
