package hr.unipu.java;

abstract class NekiBroj implements ParanBroj {
    private double broj1;
    private double broj2;
    private double parnibroj;

    public double getparnibroj(){
        return parnibroj;
    }

    public void setparnibroj(double parnibroj) {
        this.parnibroj=parnibroj;
    }

    nekibroj(double broj1, double broj2) {
        this.broj1=broj1;
        this.broj2=broj2;
    }

    public double getbroj1() {
        return broj1;
    }
    public double getbroj2() {
        return broj2;
    }

    public double jelinekibrojparan(double broj) {
        if (broj%2==0){
            return 1;
        }
        else {
            return 0;
        }
    }
}