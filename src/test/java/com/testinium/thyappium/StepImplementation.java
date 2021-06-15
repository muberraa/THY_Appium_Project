package com.testinium.thyappium;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;


public class StepImplementation extends BaseTest {

        @Step("<key> id li elementi bul ve tıkla")
        public void clickBYid(String key){

            appiumDriver.findElement(By.id(key)).click();
        }

       @Step("<key> id li elemente <text>  değerini yaz")
        public void sendkeyBYid(String key,String text){

            appiumDriver.findElement(By.id(key)).sendKeys(text);
        }

        @Step("<key> xpath li elemente tıkla")
        public void clickBYxpath(String key){

            appiumDriver.findElement(By.xpath(key)).click();
        }
        @Step("<key> xpath li elemente <text>  değerini yaz")
        public void sendkeyBYxpath(String key,String text){

            appiumDriver.findElement(By.xpath(key)).sendKeys(text);
        }
        @Step({"<key> id li ucus listesini kontrol et"})
        public void listControl(String key){
            Assert.assertTrue("Ucus Listelenmedi",appiumDriver.findElement(By.id(key)).isDisplayed());
    }

        @Step("<number> saniye bekle")
        public void waitForSeceond(int number) throws InterruptedException {
            Thread.sleep(number*1000);
        }


}



