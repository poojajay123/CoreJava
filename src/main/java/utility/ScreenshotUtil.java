package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenshotUtil extends BaseClass{
	public static void CaptureScreenshot(WebDriver driver, String ScreenshotName) throws IOException {
		Date d1 = new Date();
		System.out.println(d1.getTime());

		Date d2 = new Date(d1.getTime());
		System.out.println(d2);

		String format1 = d2.toString();	
		String date = format1.substring(8, 10);
		String month = format1.substring(4, 7);
		String year = format1.substring(format1.length()-4);
		String hour = format1.substring(11, 13);
		String min = format1.substring(14, 16);
		
		//String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String format2 = date.concat(month).concat(year).concat(hour).concat(min);
		System.out.println(format2);
		//String path = "D:\\Java_Project\\AmazonMaven\\Screenshots" + gs.getClass() + format2  + ".png";
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Java_Project\\AmazonMaven\\Screenshots\\"+ ScreenshotName + format2 +".png" );
		try {
		FileHandler.copy(source, destination);
		System.out.println("Screenshot saved:" +destination);
		}catch(IOException e){
			System.out.println("Failed to save Screenshot:" +e.getMessage());
		}	
		}
		}
