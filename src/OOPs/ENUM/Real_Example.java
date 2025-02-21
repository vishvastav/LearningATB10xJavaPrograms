package OOPs.ENUM;

public class Real_Example {
    public static void main(String[] args) {
        System.out.println(URLS.google);
        System.out.println(Locators.page_button);
    }
}

enum URLS{
    google,restassured
}

enum Locators{
    page_button("#btn"),
    page_input("input1");

    private String locator;

    Locators(String locator){
        this.locator=locator;
    }

}