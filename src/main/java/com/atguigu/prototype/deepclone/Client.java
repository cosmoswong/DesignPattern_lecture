package com.atguigu.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DeepProtoType p = new DeepProtoType();
		p.name = "瀹嬫睙";
		p.deepCloneableTarget = new DeepCloneableTarget("澶х墰", "灏忕墰");
		
		//鏂瑰紡1 瀹屾垚娣辨嫹璐�
		
//		DeepProtoType p2 = (DeepProtoType) p.clone();
//		
//		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
	
		//鏂瑰紡2 瀹屾垚娣辨嫹璐�
		DeepProtoType p2 = (DeepProtoType) p.deepClone();
		
		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
	
	}

}
