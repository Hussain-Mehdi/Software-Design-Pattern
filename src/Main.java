import creationalDesignPattern.singleton.Manager;

public class Main {
    public static void main(String[] args) {
        Manager managerObj=Manager.getInstance();

        managerObj.ManagerDetail();
        managerObj.FileManager();
    }
}