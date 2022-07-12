public interface WebDriver {
    void OpenBrowser();
    void CloseBrowser();
    void MaximizeWindow();
    void FindElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void OpenBrowser() {
        System.out.println("Can open Chrome Browser");
    }

    @Override
    public void CloseBrowser() {
        System.out.println("Can close Chrome Browser");
    }

    @Override
    public void MaximizeWindow() {
        System.out.println("Can maximize Chrome Browser");
    }

    @Override
    public void FindElement() {
        System.out.println("Can find element in Chrome Browser");
    }
}
class FireFox implements WebDriver{

    @Override
    public void OpenBrowser() {
        System.out.println("Can open firefox browser");
    }

    @Override
    public void CloseBrowser() {
        System.out.println("Can close firefox browser");
    }

    @Override
    public void MaximizeWindow() {
        System.out.println("Can maximize firefox browser");
    }

    @Override
    public void FindElement() {
        System.out.println("can find element in firefox browser");
    }

    public static void main(String[] args) {
        WebDriver webdriver = new FireFox();
        WebDriver webdriver1 = new ChromeDriver();
        webdriver1.OpenBrowser();
        webdriver.OpenBrowser();
    }
}
