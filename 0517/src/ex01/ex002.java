package ex01;

import java.util.Arrays;
import java.util.Iterator;

public class ex002 {

	public static void main(String[] args) {
		
//		//얕은 복사
//		int [] arr = {0,1,2,3,4};
//		int [] num = arr;
//		
//		System.out.println("복사하기 전 arr : " + Arrays.toString(arr));
//		System.out.println("복사하기 전 num : " + Arrays.toString(num));
//		
//		num[2] = 100;
//		
//		System.out.println("복사한 후 arr : " + Arrays.toString(arr));
//		System.out.println("복사한 후 num : " + Arrays.toString(num));

		
//-----------------------------------------------------------------------------------------
//		//깊은 복사
//		int [] arr = {0,1,2,3,4};
//		int [] num = new int [arr.length]; // new연산자를 통해서 새로운 배열 객체를 생성
//		
//		System.out.println("arr : " + Arrays.toString(arr));
//		System.out.println("num : " + Arrays.toString(num));
//		
//		// for문 돌려서 값을 넣음
//		for(int i = 0; i < arr.length; i ++) {
//			num[i] = arr[i];
//		}
//		arr[2] = 1000;
//		
//		
//		System.out.println("arr : " + Arrays.toString(arr));
//		System.out.println("num : " + Arrays.toString(num));
		
		
//-----------------------------------------------------------------------------------------
		//깊은 복사 _02
		int [] arr = {0,1,2,3,4};
		int [] num = new int [arr.length]; // new연산자를 통해서 새로운 배열 객체를 생성
//						(복사할 배열, 갯수, 복사위치, 갯수)
		System.arraycopy(arr, 0, num, 0, arr.length);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("num : " + Arrays.toString(num));
		
	}

}
