package OOPs;

public class Car {
    String model;
    int year;

   // default constructor
//    Car() {
//        model = "XYZ";
//        year = 1960;
//        System.out.println(model + year);
//    }

       Car() {
        System.out.println("Print Constructor Value");
    }
    //Pram Constructor
    Car(String Model_Name, int Year_Created){
        this.model = Model_Name;
        this.year = Year_Created;

    }

}







