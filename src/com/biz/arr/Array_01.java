package com.biz.arr;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] intKor = new int[5];
		Random rnd = new Random();
		for (int i = 0; i < intKor.length; i++) {

			// 51 ~ 100까지 임의의 수를 생성
			int intRnd = rnd.nextInt(50) + 51;
			intKor[i] = intRnd;
		}
		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i]);
			if ((i + 1) % 5 == 0) // if문 끝에 ;을 찍으면 아무것도 하지말고 종료라는 명령어 (주의)
				System.out.println(); // if문 다음에 여러줄이 나올떄 {}를 묶어야 하는데 한줄만 나올시 {}없이 사용 가능
			else
				System.out.print(", ");
		}

		// 5개의 배열에 담긴 숫자리스트를
		// 작은수부터 큰수 순서로(오름차순)정렬(sort)해서 나열

		// 70, 60, 51, 90, 77 이라 가정
		// leftI RightI intKor[leftI] intKor[rightI]
		// 0 1 intKor[0]:70 intKor[1]:60
		// if문 = 70 > 60 비교 후 바꿈
		// 60, 70, 51, 90, 77 이라 가정
		// 0 2 intKor[0]:60 intKor[2]:51
		// if문 = 60 > 51
		// 51, 70, 60, 90, 77
		
		
		// 반복적으로 인접한 배열에 담긴 값과 비교하여 자리바꿈을 실행하면서
		// 작은수부터 큰수 순서로 나열하는 코드 
		for (int leftI = 0; leftI < intKor.length; leftI++) {
			for (int rightI = leftI + 1; rightI < intKor.length; rightI++) {
				if (intKor[leftI] > intKor[rightI]) {

					int _temp = intKor[leftI];
					intKor[leftI] = intKor[rightI];
					intKor[rightI] = _temp;

				}
			}
		}
		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i]);
			if ((i + 1) % 5 == 0)
				System.out.println();
			else
				System.out.print(", ");
		}

	}
}
