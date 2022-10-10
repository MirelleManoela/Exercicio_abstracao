package Entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures ;

    public Individual(){
        super();
    }
    public Individual(String name, Double anuallncome, Double healthExpenditures){
        super(name, anuallncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if ( anuallncome < 2000) {
         return  anuallncome * 0.15 - healthExpenditures * 0.5;

        }
         else
            return (anuallncome *  0.25) - (healthExpenditures * 0.5);
            }


    }

