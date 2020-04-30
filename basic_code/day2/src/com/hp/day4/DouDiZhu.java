package com.hp.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
        Collections.shuffle(poker);
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                diPai.add(poker.get(i));
            } else if (i % 3 == 0) {
                //给玩家1发牌
                player01.add(poker.get(i));
            } else if (i % 3 == 1) {
                //给玩家2发牌
                player02.add(poker.get(i));
            } else if (i % 3 == 2) {
                //给玩家3发牌
                player03.add(poker.get(i));
            }

        }
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(diPai);

    }
}
