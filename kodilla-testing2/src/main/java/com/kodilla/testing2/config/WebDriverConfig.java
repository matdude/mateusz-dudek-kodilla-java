package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverConfig {
    public final static String OPERA = "OPERA_DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.opera.driver", "f:\\Selenium_drivers\\Opera\\operadriver.exe");

        if (driver.equals(OPERA)) {
            return new OperaDriver();
        } else {
            return null;
        }
    }
}
