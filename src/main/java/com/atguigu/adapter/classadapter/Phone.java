package com.atguigu.adapter.classadapter;

public class Phone {

	//鍏呯數
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("鐢靛帇涓�5V, 鍙互鍏呯數~~");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("鐢靛帇澶т簬5V, 涓嶈兘鍏呯數~~");
		}
	}
}
