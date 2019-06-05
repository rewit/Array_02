package com.biz.lotto;

import java.util.Random;

public class Lotto_03 {

	public static void main(String[] args) {

		int[] lottoNum = new int[6];
		Random rnd = new Random();

		// i = 저장 위치
		// j = 찾을 위치

		for (int i = 0; i < lottoNum.length; i++) {
			int intR = rnd.nextInt(45) + 1;
			lottoNum[i] = intR;

			int j = 0;
			for (j = 0; j < lottoNum.length; j++) {
				if (lottoNum[j] == intR) {
					break;
				}
			}
			if (j >= lottoNum.length) {
				lottoNum[i] = intR;
			} else {
				j--;
			}
		}

		for(int i = 0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i] + "\t");
		}
		}
	}


