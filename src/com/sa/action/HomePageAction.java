package com.sa.action;

import org.openqa.selenium.WebDriver;

import com.sa.page.HomePage;

public class HomePageAction {

	private WebDriver driver;

	// 1）构造方法的方法名必须与类名相同。
	// 2）构造方法没有返回类型，也不能定义为void，在方法名前面不声明方法类型。
	// 3）构造方法的主要作用是完成对象的初始化工作，它能够把定义对象时的参数传给对象的域。

	public HomePageAction(WebDriver driver) {
		this.driver = driver;
	}

	// 新增工单-pos贷
	public void AddApp() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.AddApp(driver).click();

	}
	// 新增工单-农机贷
	public void AddNjApp() throws InterruptedException {
		//Thread.sleep(1000);
		HomePage.AddNjApp(driver).click();

	}
	

	// 返回driver
	public WebDriver ReturnDriver() {
		return this.driver;
	}

}
