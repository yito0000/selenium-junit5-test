package com.example.seleniumjunit5test.controller;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static com.example.seleniumjunit5test.SnapShotUtils.takeSnapShot;

public class AppControllerTest {

    @Test
    public void testApp() throws Exception {
        Capabilities chromeCapabilities = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), chromeCapabilities);

        // TODO デプロイしてドメインを設定
        driver.get("http://xxxxx/input");

        // 入力画面 初期表示
        takeSnapShot(driver);

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("test name");

        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("24");

        // 入力画面 入力後
        takeSnapShot(driver);

        WebElement inputSubmit = driver.findElement(By.id("submit"));
        inputSubmit.click();

        // 確認画面
        takeSnapShot(driver);

        WebElement confirmSubmit = driver.findElement(By.id("submit"));
        confirmSubmit.click();

        // 完了画面
        takeSnapShot(driver);

        driver.quit();

    }
}