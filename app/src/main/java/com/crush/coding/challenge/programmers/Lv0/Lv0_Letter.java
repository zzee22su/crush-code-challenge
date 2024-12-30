package com.crush.coding.challenge.programmers.Lv0;

public class Lv0_Letter {

    /**
     * <h1>편지</h1>
     * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120898">문제 바로가기</a></p>
     * <br><br>
     * 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때, 축하 문구 <code>message</code>를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
     */

    public int solution(String message) {
        int answer = message.length();
        answer = answer*2;
        return answer;
    }
}
