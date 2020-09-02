package org.Millais.com.PageObjectpackage;

import org.Millais.com.Commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class VacancyPage  extends DriverFactory {

    public void baseurl(){
        driver.getCurrentUrl();
        driver.findElement(By.cssSelector("button[class='btn btn-primary accept-cookies']")).click();
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Vacancies"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("Teaching"))).click().build().perform();
    }
    public void parent(){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Parents"))).build().perform();
        actions.moveToElement(driver.findElement(By.linkText("Term Dates"))).click().build().perform();

        driver.findElement(By.linkText("West Sussex County Council Term Dates")).click();
    }
}
