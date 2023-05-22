package cucu.base;

import org.openqa.selenium.By;

import cucumber.meth.Hooks;
//import pbl.webdriver1.base1;

public class commen extends Hooks{
	
	public static void input(String path,String wehat) {
		driver.findElement(By.xpath(path)).sendKeys(wehat);
	}

}
