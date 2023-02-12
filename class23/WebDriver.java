package class23;

public class WebDriver {


        public void startBrowser(){
            System.out.println("starting the browser");
        }

        public void openURL(){
            System.out.println("opening a url");
        }

        public void testLoginPage(){
            System.out.println("checking if login page works");
        }

        public void closeBrowser(){
            System.out.println("closing the browser");
        }

    }

    class Chrome extends WebDriver{
        @Override
        public void startBrowser() {
            super.startBrowser();
            System.out.println("Starting Google Chrome");
        }

        @Override
        public void openURL() {
            super.openURL();
            System.out.println("Opening the url in Google Chrome");
        }

        @Override
        public void testLoginPage() {
            super.testLoginPage();
            System.out.println("Testing the login page in Chrome");
        }

        @Override
        public void closeBrowser() {
            super.closeBrowser();
            System.out.println("closing the Google Chrome");
        }
    }


    class Safari extends WebDriver {
        public void startBrowser() {
            super.startBrowser();
            System.out.println("Starting Safari");
        }

        public void openURL() {
            super.openURL();
            System.out.println("Opening the url in Safari");
        }

        public void testLoginPage() {
            super.testLoginPage();
            System.out.println("Testing the login page in Safari");

        }

        public void closeBrowser() {
            super.closeBrowser();
            System.out.println("closing the Safari");
        }
    }



