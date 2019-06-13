package builderpackage;

public class Empleado {
    public static void main(String[] args) {
        Employee miEmpleado;
        miEmpleado= new EmployeeBuilder(3445,"Pedro")
                             .createEmployee();
        System.out.println(miEmpleado.toString());


    }
}