package clinic.managment.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and student using an ArrayList.
 */
public class Clinic {

    private List<Practitioners> practitioners;
    private List<Client> clients;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param practitioners list of teachers in the school.
     * @param clients list of students in the school.
     */
    public Clinic(List<Practitioners> practitioners, List<Client> clients) {
        this.practitioners = practitioners;
        this.clients = clients;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     * @return the list of teachers in the school.
     */
    public List<Practitioners> getPractitioners() {
        return practitioners;
    }
    /**
     * Adds an employee to the store.
     * @param practitioner the employee to be added.
     */
    public void addTeacher(Practitioners practitioner) {
        practitioners.add(practitioner);
    }
    /**
     * @return the list of students in the school.
     */
    public List<Client> clients() {
        return clients;
    }

    /**
     * Adds student to the school
     * @param client the student to be added.
     */
    public void addStudent(Client client) {
        clients.add(client);
    }

    /**
     *
     * @return the tota money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     * @param MoneySpent the money spent by school.
     */
    public void updateTotalMoneySpent(int MoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
