package com.base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class baseClass {
	public static WebDriver driver;

	public static WebDriver getDriver(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}

	public void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void sendKeys(WebElement element, String getdata) {
		element.sendKeys(getdata);
	}

	public static void Click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public void navigateToUrl(String url) {
		driver.navigate().to(url);
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void navigateBackward() {
		driver.navigate().back();
	}

	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	public String gettext(WebElement element) {
		String text = element.getText();
		return text;

	}

	public void toDelelteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public void setSizeOfWindow(int a, int b) {
		Dimension d = new Dimension(a, b);
		driver.manage().window().setSize(d);
	}

	public void setPositionOfWindow(int a, int b) {
		Point p = new Point(a, b);
		driver.manage().window().setPosition(p);
	}

	public void actionMoveElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click().perform();
	}

	public void actionsClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}

	public void actionDragAndDrop(WebElement element1, WebElement element2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element1, element2);
	}

	public void actionContextCLick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public void actionDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void actionsDragByClick(WebElement element1, WebElement element2) {
		Actions a = new Actions(driver);
		a.clickAndHold(element1).moveToElement(element2).release().perform();
	}

	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public void alertgetText() {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
	}

	public void alertSendkeys(String data) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(data);
	}

	public void jsScrollDownElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void jsScrollUpElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);
	}

	public void jsScrollDownpixel() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public void jsScrollUppixes(int a, int b) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(a,b)");
	}

	public void getScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		FileUtils.copyFile(screenshotAs, f);
	}

	public static void dropdownSelectByIndex(WebElement element, int getdata) {
		Select s = new Select(element);
		s.selectByIndex(getdata);
	}

	public void dropdownSelectByVisibleText(WebElement element, String a) {
		Select s = new Select(element);
		s.selectByVisibleText(a);
	}

	public void dropdownSelectByValue(WebElement element, String a) {
		Select s = new Select(element);
		s.selectByValue(a);
	}

	public void dropdownDeSelectByIndex(WebElement element, int a) {
		Select s = new Select(element);
		s.deselectByIndex(a);
	}

	public void dropdownDeSelectByVisibleText(WebElement element, String a) {
		Select s = new Select(element);
		s.deselectByVisibleText(a);
	}

	public void dropdownDeSelectbyvalue(WebElement element, String a) {
		Select s = new Select(element);
		s.deselectByValue(a);
	}

	public void dropdownDeSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public void excelinsert1(int rownum, int cellnum, String data) throws IOException {
		File f = new File("D:\\Book2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
	}

	public void excelRead(int rownum, int cellnum, String data, String data1) throws IOException {
		File f = new File("C:\\Users\\Manoj\\Desktop\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals(data)) {
			cell.setCellValue(data1);
			cell.setCellValue(data);
			FileOutputStream fo = new FileOutputStream(f);
			w.write(fo);
		}
	}

	public static String getdata(String FilePath, String SheetName, int rownum, int cellnum) throws IOException {
		File f = new File(FilePath);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String stringCellValue = cell.getStringCellValue();
		return stringCellValue;
	}

	public static int getdataNumeric(String FilePath, String SheetName, int rownum, int cellnum) throws IOException {
		File f = new File(FilePath);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		double numericCellValue = cell.getNumericCellValue();
		int l = (int) numericCellValue;
		return l;
	}

	public static void getDatafromexcel(String filepath, String sheetname, int rownum, int cellnum) throws IOException {

		File f = new File(filepath);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();

		if (cellType == 1) {
			String data = cell.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(cell)) {
			Date l = cell.getDateCellValue();
			SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
			String.valueOf(data);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long data = (long) numericCellValue;
			String.valueOf(data);
		}

	}

	public String getdate(int rownum, int cellnum) throws IOException {
		File f = new File("D:\\Book2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		DateUtil.isCellDateFormatted(cell);
		Date l = cell.getDateCellValue();
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		return String.valueOf(l);
	}

	public static String getnum(String path, String SheetName, int rownum, int cellnum) throws IOException {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		double numericCellValue = cell.getNumericCellValue();
		long data = (long) numericCellValue;
		return String.valueOf(data);
	}

	public String excelinsert(int rownum, int cellnum, String data) throws IOException {
		File f = new File("D:\\Book2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		return data;
	}

	public static String excelcreate(String path, String SheetName, int rownum, int cellnum, String data)
			throws IOException {
		File f = new File(path);
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet(SheetName);
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		return data;

	}

	public static void frame(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
	}

	public static void frameIndex(int num) {
		driver.switchTo().frame(num);
	}

	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void windowhandlesSS(String string1) throws IOException {
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!parent.equals(string)) {
				driver.switchTo().window(string);
				screenshotFp(string1);
				driver.close();
			}

		}
		driver.switchTo().window(parent);
	}

	public static WebDriver parentframe() {
		WebDriver defaultContent = driver.switchTo().defaultContent();
		return defaultContent;
	}

	public static WebDriverWait webDriverWait() {
		WebDriverWait w = new WebDriverWait(driver, 10);
		return w;
	}

	public static void screenshotFp(String Filepath) throws IOException {
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "png", new File(Filepath));
	}

	public static int last_Row_Num(String path, String SheetName) throws IOException {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet(SheetName);
		int lastRowNum = sheet.getLastRowNum();
		return lastRowNum;
	}

	private void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
}
