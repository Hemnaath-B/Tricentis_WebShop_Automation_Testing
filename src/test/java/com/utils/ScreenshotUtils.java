//package com.utils;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//public class ScreenshotUtils{
//public void captureScreenshot(String scenarioName) {
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	File srcFile = ts.getScreenshotAs(OutputType.FILE);
//
//	String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//	String screenshotName = scenarioName.replaceAll(" ", "_") + "_" + timestamp + ".png";
//
//	File destFile = new File("target/screenshots/" + screenshotName);
//
//	try {
//		FileUtils.copyFile(srcFile, destFile);
//		System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//}
//}
