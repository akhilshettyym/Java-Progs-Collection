import java.util.*;
public class EmployeeA {
    String ename;
    int eid;
    String eadd;
    String email;
    long emob;
    Scanner s= new Scanner(System.in);
    void input() {
        System.out.println("Enter the name of the employee:");
        ename = s.next();
        System.out.println("Enter the id no. of the employee :");
        eid = s.nextInt();
        System.out.println("Enter the address of the employee:");
        eadd = s.next();
        System.out.println("Enter the mail id of the employee:");
        email = s.next();
        System.out.println("Enter the mobile number of the employee:");
        emob = s.nextLong();
    }
}
class Programmer extends EmployeeA {
    double bp, da, hra, pf, scf, gs, ns;

    void get_data() {
        System.out.println("Enter the basic pay:");
        bp = s.nextDouble();
    }

    void calculate() {
        da = 0.97 * bp;
        hra = 0.01 * bp;
        pf = 0.12 * bp;
        scf = 0.001 * bp;
        gs = da + hra + bp;
        ns = gs - (pf + scf);
    }

    void pay_slip() {
        System.out.println("Payslip" + "\n" + "________");
        System.out.println("employee name=" + ename + "\n" + "employee id=" + eid + "\n" + "employee address =" + eadd + "\n" + "employee mailid+" + email + "\n" + "employee mobile no.=" + emob + "\n");
        System.out.println("basic pay=" + bp + "\n" + "da=" + da + "\n" + "hra=" + hra + "\n" + "pf=" + pf + "\n" + "scf=" + scf + "\n" + "gs=" + gs + "\n" + "ns=" + ns + "\n");
    }
}
class AssociateProfessor extends EmployeeA {
    double bp, da, hra, pf, scf, gs, ns;

    void get_data() {
        System.out.println("Enter the basic pay:");
        bp = s.nextDouble();
    }

    void calculate() {
        da = 0.97 * bp;
        hra = 0.01 * bp;
        pf = 0.12 * bp;
        scf = 0.001 * bp;
        gs = da + hra + bp;
        ns = gs - (pf + scf);
    }

    void pay_slip() {
        System.out.println("Payslip" + "\n" + "________");
        System.out.println("employee name=" + ename + "\n" + "employee id=" + eid + "\n" + "employee address =" + eadd + "\n" + "employee mailid+" + email + "\n" + "employee mobile no.=" + emob + "\n");
        System.out.println("basic pay=" + bp + "\n" + "da=" + da + "\n" + "hra=" + hra + "\n" + "pf=" + pf + "\n" + "scf=" + scf + "\n" + "gs=" + gs + "\n" + "ns=" + ns + "\n");
    }
}
class AssistantProfessor extends EmployeeA {
    double bp, da, hra, pf, scf, gs, ns;

    void get_data() {
        System.out.println("Enter the basic pay:");
        bp = s.nextDouble();
    }

    void calculate() {
        da = 0.97 * bp;
        hra = 0.01 * bp;
        pf = 0.12 * bp;
        scf = 0.001 * bp;
        gs = da + hra + bp;
        ns = gs - (pf + scf);
    }

    void pay_slip() {
        System.out.println("Payslip" + "\n" + "________");
        System.out.println("employee name=" + ename + "\n" + "employee id=" + eid + "\n" + "employee address =" + eadd + "\n" + "employee mailid+" + email + "\n" + "employee mobile no.=" + emob + "\n");
        System.out.println("basic pay=" + bp + "\n" + "da=" + da + "\n" + "hra=" + hra + "\n" + "pf=" + pf + "\n" + "scf=" + scf + "\n" + "gs=" + gs + "\n" + "ns=" + ns + "\n");
    }
}
class Professor extends EmployeeA {
    double bp, da, hra, pf, scf, gs, ns;

    void get_data() {
        System.out.println("Enter the basic pay:");
        bp = s.nextDouble();
    }

    void calculate() {
        da = 0.97 * bp;
        hra = 0.01 * bp;
        pf = 0.12 * bp;
        scf = 0.001 * bp;
        gs = da + hra + bp;
        ns = gs - (pf + scf);
    }

    void pay_slip() {
        System.out.println("Payslip" + "\n" + "________");
        System.out.println("employee name=" + ename + "\n" + "employee id=" + eid + "\n" + "employee address =" + eadd + "\n" + "employee mailid+" + email + "\n" + "employee mobile no.=" + emob + "\n");
        System.out.println("basic pay=" + bp + "\n" + "da=" + da + "\n" + "hra=" + hra + "\n" + "pf=" + pf + "\n" + "scf=" + scf + "\n" + "gs=" + gs + "\n" + "ns=" + ns + "\n");
    }
}
class EmployeeA_payslip
{
    public static void main(String[] args)
    {
        int choice;
        Scanner s=new Scanner(System.in);
        System.out.println("MENU\n ______\n");
        System.out.println("1.Programmer\n2.Assistant Professor\n3.Associate Professor\n4.Professor\n");
        System.out.println("Enter your choice:");
        choice=s.nextInt();
        switch(choice)
        {
            case 1:Programmer p=new Programmer();
            p.input();
            p.get_data();
            p.calculate();
            p.pay_slip();
            break;
            case 2:AssistantProfessor a1=new AssistantProfessor();
                a1.input();
                a1.get_data();
                a1.calculate();
                a1.pay_slip();
                break;
            case 3:AssociateProfessor a2=new AssociateProfessor ();
                a2.input();
                a2.get_data();
                a2.calculate();
                a2.pay_slip();
                break;
            case 4:Professor p1=new Professor();
                p1.input();
                p1.get_data();
                p1.calculate();
                p1.pay_slip();
                break;
                default:System.out.println("invalid choice!!!");
                System.exit(0);
        }
    }
}
