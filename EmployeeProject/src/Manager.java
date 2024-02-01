public class Manager extends Employee{
    private int responsPerson;

    public Manager(String name, String surname, int id, int responsPerson) {
        super(name, surname, id);
        this.responsPerson = responsPerson;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Manager's number of person: " + responsPerson);
    }
    public void getRaise(int numOfRaise){
        System.out.println(getName() + " gived the "+ numOfRaise + " euro for every employees. " );
    }
}
