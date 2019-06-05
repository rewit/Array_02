package com.biz.lotto;

import java.util.Random;

public class Lotto_06 {

	public static void main(String[] args) {

		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;

		}
		Random rnd = new Random();
		int loop = nums.length * 3;
		while (loop > 0) {
			int index1 = rnd.nextInt(nums.length);
			int index2 = rnd.nextInt(nums.length);

			if (index1 != index2) {
				int _temp = nums[index1];
				nums[index1] = nums[index2];
				nums[index2] = _temp;
				loop--;
			}
		}
		for (int i = 0; i < 6; i++) {

		}
		int[] lottos = new int[6];
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = nums[i];
		}
		for (int i = 0; i < lottos.length; i++) {
			for (int j = i + 1; j < lottos.length; j++) {

				if (lottos[i] > lottos[j]) {
					int _temp = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = _temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.print(lottos[i] + "\t");

		}

	}

}
