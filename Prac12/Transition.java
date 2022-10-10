package Prac12;
class Bank1 {

    private String name;

    Bank1(String name) {

        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

class Employeee {
    private String name;

    Employeee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

class Branch{
    private String name;

    Branch(String name){
        this.name = name;
    }

    public String getBranceName() {
        return this.name;
    }
}
public class Transition
{
    public static void main(String[] args) {
        Bank1 bank = new Bank1("BOB");
        Employeee emp = new Employeee("Manthan Patel");
        Branch brc = new Branch("Anand");
        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName() + " in " + brc.getBranceName() + " branch");
    }
}
