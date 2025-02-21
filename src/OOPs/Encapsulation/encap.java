package OOPs.Encapsulation;

public class encap {
    public static void main(String[] args) {
        VMOlogin Vmologin =new VMOlogin("Vishal","Password123");
       // System.out.println(Vmologin.password);
       // Vmologin.password = "XYZ";
        //System.out.println(Vmologin.password);

        GoodEncapsulation GE = new GoodEncapsulation("Kritika","657586");
//        System.out.println(GE.password);
//        GE.password = "xyZ";
//        System.out.println(GE.password);

//        System.out.println(GE.getPassword());
        boolean isAdmin = true;
        GE.setPassword("ASFG24325",isAdmin);
        System.out.println(GE.getPassword());


    }

}

class VMOlogin{
    String username;
    String password;

    VMOlogin(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }
}

class GoodEncapsulation{
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin= true)  {
            this.password = password;
        }else System.out.println("Not Allowed to change");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    GoodEncapsulation(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }
}
