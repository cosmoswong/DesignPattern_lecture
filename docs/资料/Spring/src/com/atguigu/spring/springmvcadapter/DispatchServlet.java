package com.atguigu.spring.springmvcadapter;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {

	public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

	public DispatchServlet() {
		handlerAdapters.add(new AnnotationHandlerAdapter());
		handlerAdapters.add(new HttpHandlerAdapter());
		handlerAdapters.add(new SimpleHandlerAdapter());
	}

	public void doDispatch() {

		// 姝ゅ妯℃嫙SpringMVC浠巖equest鍙杊andler鐨勫璞★紝
		// 閫傞厤鍣ㄥ彲浠ヨ幏鍙栧埌甯屾湜鐨凜ontroller
		// HttpController controller = new HttpController();
		 AnnotationController controller = new AnnotationController();
		//SimpleController controller = new SimpleController();
		// 寰楀埌瀵瑰簲閫傞厤鍣�
		HandlerAdapter adapter = getHandler(controller);
		// 閫氳繃閫傞厤鍣ㄦ墽琛屽搴旂殑controller瀵瑰簲鏂规硶
		adapter.handle(controller);

	}

	public HandlerAdapter getHandler(Controller controller) {
		for (HandlerAdapter adapter : this.handlerAdapters) {
			if (adapter.supports(controller)) {
				return adapter;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		new DispatchServlet().doDispatch();
	}

}
