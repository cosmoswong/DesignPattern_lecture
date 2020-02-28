package com.atguigu.spring.springmvcadapter;

///瀹氫箟涓�涓狝dapter鎺ュ彛 
public interface HandlerAdapter {
	public boolean supports(Object handler);

	public void handle(Object handler);
}

// 澶氱閫傞厤鍣ㄧ被

class SimpleHandlerAdapter implements HandlerAdapter {

	public void handle(Object handler) {
		((SimpleController) handler).doSimplerHandler();
	}

	public boolean supports(Object handler) {
		return (handler instanceof SimpleController);
	}

}

class HttpHandlerAdapter implements HandlerAdapter {

	public void handle(Object handler) {
		((HttpController) handler).doHttpHandler();
	}

	public boolean supports(Object handler) {
		return (handler instanceof HttpController);
	}

}

class AnnotationHandlerAdapter implements HandlerAdapter {

	public void handle(Object handler) {
		((AnnotationController) handler).doAnnotationHandler();
	}

	public boolean supports(Object handler) {

		return (handler instanceof AnnotationController);
	}

}
