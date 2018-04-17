package automationtesting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Oppir Hutapea
 */
public class AutomationTesting {

    /**
     * @param args the command line arguments
     */
    
    private static WebDriver driver=null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", 
                "H:\\Explorasi\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
        
        //get URL
        driver.get("https://demo.midtrans.com/");
        WebElement click_buy_now = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div/a"));
        click_buy_now.click();
        WebElement click_checkout = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[2]/div[1]"));
        click_checkout.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        WebElement click_continue = driver.findElement(By.xpath("a[ends-with(@href,'select-payment')]"));
//        click_continue.click();
//        WebElement continuePayment = driver.findElement(By.xpath("[@class='button-main show']//*a[button-main-content]//*[text()='CONTINUE']"));
//        continuePayment.click();
//        
        WebElement continueP=driver.findElement(By.xpath("//select[@id=app]/select[@id=application]/option[text()='CONTINUE']"));
        continueP.click();
        
        WebElement creditCard=driver.findElement(By.xpath("//select[@id=app]/select[@id=application]/option[text()='Creadit Card']"));
        continueP.click();
        
        WebElement cardNumber=driver.findElement(By.name("cardnumber"));
        cardNumber.sendKeys("4811111111111114");
        System.out.println(cardNumber.getText());
        
        WebElement enterExDate=driver.findElement(By.name("Expiry date"));
        enterExDate.sendKeys("01/23");
        System.out.println(enterExDate.getText());
        
        WebElement cvv=driver.findElement(By.name("CVV"));
        cvv.sendKeys("123");
        System.out.println(cvv.getText());
        

        WebElement pay_now = driver.findElement(By.xpath("//*[@id=\"application\"]/div[1]/a/div[1]/span"));
        pay_now.click();

        WebElement password=driver.findElement(By.xpath("//*[@id='PaRes']"));
        password.sendKeys("112233");
        System.out.println(password.getText());
        
        WebElement click_ok=driver.findElement(By.name("OK"));
        click_ok.click();
        
    }
}
