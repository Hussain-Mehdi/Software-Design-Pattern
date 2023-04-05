package creationalDesignPattern.singleton;

public class Manager extends ManagerTasks{

    private Manager(){}
    static private Manager managerObject = null;

    public static Manager getInstance(){
        if(managerObject==null)
        {
            return managerObject=new Manager();
        }
        return managerObject;
    }
}
