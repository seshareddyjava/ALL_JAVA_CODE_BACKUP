package com.slokam.core;

class Test2 {

	int rate;
	int time;
	float prAmount;
	float intrestAmount;
	float intr(int rate,int time,float prAmount) {
		this.rate=rate;
		this.time=time;
		this.prAmount=prAmount;
		intrestAmount=rate*time*prAmount/100;
		return intrestAmount;
	}

}
