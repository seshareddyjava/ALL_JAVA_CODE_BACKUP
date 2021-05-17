package com.slokam.core;

public class Pattern1 {

	public static void main(String[] args) {
		for(char c1='A';c1<'E';c1++) {
			for(char c2='A';c2<'E'-c1;c2++) {
				System.out.print(" ");
			}
			for(char c3='A';c3<c1;c3++) {
				System.out.print(" "+c3);
			}
			System.out.println();
		}

	}

}
