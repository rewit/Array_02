package com.biz.lotto;

import java.util.Random;

public class Lotto_02 {

	public static void main(String[] args) {

		// 6개의 정수형 배열을 생성하고
		// 정수배열 개수만큼 반복을 하면서
		// 1. 임의 정수 1 ~ 45 까지 중 한개를 생성
		// 2. 생성한 수가 배열에 이미 담겨 있는지 검사
		// 3. 그렇지 않으면 배열에 임의 정수를 담기
		int[] intNum = new int[6];

		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			int intR = rnd.nextInt(45) + 1;
			// System.out.print(intNum[i]+"\t");
			intNum[i] = intR;
			int index = 0;
			for (index = 0; index < intNum.length; index++) {
				if (intNum[index] == intR) {
					break;
				}
			}
			if (index >= intNum.length) {
				intNum[i] = intR;
				//System.out.println("값이 없다");
			} else {
				index--;
				//System.out.println("값이 있다");
			}
		}
		for (int i = 0; i < intNum.length; i++) {
			System.out.println(intNum[i] + "\t");

		}

	}

}
