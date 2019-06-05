package com.biz.lotto;

import java.util.Random;

public class Lotto_05 {

	public static void main(String[] args) {

		/*
		 * 1. 정수형 배열을 45개 생성 2. 순서대로 1부터 45까지의 숫자를 각각 대입 2-1)배열요소에는 중복된 값이 없다. 3. 45의
		 * 배열을 무작위로 섞기(suffle) 4. 섞인 배열에서 0번부터 5번까지를 추출해서 5. 콘솔에 보여주기
		 */

		// 횟수를 정하지 않는 반복문
		// 무한반복문
		// for(;;) {}
		// 보통은 for문을 이용하여 무한반복문을 사용하지 않는다.

//		// 무한반복
//		boolean a = 1 == 1;
//		int index = 100;
//		while (index > 0) { // while(true)와 같음
//			index--;
//		}

//		while(true) {
//			if(!a) break;
//		}

		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1; // 2-1

		}
		Random rnd = new Random();
		int loop = nums.length * 3;
		while (loop > 0) {
			// 임의로 0~44까지의 숫자 2개를 생성하여
			// 각각 변수에 대입
			int index1 = rnd.nextInt(nums.length);
			int index2 = rnd.nextInt(nums.length);
			// 두개의 변수에 저장된 값이 다르면
			if (index1 != index2) {
				int _temp = nums[index1];
				nums[index1] = nums[index2];
				nums[index2] = _temp;
				loop--;
			}
		}
		// 추출된 lotto번호 오름차순 정렬
		for (int i = 0; i < 6; i++) {
			// System.out.print(nums[i] + "\t");
			// for (i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (nums[i] > nums[j]) {
					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;

				}
			}
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.print(nums[i] + "\t");
		}

	}

}
