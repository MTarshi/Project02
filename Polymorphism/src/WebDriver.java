public class WebDriver {
    public void startBrowser(){
        System.out.println(" Starting the browser ");
    }
    public void openURL(String url){
        System.out.println("opening "+url);
    }
    public void testLoginPage(){
        System.out.println(" Checking if login page is visible ");
    }
    public void closeBrowser(){
        System.out.println(" closing the browser ");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println(" Opening Google chrome ");
    }

    @Override
    public void openURL(String url) {
        System.out.println(" Opening the URL "+url+" on google chrome ");
    }

    @Override
    public void testLoginPage() {
        System.out.println(" Testing login page on google chrome ");
    }

    @Override
    public void closeBrowser() {
        System.out.println(" closing the google chrome ");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println(" starting the FireFox ");
    }

    @Override
    public void openURL(String url) {
        System.out.println(" Opening the URL"+url+"on Firefox ");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("starting the Safari");
    }

    @Override
    public void openURL(String url) {
        System.out.println("Opening the URL"+url+"on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}
class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("starting the Edge");
    }

    @Override
    public void openURL(String url) {
        System.out.println("Opening the URL"+url+"on Edge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Edge");
    }
}

