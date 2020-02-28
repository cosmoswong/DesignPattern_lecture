package com.atguigu.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//閸掓稑缂撻惄顔界垼鐎电钖�(鐞氼偂鍞悶鍡楊嚠鐠烇拷)
		TeacherDao teacherDao = new TeacherDao();
		
		//閸掓稑缂撴禒锝囨倞鐎电钖�, 閸氬本妞傜亸鍡氼潶娴狅絿鎮婄�电钖勬导鐘伙拷鎺旂舶娴狅絿鎮婄�电钖�
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		
		//闁俺绻冩禒锝囨倞鐎电钖勯敍宀冪殶閻€劌鍩岀悮顐″敩閻炲棗顕挒锛勬畱閺傝纭�
		//閸楃绱伴幍褑顢戦惃鍕Ц娴狅絿鎮婄�电钖勯惃鍕煙濞夋洩绱濇禒锝囨倞鐎电钖勯崘宥呭箵鐠嬪啰鏁ら惄顔界垼鐎电钖勯惃鍕煙濞夛拷 
		teacherDaoProxy.teach();
	}

}
