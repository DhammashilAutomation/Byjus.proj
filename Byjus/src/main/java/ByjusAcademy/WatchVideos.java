package ByjusAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WatchVideos {
	Select sel;
	
	//step1
   @FindBy(xpath="//select[@class='form-control video-selection']")private WebElement classes;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[1]")private WebElement v1;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[2]")private WebElement v2;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[3]")private WebElement v3;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[4]")private WebElement v4;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[5]")private WebElement v5;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[6]")private WebElement v6;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[7]")private WebElement v7;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[8]")private WebElement v8;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[9]")private WebElement v9;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[10]")private WebElement v10;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[11]")private WebElement v11;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[12]")private WebElement v12;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[13]")private WebElement v13;
   @FindBy(xpath="(//a[@class='video-thumbnail'])[14]")private WebElement v14;
   
   @FindBy(xpath="//button[@class='close']")private WebElement close;
	
	//step2 to initialization of global variable
	
	public WatchVideos(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 sel = new Select(classes);     // create object of select class
		
	}
	// Step 3 Method create
	
	public void class4() throws InterruptedException {
		sel.selectByIndex(0);
		v1.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
		v2.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
	}
	
	public void class5() throws InterruptedException {
		sel.selectByIndex(1);
		v3.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
		v4.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
	}
	
	
	public void class6() throws InterruptedException {
		sel.selectByIndex(2);
		v5.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
		v6.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
		
		
	}
	public void class7() throws InterruptedException {
		sel.selectByIndex(3);
		v7.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
		v8.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
		
	}
	public void class8() throws InterruptedException {
		sel.selectByIndex(4);
		v9.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
		v10.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
	
	}
	public void class9() throws InterruptedException {
		sel.selectByIndex(5);
		v11.click();
		Thread.sleep(200);
		close.click();
		Thread.sleep(2000);
		v12.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
	
	}
    public void class10() throws InterruptedException {
    	sel.selectByIndex(6);
    	v13.click();
    	Thread.sleep(2000);
    	close.click();
    	Thread.sleep(2000);
    	v14.click();
    	Thread.sleep(2000);
    	close.click();
    	Thread.sleep(2000);
    }
	
 
}



