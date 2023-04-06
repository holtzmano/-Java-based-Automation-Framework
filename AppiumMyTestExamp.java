package tests.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import tests.supers.TestBase;

public class AppiumMyTestExamp extends TestBase {

	@Test
	public void test() {
		try {

			WebDriver driver = app.getDriver();
			log.info("Click volume button");
			driver.findElement(By.id("cc.dreamspark.intervaltimer:id/button_toggle_volume")).click();
			log.info("Rotate Landscape");
			((Rotatable) driver).rotate(ScreenOrientation.LANDSCAPE);
			log.info("Rotate Portrait");
			((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);


			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
}





