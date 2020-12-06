package hr.unipu.java;

public class Pmpd extends NekiBroj {
    private int operacijazadataka;
    private double rezultatzadatka = 0;

    void Pmdp (double broj1, double broj2, int operacijazadataka) {

        this.operacijazadataka = operacijazadataka;
    }

    public double izracun() {

        if (operacijazadataka==1) {
            rezultatzadatka = getBroj1() + getBroj2();
        }
        else if (operacijazadataka==2) {
            rezultatzadatka = getBroj1() - getBroj2();
        }
        else if (operacijazadataka==3) {
            rezultatzadatka = getBroj1() * getBroj2();
        }
        else if (operacijazadataka==4) {
            rezultatzadatka = getBroj1() / getBroj2();
        }
        else if (operacijazadataka==5) {
            double PrviBr = getBroj1();
            double DrugiBr = getBroj2();

            if (JeLiNekiBrojParan(PrviBr)==1) {
                System.out.println("Prvi broj koji ste upisali je broj: " + PrviBr + "i on je parni broj." );
            }
            else {
                System.out.println("Prvi broj koji ste upisali je broj: " + PrviBr + "i on je neparni broj");
            }

            if (JeLiNekiBrojParan(DrugiBr)==1){
                System.out.println("Drugi broj koji ste upisali je broj: " + DrugiBr + "i on je parni broj.");
            }
            else{
                System.out.println("Drugi broj koji ste upisali je broj: " + DrugiBr + " i on je neparani broj.");
            }
        }

        else {
            System.out.println("Dogodila se pogreška. Molimo odaberite jednu od ponuđenih opcija.");
        }

        return rezultatzadatka;
    }

    @Override
    public double getParanBroj() {
        return 0;
    }

    @Override
    public void setparanbroj(double paranbroj) {

    }
}
