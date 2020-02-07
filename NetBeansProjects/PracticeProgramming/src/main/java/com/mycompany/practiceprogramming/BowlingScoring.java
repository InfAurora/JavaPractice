/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jose
 */
public class BowlingScoring {

    public static void main(String[] args) {
        List<Integer[]> frames = new ArrayList<>();
        frames.add(new Integer[]{8, 2});
        frames.add(new Integer[]{8, 2});
        frames.add(new Integer[]{10, 0});
        frames.add(new Integer[]{10, 0});
        frames.add(new Integer[]{10, 0});
        frames.add(new Integer[]{8, 1});
        frames.add(new Integer[]{9, 0});
        frames.add(new Integer[]{7, 3});
        frames.add(new Integer[]{6, 3});
        frames.add(new Integer[]{8, 2, 5});

        int score = 0;

        for (int i = 0; i <= frames.size() - 1; i++) {
            Integer[] balls = frames.get(i);
            if (balls.length < 3) {
                int frame1 = 0;
                int frame2 = 0;
                int frame3 = 0;
                int ball1 = balls[0];
                int ball2 = balls[1];
                frame1 += ball1 + ball2;
                if (balls[0] == 10 || balls[0] + balls[1] == 10 || i > frames.size() - 1) {
                    //frames.get(i + 1);
                    Integer[] balls2 = frames.get(i + 1);
                    frame2 += balls2[0] + balls2[1];
                    if (frame2 == 10 && balls2[0] != 10) {
                        score += frame1 + balls2[0];
                    } else if (balls2[0] != 10 && frame1 == 10) {
                        //if (frame1 == 10) {
                            score += frame1 + ball1;
                        //} else {
                          //  score += frame1 + frame2;
                        //}
                        //frames.get(i + 2);
                        
                    } else if (balls2[0] == 10 && balls2[1] == 0 || balls2[0] + balls2[1] == 10) {
                        if (balls[1] != 0) {
                            score += frame1 + frame2;
                        } else {
                            Integer[] balls3 = frames.get(i + 2);
                            frame3 += balls3[0];
                            score += frame1 + frame2 + frame3;
                        }

                    } else {

                        score += frame1 + frame2 + frame3;
                    }

                } else {
                    score += balls[0] + balls[1];
                }
            } else {

                int ball1 = balls[0];
                int ball2 = balls[1];
                int ball3 = balls[2];
                score += ball1 + ball2 + ball3;
            }

            System.out.println(score);

        }
    }

}
