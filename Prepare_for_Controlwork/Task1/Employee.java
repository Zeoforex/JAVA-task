package Prepare_for_Controlwork.Task1;

public abstract class Employee {
    private int id; //индентификатор
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double calculationSalary();
}
