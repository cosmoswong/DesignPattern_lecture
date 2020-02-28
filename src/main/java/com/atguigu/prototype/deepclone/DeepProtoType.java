package com.atguigu.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable{
	
	public String name; //String 灞炴��
	public DeepCloneableTarget deepCloneableTarget;// 寮曠敤绫诲瀷
	public DeepProtoType() {
		super();
	}
	
	
	//娣辨嫹璐� - 鏂瑰紡 1 浣跨敤clone 鏂规硶
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep = null;
		//杩欓噷瀹屾垚瀵瑰熀鏈暟鎹被鍨�(灞炴��)鍜孲tring鐨勫厠闅�
		deep = super.clone(); 
		//瀵瑰紩鐢ㄧ被鍨嬬殑灞炴�э紝杩涜鍗曠嫭澶勭悊
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();
		
		// TODO Auto-generated method stub
		return deepProtoType;
	}
	
	//娣辨嫹璐� - 鏂瑰紡2 閫氳繃瀵硅薄鐨勫簭鍒楀寲瀹炵幇 (鎺ㄨ崘)
	
	public Object deepClone() {
		
		//鍒涘缓娴佸璞�
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			
			//搴忓垪鍖�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this); //褰撳墠杩欎釜瀵硅薄浠ュ璞℃祦鐨勬柟寮忚緭鍑�
			
			//鍙嶅簭鍒楀寲
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			
			return copyObj;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			//鍏抽棴娴�
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
		
	}
	
}
