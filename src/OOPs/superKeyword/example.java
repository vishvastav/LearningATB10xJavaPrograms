package OOPs.superKeyword;

public class example {
}

class BaseClass{
    private String browser;

    public BaseClass(String browser){
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean IsAdmin) {
        if(IsAdmin){
            this.browser = browser;
        }else System.out.println("Not Allowed to set browser");
    }
    class TestCase1 extends BaseClass{
        public TestCase1(String browser){
            super(browser);
        }
    }
}
