public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver chrome = new Safari();
        chrome.startBrowser();
        chrome.openURL("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();

        //to test other browsers, just change the object name like
        //from chrome to safari and firefox.

        //to test for all the browsers...

        WebDriver []browsers={new Chrome(),new Safari(),new Edge(),new FireFox()};
        for(WebDriver driver:browsers){

            driver.startBrowser();
            driver.openURL(" www.google.com ");
            driver.testLoginPage();
            driver.closeBrowser();
        }
        //we can use using for loop as well, but that is confusing.
    }
}
