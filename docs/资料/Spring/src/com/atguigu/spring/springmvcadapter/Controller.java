package com.atguigu.spring.springmvcadapter;

//澶氱Controller瀹炵幇  
public interface Controller {

}

class HttpController implements Controller {
	public void doHttpHandler() {
		System.out.println("http...");
	}
}

class SimpleController implements Controller {
	public void doSimplerHandler() {
		System.out.println("simple...");
	}
}

class AnnotationController implements Controller {
	public void doAnnotationHandler() {
		System.out.println("annotation...");
	}
}
