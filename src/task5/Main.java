package task5;

public class Main extends TshirtC201109 implements Printable  {

    public static void main(String[] args) {

    TshirtC201109 obj=new TshirtC201109();

    obj.setName("Winter Cloths");
        System.out.println("the Tshirt you want is "+' '+obj.getName());

        TotalPrice cost =new TotalPrice();
       

        System.out.println("You have to pay total : "+cost.add(obj.mainPrice(),obj.GechengDiscount(),cost.tax)+"taka where "+cost.tax+" tax added");
        System.out.println("Thanks come Again here:) ");
        Printable pr =new Main();
        pr.NEWMODELSuggetions();
    }

    @Override
    public void NEWMODELSuggetions() {
        System.out.println("Some new model will come ASAP in this store:");
        System.out.println("1.product_id(xfer)\n"+"2.product_id(sfec)" );
    }



}