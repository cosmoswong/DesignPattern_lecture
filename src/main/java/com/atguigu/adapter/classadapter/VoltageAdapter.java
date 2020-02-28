package com.atguigu.adapter.classadapter;

//閫傞厤鍣ㄧ被
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//鑾峰彇鍒�220V鐢靛帇
		int srcV = output220V();
		int dstV = srcV / 44 ; //杞垚 5v
		return dstV;
	}

}
