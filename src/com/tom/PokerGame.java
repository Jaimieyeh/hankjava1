package com.tom;

import java.util.Random;

public class PokerGame {	
	public static void main(String[] args) {
		
		int[] n = new int[10];
		Card[] c = new Card[10];
		System.out.println(n[0]);
		c[0] = new Card(7);
		System.out.println(c[0].get());
		
		
		Poker poker = new Poker();
		poker.shuffle();
		poker.print();
		
	
		
		
		
		/*int[] flowers = {0x2663, 0x2666, 0x2665, 0x2660};
		int[] nums = new int[5];
		nums[0] = 77;
		nums[4] = 99;
		System.out.println(nums[4]);
		System.out.println(nums.length);
		for (int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		char f = 0x2666;
		System.out.println(f);*/
		
	
		
		
		/*Random random = new Random();
		int number = random.nextInt(13)+1;
		int flower = random.nextInt(4);
		System.out.print(number);
		char c = 0;
		switch(flower){
		case 0 :
			c = 'C';
			break;
		case 1 :
			c = 'D';
			break;
		case 2 :
			c = 'H';
			break;
		case 3 :
			c = 'S';
			break;
		}
		System.out.println(c);
*/		
		
	}

}
