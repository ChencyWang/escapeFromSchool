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
