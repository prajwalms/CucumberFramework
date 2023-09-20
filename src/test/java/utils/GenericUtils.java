package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils {

    public WebDriver driver;

    public GenericUtils(WebDriver driver){
        this.driver= driver;
    }
    public void switchToChildWindow(){
        Set<String> allids = driver.getWindowHandles();
        Iterator<String> it = allids.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
    }
}
