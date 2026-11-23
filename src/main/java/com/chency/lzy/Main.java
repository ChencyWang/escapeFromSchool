/*
Copyright (C) 2026 ChencyWang

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package com.chency.lzy;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /// Start Interface
        for(int i = 0;i < Game.startInterface.length;i ++){
            System.out.print(Game.startInterface[i]);
        }
        System.out.flush();
        /// Start Copyright
        for(int i = 0;i < Game.startCopyright.length;i ++) {
            System.out.print(Game.startCopyright[i]);
            System.out.flush();
        }
        Thread.sleep(5600);
        ///Input Player Name
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your player name > ");
        System.out.flush();
        String playerName = sc.nextLine();
        ///Welcome
        Game.sleep_print("Hello ! " + playerName + " ! Welcome to the game ! " + System.lineSeparator() + System.lineSeparator(),100);
        System.out.flush();
        Thread.sleep(1000);
        System.out.print(System.lineSeparator() + System.lineSeparator() + System.lineSeparator());
        Thread.sleep(350);
        ///Plot
        Game.sleep_print("(In class ... ) " + System.lineSeparator(),100);
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
        Game.sleep_print("I'm so sorry, teacher . " + System.lineSeparator(),100);
        System.out.flush();
        Thread.sleep(1000);
        ///Mind
        System.out.print("Mind > " + System.lineSeparator());
        System.out.flush();
        Game.sleep_print("I didn't do anything . " + System.lineSeparator(),100);
        Thread.sleep(1000);
        ///Mind
        System.out.print("Mind > " + System.lineSeparator());
        System.out.flush();
        Game.sleep_print("I can't stand this. I need to get out of here . " + System.lineSeparator() + System.lineSeparator(),100);
        Thread.sleep(1000);
        ///Choose
        System.out.print("Choose" + System.lineSeparator());
        System.out.print("A . Get out by the back door . " + System.lineSeparator() + "B . Continue the class . " + System.lineSeparator() + "> ");
        String FirstChoose = sc.nextLine();
        if("A".equalsIgnoreCase(FirstChoose)){
            Random random = new Random();
            int r1 = random.nextInt(100);
            Thread.sleep(700);
            System.out.print("System > " + System.lineSeparator());
            Game.sleep_print("You chose to run away . " + System.lineSeparator(),100);
            System.out.flush();
            if(r1 < 81){
                Game.sleep_print("(On the second-floor corridor ... ) " + System.lineSeparator(),100);
                Thread.sleep(800);
                System.out.print("Me > " + System.lineSeparator());
                System.out.flush();
                Game.sleep_print("How lucky! There's no teacher patrolling . " + System.lineSeparator(),100);
                System.out.flush();
                Thread.sleep(800);
                System.out.print("Me > " + System.lineSeparator());
                System.out.flush();
                Game.sleep_print("Shall we take the east staircase or the west staircase ? " + System.lineSeparator(),100);
                Thread.sleep(800);
                System.out.print("Choose > " + System.lineSeparator());
                System.out.flush();
                System.out.print("A . Take the east stairs . (Closer to the school gate, but more dangerous ) " + System.lineSeparator() + "B .  Take the west stairs . (It's not passing through the monitoring room, but it's farther away ) " + System.lineSeparator());
                System.out.flush();
                System.out.print(" > ");
                String secondChoose = sc.nextLine();
                if("A".equalsIgnoreCase(secondChoose)){
                    Game.sleep_print("You choose to take the east staircase . " + System.lineSeparator(),100);
                    int random2 = random.nextInt(100);
                    if(random2 < 61){
                        System.out.print("Me >  " + System.lineSeparator());
                        Game.sleep_print("Great, there's no teacher ! " + System.lineSeparator(),100);
                        Thread.sleep(500);
                        int random3 = random.nextInt(100);
                        if(random3 >= 10){
                            Game.sleep_print("(At the school gate ... ) " + System.lineSeparator(),100);
                            Thread.sleep(400);
                            System.out.print("Me > " + System.lineSeparator());
                            Game.sleep_print("Great ! There are no security guards here . " + System.lineSeparator(),100);
                            Thread.sleep(230);
                            System.out.print("Final confirmation, just type something random . " + System.lineSeparator());
                            System.out.print(" > ");
                            String confirmation = sc.nextLine();
                            Thread.sleep(300);
                            Game.sleep_print("You escaped from school . "+ System.lineSeparator(),100);
                            Thread.sleep(900);
                            Game.sleep_print("But is this really a good idea ? " + System.lineSeparator() + System.lineSeparator(),100);
                            Thread.sleep(200);
                            for(int i = 0;i < Game.endInterface.length;i ++){
                                System.out.print(Game.endInterface[i]);
                                System.out.flush();
                                Thread.sleep(450);
                            }
                            System.out.print("The game will exit in 5 seconds . " + System.lineSeparator());
                            Thread.sleep(3000);
                            System.exit(0);
                        }else{
                            System.out.print("Me > " + System.lineSeparator());
                            System.out.flush();
                            Game.sleep_print("Oh no! It's the security guard ! " + System.lineSeparator(),100);
                            Thread.sleep(200);
                            System.out.print("Security guard > " + System.lineSeparator());
                            Game.sleep_print("Hey ! What are you doing ? " + System.lineSeparator(),100);
                            Thread.sleep(300);
                            System.out.print("Security guard > " + System.lineSeparator());
                            System.out.flush();
                            Game.sleep_print("Follow me to the office ! " + System.lineSeparator(),100);
                            Thread.sleep(900);
                            Game.sleep_print("(After some time ... ) " + System.lineSeparator(),100);
                            System.out.print("School broadcast announcement > " + System.lineSeparator());
                            System.out.flush();
                            Game.sleep_print(playerName + ", leaving the classroom without permission during class . " + System.lineSeparator(),100);
                            Thread.sleep(500);
                            Game.sleep_print("Deduct 2 points ! " + System.lineSeparator(),100);
                            Thread.sleep(500);
                            System.out.print("Student1 > " + System.lineSeparator());
                            Game.sleep_print("Oh my god ! " + System.lineSeparator(),100);
                            Thread.sleep(500);
                            System.out.print("Student2 > " + System.lineSeparator());
                            Game.sleep_print("I had suspected he was up to something shady before, and it seems my guess was right . " + System.lineSeparator(),100);
                            Thread.sleep(1000);
                            for(int i = 0;i < Game.endInterface.length;i ++){
                                System.out.print(Game.endInterface[i]);
                                System.out.flush();
                                Thread.sleep(650);
                            }
                            System.out.print("The game will exit in 5 seconds . " + System.lineSeparator());
                            Thread.sleep(3000);
                            System.exit(0);
                        }
                    }else{
                        System.out.print("Me > " + System.lineSeparator());
                        Game.sleep_print("Oh no ! Teacher ! " + System.lineSeparator(),100);
                        System.out.print("Teacher > " + System.lineSeparator());
                        System.out.flush();
                        Game.sleep_print("You ! Stop ! " + System.lineSeparator(),100);
                        System.out.flush();
                        Thread.sleep(800);
                        System.out.print("Teacher > " + System.lineSeparator());
                        Game.sleep_print("Follow me to the office ! " + System.lineSeparator(),100);
                        Thread.sleep(900);
                        Game.sleep_print("(After some time ... ) " + System.lineSeparator(),100);
                        System.out.print("School broadcast announcement > " + System.lineSeparator());
                        Game.sleep_print(playerName + ", leaving the classroom without permission during class . " + System.lineSeparator(),100);
                        Thread.sleep(500);
                        Game.sleep_print("Deduct 2 points ! " + System.lineSeparator(),100);
                        Thread.sleep(500);
                        System.out.print("Student1 > " + System.lineSeparator());
                        Game.sleep_print("Oh my god ! " + System.lineSeparator(),100);
                        Thread.sleep(500);
                        System.out.print("Student2 > " + System.lineSeparator());
                        Game.sleep_print("I had suspected he was up to something shady before, and it seems my guess was right . " + System.lineSeparator(),100);
                        Thread.sleep(1000);
                        for(int i = 0;i < Game.endInterface.length;i ++){
                            System.out.print(Game.endInterface[i]);
                            System.out.flush();
                            Thread.sleep(650);
                        }
                        System.out.print("The game will exit in 5 seconds . " + System.lineSeparator());
                        Thread.sleep(3000);
                        System.exit(0);
                    }
                }else if("B".equalsIgnoreCase(secondChoose)){
                    Game.sleep_print("You choose to take the west staircase . " + System.lineSeparator(),100);
                    int random2 = random.nextInt(100);
                    if(random2 < 31){
                        System.out.print("Me >  " + System.lineSeparator());
                        Game.sleep_print("Great, there's no teacher ! " + System.lineSeparator(),100);
                        Thread.sleep(500);
                        int random3 = random.nextInt(100);
                        if(random3 >= 10){
                            Game.sleep_print("(At the school gate ... ) " + System.lineSeparator(),100);
                            Thread.sleep(400);
                            System.out.print("Me > " + System.lineSeparator());
                            Game.sleep_print("Great ! There are no security guards here . " + System.lineSeparator(),100);
                            Thread.sleep(230);
                            System.out.print("Final confirmation, just type something random . " + System.lineSeparator());
                            System.out.print(" > ");
                            String confirmation = sc.nextLine();
                            Thread.sleep(300);
                            Game.sleep_print("You escaped from school . "+ System.lineSeparator(),100);
                            Thread.sleep(900);
                            Game.sleep_print("But is this really a good idea ? " + System.lineSeparator() + System.lineSeparator(),100);
                            Thread.sleep(200);
                            for(int i = 0;i < Game.endInterface.length;i ++){
                                System.out.print(Game.endInterface[i]);
                                System.out.flush();
                                Thread.sleep(650);
                            }
                            System.out.print("The game will exit in 5 seconds . " + System.lineSeparator());
                            Thread.sleep(3000);
                            System.exit(0);
                        }else{
                            System.out.print("Me > " + System.lineSeparator());
                            System.out.flush();
                            Game.sleep_print("Oh no! It's the security guard ! " + System.lineSeparator(),100);
                            Thread.sleep(200);
                            System.out.print("Security guard > " + System.lineSeparator());
                            Game.sleep_print("Hey ! What are you doing ? " + System.lineSeparator(),100);
                            Thread.sleep(300);
                            System.out.print("Security guard > " + System.lineSeparator());
                            System.out.flush();
                            Game.sleep_print("Follow me to the office ! " + System.lineSeparator(),100);
                            Thread.sleep(900);
                            Game.sleep_print("(After some time ... ) " + System.lineSeparator(),100);
                            System.out.print("School broadcast announcement > " + System.lineSeparator());
                            System.out.flush();
                            Game.sleep_print(playerName + ", leaving the classroom without permission during class . " + System.lineSeparator(),100);
                            Thread.sleep(500);
                            Game.sleep_print("Deduct 2 points ! " + System.lineSeparator(),100);
                            Thread.sleep(500);
                            System.out.print("Student1 > " + System.lineSeparator());
                            Game.sleep_print("Oh my god ! " + System.lineSeparator(),100);
                            Thread.sleep(500);
                            System.out.print("Student2 > " + System.lineSeparator());
                            Game.sleep_print("I had suspected he was up to something shady before, and it seems my guess was right . " + System.lineSeparator(),100);
                            Thread.sleep(1000);
                            for(int i = 0;i < Game.endInterface.length;i ++){
                                System.out.print(Game.endInterface[i]);
                                System.out.flush();
                                Thread.sleep(450);
                            }
                            System.out.print("The game will exit in 5 seconds . " + System.lineSeparator());
                            Thread.sleep(3000);
                            System.exit(0);
                        }
                    }else{
                        System.out.print("Me > " + System.lineSeparator());
                        Game.sleep_print("Oh no ! Teacher ! " + System.lineSeparator(),100);
                        System.out.print("Teacher > " + System.lineSeparator());
                        System.out.flush();
                        Game.sleep_print("You ! Stop ! " + System.lineSeparator(),100);
                        System.out.flush();
                        Thread.sleep(800);
                        System.out.print("Teacher > " + System.lineSeparator());
                        Game.sleep_print("Follow me to the office ! " + System.lineSeparator(),100);
                        Thread.sleep(900);
                        Game.sleep_print("(After some time ... ) " + System.lineSeparator(),100);
                        System.out.print("School broadcast announcement > " + System.lineSeparator());
                        Game.sleep_print(playerName + ", leaving the classroom without permission during class . " + System.lineSeparator(),100);
                        Thread.sleep(500);
                        Game.sleep_print("Deduct 2 points ! ",100);
                        Thread.sleep(500);
                        System.out.print("Student1 > " + System.lineSeparator());
                        Game.sleep_print("Oh my god ! ",100);
                        Thread.sleep(500);
                        System.out.print("Student2 > " + System.lineSeparator());
                        Game.sleep_print("I had suspected he was up to something shady before, and it seems my guess was right . " + System.lineSeparator(),100);
                        Thread.sleep(1000);
                        for(int i = 0;i < Game.endInterface.length;i ++){
                            System.out.print(Game.endInterface[i]);
                            System.out.flush();
                            Thread.sleep(650);
                        }
                        System.out.print("The game will exit in 5 seconds . " + System.lineSeparator());
                        Thread.sleep(3000);
                        System.exit(0);
                    }
                }else{
                    for(int i = 0;i < Game.exceptionInterface.length;i ++){
                        System.out.print(Game.exceptionInterface[i]);
                        System.out.flush();
                        Thread.sleep(650);
                    }
                    for(int i = 0;i < Game.endInterface.length;i ++){
                        System.out.print(Game.endInterface[i]);
                        System.out.flush();
                        Thread.sleep(650);
                    }
                    Game.sleep_print("The game will exit in 5 seconds . ",100);
                    Thread.sleep(5000);
                    System.exit(0);
                }
            }else{
                System.out.print("Me > " + System.lineSeparator());
                System.out.flush();
                Game.sleep_print("Not good! It's the teacher!",100);
                Thread.sleep(650);
                System.out.print("Teacher > " + System.lineSeparator());
                System.out.flush();
                Game.sleep_print("You ! Stop ! " + System.lineSeparator(),100);
                System.out.flush();
                Thread.sleep(800);
                System.out.print("Teacher > " + System.lineSeparator());
                Game.sleep_print("Follow me to the office ! " + System.lineSeparator(),100);
                Thread.sleep(900);
                Game.sleep_print("(After some time ... ) " + System.lineSeparator(),100);
                System.out.print("School broadcast announcement > " + System.lineSeparator());
                Game.sleep_print(playerName + ", leaving the classroom without permission during class . " + System.lineSeparator(),100);
                Thread.sleep(500);
                Game.sleep_print("Deduct 2 points ! " + System.lineSeparator(),100);
                Thread.sleep(500);
                System.out.print("Student1 > " + System.lineSeparator());
                Game.sleep_print("Oh my god ! " + System.lineSeparator(),100);
                Thread.sleep(500);
                System.out.print("Student2 > " + System.lineSeparator());
                Game.sleep_print("I had suspected he was up to something shady before, and it seems my guess was right . " + System.lineSeparator(),100);
                Thread.sleep(1000);
                for(int i = 0;i < Game.endInterface.length;i ++){
                    System.out.print(Game.endInterface[i]);
                    System.out.flush();
                    Thread.sleep(650);
                }
                System.out.print("The game will exit in 5 seconds . " + System.lineSeparator());
                Thread.sleep(3000);
                System.exit(0);
            }
        }else if("B".equalsIgnoreCase(FirstChoose)){
            Game.sleep_print("Nothing happened . ",100);
            Thread.sleep(800);
            for(int i = 0;i < Game.endInterface.length;i ++){
                System.out.print(Game.endInterface[i]);
                Thread.sleep(650);
            }
            System.out.print(System.lineSeparator());
            Game.sleep_print("The game will exit in 5 seconds . ",100);
            Thread.sleep(5000);
            System.exit(0);
        }else{
            for(int i = 0;i < Game.exceptionInterface.length;i ++){
                System.out.print(Game.exceptionInterface[i]);
                System.out.flush();
                Thread.sleep(650);
            }
            for(int i = 0;i < Game.endInterface.length;i ++){
                System.out.print(Game.endInterface[i]);
                System.out.flush();
                Thread.sleep(650);
            }
            System.out.print(System.lineSeparator());
            Game.sleep_print("The game will exit in 5 seconds . ",100);
            Thread.sleep(5000);
            System.exit(0);
        }
    }
}