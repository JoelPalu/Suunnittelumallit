public class Employee implements OrganisationComponent {

    private String name;
    private int salary;


    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganisationComponent component) {
        throw new UnsupportedOperationException("Cannot add to an Employee");

    }

    @Override
    public void remove(OrganisationComponent component) {
        throw new UnsupportedOperationException("Cannot remove from an Employee");

    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String details() {
        return "<Employee> Name: " + name + ", Salary: " + salary + "/>";
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
