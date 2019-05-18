package com.example.seleniumjunit5test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.time.LocalDateTime;

public class SnapShotUtils {

    public static void takeSnapShot(WebDriver webdriver) throws Exception {
        String fileName = System.getProperty("user.dir") + "/snapshot/" + LocalDateTime.now().toString()+".png";
        File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(fileName);

        FileUtils.copyFile(srcFile, destFile);

    }

}
