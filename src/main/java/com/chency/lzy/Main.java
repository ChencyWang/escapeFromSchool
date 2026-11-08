package com.chency.lzy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /// Start Interface
        System.out.print(Arrays.toString(Game.start));
        System.out.flush();
        System.out.print("©2026 Github ChencyWang All rights reserved. Violators will be prosecuted." + System.lineSeparator());
        System.out.flush();
        Thread.sleep(5600);
        ///Input Player Name
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your player name > ");
        System.out.flush();
        String playerName = sc.nextLine();
        ///Welcome
        System.out.print("Hello ! " + playerName + " ! Welcome to the game ! " + System.lineSeparator() + System.lineSeparator());
        System.out.flush();
        Thread.sleep(1000);
        System.out.print(System.lineSeparator() + System.lineSeparator() + System.lineSeparator());
        Thread.sleep(350);
        ///Plot
        Game.sleep_print("(In class ... )" + System.lineSeparator(),100);
        System.out.flush();
        Thread.sleep(950);
        ///Teacher
        System.out.print("Teacher > " + System.lineSeparator());
        Game.sleep_print("Alright, classmates, let's look at this question . " + System.lineSeparator(),100);
        System.out.flush();
        Thread.sleep(950);
        ///Teacher
        System.out.print("Teacher > " + System.lineSeparator());
        Game.sleep_print("Hey, " + playerName + " ! What are you doing ? " + System.lineSeparator(),100);
        Thread.sleep(650);
        ///System
        System.out.print("System > " + System.lineSeparator());
        Game.sleep_print("You were hit by the teacher's chalk . " + System.lineSeparator(),90);
        Thread.sleep(1000);
        ///Player
        System.out.print("Me > " + System.lineSeparator());
        System.out.flush();
        Game.sleep_print("I 'm so sorry, teacher . " + System.lineSeparator(),100);
        System.out.flush();
        Thread.sleep(1000);
        ///Mind
        System.out.print("Mind > " + System.lineSeparator());
        Game.sleep_print("I can't stand this. I need to get out of here . " + System.lineSeparator() + System.lineSeparator(),100);
        Thread.sleep(1000);
        ///Choose
        System.out.print("Choose" + System.lineSeparator());
        System.out.print("A . Get out by the back door . " + System.lineSeparator() + "B . Continue the class . " + System.lineSeparator() + "> ");
        char FirstChoose = sc.next().charAt(0);
        if(Character.toUpperCase(FirstChoose) == 'A'){
            Random random = new Random();
            int r1 = random.nextInt();
            if(r1 < 61){
                Thread.sleep(700);
                System.out.print("");
            }else{

            }
        }else{

        }
    }
}

