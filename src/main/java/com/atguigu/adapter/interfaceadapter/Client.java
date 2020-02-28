package com.atguigu.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		
		AbsAdapter absAdapter = new AbsAdapter() {
			//鍙渶瑕佸幓瑕嗙洊鎴戜滑 闇�瑕佷娇鐢� 鎺ュ彛鏂规硶
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("浣跨敤浜唌1鐨勬柟娉�");
			}
		};
		
		absAdapter.m1();
	}
}
