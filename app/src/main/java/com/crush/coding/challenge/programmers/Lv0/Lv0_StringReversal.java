package com.crush.coding.challenge.programmers.Lv0;

public class Lv0_StringReversal {

    /**
     * <h1>문자열 뒤집기</h1>
     * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120822">문제 바로가기</a></p>
     * <br><br>
     * 문자열 <code>my_string</code>이 매개변수로 주어집니다.<br>
     * <code>my_string</code>을 거꾸로 뒤집은 문자열을 반환하도록 <code>solution</code> 함수를 완성해주세요.
     */

    //TRY 1 - substring
    public String solution(String my_string) {
        String answer = "";
        int index = my_string.length()-1;

        for (int i=index; i>=0; i--) {
            if (i == index) {
                answer += my_string.substring(i);
                answer += my_string.substring(i-1, i);
            } else if (i!=0) {
                answer += my_string.substring(i-1, i);
            }
        }
        return answer;
    }

    //TRY 2 - StringBuilder 사용
    public String solution2(String my_string) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder(my_string);
        answer = String.valueOf(stringBuilder.reverse());
        return answer;
    }

    //TRY 3 - charAt 사용
    public String solution3(String my_string) {
        String answer = "";
        for (int i = my_string.length()-1; i>=0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
