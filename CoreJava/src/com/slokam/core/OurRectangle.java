package com.slokam.core;

public class OurRectangle {
	int length =10;;
	int width=30;

	int area() {
		int area = length * width;
		return area;
	}

	int per() {
		int per = 2 * (length +width);
		return per;
	}
}
