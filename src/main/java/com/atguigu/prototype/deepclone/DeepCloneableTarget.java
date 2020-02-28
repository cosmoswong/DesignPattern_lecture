package com.atguigu.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	//鏋勯�犲櫒
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	//鍥犱负璇ョ被鐨勫睘鎬э紝閮芥槸String , 鍥犳鎴戜滑杩欓噷浣跨敤榛樿鐨刢lone瀹屾垚鍗冲彲
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
