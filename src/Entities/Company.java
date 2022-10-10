package Entities;

public class Company extends TaxPayer {

    private int numberofemployees ;

    public Company(){
        super();
    }
    public Company(String name, double anuallncome, int numberofemployees){
        super(name, anuallncome);
        this.numberofemployees = numberofemployees;
    }

    public int getNumberofemployees() {
        return numberofemployees;
    }

    public void setNumberofemployees(int numberofemployees) {
        this.numberofemployees = numberofemployees;
    }

    @Override
    public double tax() {
        if (numberofemployees > 10){
            return  anuallncome * 0.14;
        }
        else
            return anuallncome * 0.16;
    }
}
