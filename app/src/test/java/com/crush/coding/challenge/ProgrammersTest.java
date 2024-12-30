package com.crush.coding.challenge;

import com.crush.coding.challenge.programmers.Lv0.Lv0_Letter;
import com.crush.coding.challenge.programmers.Lv0.Lv0_StringReversal;

import org.junit.Assert;
import org.junit.Test;

public class ProgrammersTest {

    @Test
    public void testLv0_Letter() {
        Lv0_Letter lv0Letter = new Lv0_Letter();

        String[] inputs = {"happy birthday!", "I love you~"};
        System.out.println("--------------------------------------");
        for (String input : inputs) {
            int result = lv0Letter.solution(input);
            System.out.println("입력: " + input + " -> 결과: " + result);
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void testLv0_StringReversal() {
        Lv0_StringReversal lv0StringReversal = new Lv0_StringReversal();
        String[] inputs = {"jaron", "bread"};
        String[] expected = {"noraj", "daerb"};
        for (int i=0; i<inputs.length; i++) {
            String result = lv0StringReversal.solution3(inputs[i]);
            Assert.assertEquals(expected[i], result);
        }
    }
}
