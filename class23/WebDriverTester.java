package class23;

import java.util.concurrent.Callable;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver=new Safari(); // up casting
        // Safari safari=new Safari9; // down casting
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

    // on Array of type parent class can hold the objects af all the child classes

      Chrome chrome=new Chrome();
      Safari safari=new Safari();
     //  WebDriver [] browsers={chrome,safari};
        WebDriver [] browsers={new Chrome(),new Safari()};
        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }


    }
}
