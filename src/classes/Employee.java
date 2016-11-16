package classes;

/**
 * Created by JPMPC-B210 on 11/10/2016.
 */
public class Employee extends Person {

    public int employee_Id_no;
    public String department ;
    public int sss_Id_no;

    public int getEmployee_Id_no() {
        return employee_Id_no;
    }

    public String getDepartment() {
        return department;
    }

    public int getSss_Id_no() {
        return sss_Id_no;
    }

    public void setEmployee_Id_no(int employee_Id_no) {
        this.employee_Id_no = employee_Id_no;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSss_Id_no(int sss_Id_no) {
        this.sss_Id_no = sss_Id_no;
    }
}
