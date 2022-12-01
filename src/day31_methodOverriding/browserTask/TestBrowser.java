package day31_methodOverriding.browserTask;

public class TestBrowser {
    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();

        chrome.openBrowser();
        chrome.closeBrowser();
        System.out.println("*******************************************************");
        Safari safari = new Safari();

        safari.openBrowser();
        safari.closeBrowser();
        System.out.println("*******************************************************");
        Opera opera = new Opera();

        opera.openBrowser();
        opera.closeBrowser();
        System.out.println("*******************************************************");
        FireFox fireFox = new FireFox();

        fireFox.openBrowser();

        fireFox.closeBrowser();
    }
}
