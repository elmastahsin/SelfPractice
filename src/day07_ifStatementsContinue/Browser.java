package day07_ifStatementsContinue;

public class Browser {
    public static void main(String[] args) {


        String browserName = "yandex";
        String result = "";
        if (browserName == "chrome" || browserName == "firefox" || browserName == "safari" || browserName == "opera") {
            if (browserName == "chrome") {
                result += "Chrome Browser is selected";
            } else if (browserName == "firefox") {
                result += "Firefox Browser is selected";
            } else if (browserName == "safari") {
                result = "Firefox Browser is selected";
            } else {
                result += "Opera Browser is selected";
            }


        } else {
            result = " Invalid Browser Name";
        }

        System.out.println("result = " + result);


    }
}
/*
        String browserName = "chrome";

        String result = "Invalid Browser Name";


        boolean validBrowser = browserName == "chrome" || browserName == "firefox"
                            || browserName == "opera" || browserName == "safari"
                            ||browserName == "edge";

        if(validBrowser){

            if (browserName == "chrome"){
                result = "Chrome browser is selected";
            }else if(browserName == "firefox"){
                result = "Firefox browser is selected";
            }else if(browserName == "opera"){
                result = "Opera browser is selected";
            }else if(browserName == "safari"){
                result = "Safari browser is selected";
            }else{
                result = "Edge browser is selected";
            }

        }


        System.out.println(result);*/
