import FactroyPattern.Factory;
import FactroyPattern.Transport;
import creationalDesignPattern.singleton.Manager;

public class Main {
    public static void main(String[] args) {
        //Singleton Design Pattern
        //Manager managerObj=Manager.getInstance();
        //managerObj.ManagerDetail();
        //managerObj.FileManager();

        //Factory Design Pattern

        Factory deliveryType=new Factory();

        Transport truck=deliveryType.getTransport("truck");
        truck.LogisticsTransport();

        Transport ship=deliveryType.getTransport("ship");
        ship.LogisticsTransport();

    }
}