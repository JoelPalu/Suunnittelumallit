public class Main2 {
    public static void main(String[] args){

        OrganisationComponent employee1 = new Employee("John", 10000);
        OrganisationComponent employee2 = new Employee("David", 15000);
        OrganisationComponent employee3 = new Employee("Lisa", 20000);

        OrganisationComponent department1 = new Department("Development");
        OrganisationComponent department2 = new Department("Marketing");
        OrganisationComponent department3 = new Department("Human Resources");

        OrganisationComponent headDepartment = new Department("Head Department");

        headDepartment.add(department1);
        headDepartment.add(department2);
        headDepartment.add(department3);

        department1.add(employee1);

        department2.add(employee2);

        department3.add(employee3);

        System.out.println("Total salary of the organisation: " + headDepartment.getSalary());

        System.out.println(headDepartment.details());


        headDepartment.remove(department2);


        System.out.println("<------------------------------------->");

        System.out.println("Total salary of the organisation: " + headDepartment.getSalary());
        System.out.println(headDepartment.details());


    }
}
