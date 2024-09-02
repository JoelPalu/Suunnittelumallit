import java.util.ArrayList;

public class Department implements OrganisationComponent{

    private String name;
    private ArrayList<OrganisationComponent> childComponents;

    public Department(String name) {
        this.name = name;
        this.childComponents = new ArrayList<>();
    }

    public void add(OrganisationComponent component) {
        childComponents.add(component);
    }

    public void remove(OrganisationComponent component) {
        childComponents.remove(component);
    }

    public int getSalary() {
        int totalSalary = 0;
        for (OrganisationComponent component : childComponents) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String details() {
        StringBuilder details = new StringBuilder("<Department> Name: " + name + "\">");
        details.append("\n     ");
        for (OrganisationComponent component : childComponents) {
            details.append("     ").append(component.details()).append("\n");
        }
        details.append("</Department>");
        return details.toString();
    }

}
