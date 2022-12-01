package day31_methodOverriding.browserTask;

public class FireFox extends Browser{
    @Override
    public void openBrowser() {
        System.out.println("opening "+ getClass().getSimpleName()+ " browser");    }

    @Override
    public void closeBrowser() {
        System.out.println("closing "+ getClass().getSimpleName()+ " browser");

    }
}
