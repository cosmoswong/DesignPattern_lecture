package com.atguigu.proxy.staticproxy;

//娴狅絿鎮婄�电钖�,闂堟瑦锟戒椒鍞悶锟�
public class TeacherDaoProxy implements ITeacherDao{
	
	private ITeacherDao target; // 閻╊喗鐖ｇ�电钖勯敍宀勶拷姘崇箖閹恒儱褰涢弶銉ㄤ粵閸氾拷
	
	
	//閺嬪嫰锟界姴娅�
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}



	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("瀵拷婵鍞悶锟�  鐎瑰本鍨氶弻鎰昂閹垮秳缍旈妴鍌橈拷鍌橈拷鍌橈拷鍌橈拷锟� ");//閺傝纭�
		target.teach();
		System.out.println("閹绘劒姘﹂妴鍌橈拷鍌橈拷鍌橈拷鍌橈拷锟�");//閺傝纭�
	}

}
