package clinic.managment.system;
/**
 * This class is responsible for keeping track of students fees, name,grade & fees paid.
 */
public class Client {

    private int id;
    private String name;
    private int no_OfSessions;
    private int  feesPaid;
    private int feesTotal;
    private String issue;

    /**
     * To create a new student by initializing.
     * Fees fore every student is £30,000.
     * Fees initially paid is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param no_OfSessions no of sessions that client has had.
     * @param issue the issue with the particular client.
     *
     */
    public Client(int id, String name,String issue, int no_OfSessions){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.issue=issue;
        this.no_OfSessions = no_OfSessions;
    }

    /**
     * This updates student's grade.
     * @param sessionno new grade of the student.
     */

    public void setGrade(int sessionno){
        this.no_OfSessions = sessionno;
    }

    /**
     * Keep adding fees to feesPaid field.
     * Add fees to the fees paid.
     * The school will receive the funds.
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees){
        feesPaid += fees;
        Clinic.updateTotalMoneyEarned(feesPaid);
    }
    /**
     * @return id of the student.
     */
    public int getId() {
        return id;
    }
    /**
     * @return grade of the student.
     */
    public int get_noOfSessions() {
        return no_OfSessions;
    }

    /**
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the total fees paid by the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    @Override
    public String toString(){
        return "Student's name :"+name+
                " Total fees paid so far £"+ feesPaid;
    }

}
