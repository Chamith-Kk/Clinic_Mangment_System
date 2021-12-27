package clinic.managment.system;

/**
 * The class is responsible for keeping track of teacher's name, id, Salary.
 */
public class Practitioners {

    private int id;
    private String name;
    private String specialisation;
    private int salary;
    private int salaryEarned;

    /**
     * Creates new Teacher Object.
     *
     * @param id     id for the teacher.
     * @param name   name of the teacher.
     * @param salary salary of the teacher.
     */

    public Practitioners(int id, String name,String specialisation, int salary) {
        this.id = id;
        this.name = name;
        this.specialisation=specialisation;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return name of the teacher.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id of the teacher.
     */
    public int getId() {
        return id;
    }

    /**
     * @return salary of the teacher.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the salary
     *
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialisation() {
        return specialisation;
    }


    /**
     * Adds to salary.
     * Removes from the total money earned by the school.
     *
     * @param salary
     */
    public void recieveSalary(int salary) {
        salaryEarned += salary;
        Clinic.updateTotalMoneyEarned(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name + "Total salary earned so far £"
                + salaryEarned;
    }
}
