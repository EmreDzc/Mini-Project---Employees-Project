public class Programmer extends Employee {
    private String languages;

    public Programmer(String name, String surname, int id, String languages) {
        super(name, surname, id);
        this.languages = languages;
    }

    public void formatting(String system){
        System.out.println(getName() + " is loading the " + system + " system");

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Programmer knows these languages: " + languages);
    }
}
