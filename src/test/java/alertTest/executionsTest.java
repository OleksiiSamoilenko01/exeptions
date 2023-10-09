package alertTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.css.model.CSSTryRule;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.net.URL;

public class executionsTest extends BaseTestClass {
    String URL = "https://the-internet.herokuapp.com/javascript_alerts";

    @Test
    public void Alerts(){
        driver.get(URL);
        ClickOnButton(Buttons.ALERT);
        workWithAlert(true);
        String result = getResult();
        Assert.assertEquals(result, "You successfully clicked an alert");

    }

    private String getResult() {
        return driver.findElement(By.xpath("//p[@id = \"result\"]")).getText();
    }

    private void ClickOnButton(Buttons button){
        WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(), '" + button.getText() + "')]"));
        alertButton.click();
    }

    enum Buttons {
        ALERT("Click for JS Alert"),
        CONFIRM("Click on JS Confirm");

        private String text;

        Buttons(String s){this.text = s;}

        public String getText() {return text;}
    }

    public void workWithAlert(boolean accept, String... TextToEnter){
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        if(accept){
            alert.accept();
        } else {
            alert.dismiss();
        }

    }


}
