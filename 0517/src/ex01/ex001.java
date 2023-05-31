package ex01;

import java.util.ArrayList;
import java.util.Arrays;

public class ex001 {

	public static void main(String[] args) {
        int[] scores = {90, 85, 95, 88}; 
        
        
        
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            
            if(i == 0) {
            	System.out.printf("국어점수는 %d점 입니다. \n", scores[i]);
            }
            else if(i == 1) {
            	System.out.printf("영어점수는 %d점 입니다. \n" , scores[i]);
            }
            else if(i == 2) {
            	System.out.printf("수학점수는 %d점 입니다. \n", scores[i]);
            }
            else if(i == 3) {
            	System.out.printf("과학점수는 %d점 입니다. \n", scores[i]);
            }
            	
        }
        
        
        double average = sum / 4;
        
        System.out.printf("평균 점수 :  " +  average + "\n");
        
//        						(배열 , 배열 갯수)
        int[] num = Arrays.copyOf(scores, 4);
        
        //배열 사이즈 맞는지
        System.out.println(Arrays.equals(scores, num));
        //오름 차순
        Arrays.sort(scores);
        System.out.println("가장 작은 숫자 : " + scores[0]);
        System.out.println("가장 큰 숫자 : " + scores[scores.length -1]); //scores[3], 인덱스가 0부터 시작이므로 -1을 해서 뒤로 가게함 
        }
	}

