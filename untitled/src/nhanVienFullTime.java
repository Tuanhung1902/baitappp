public class nhanVienFullTime extends nhanVien{
    private double heso;

    public nhanVienFullTime(double heso) {
        this.heso = heso;
    }

    public nhanVienFullTime(String name, int age, String gender, double heso) {
        super(name, age, gender);
        this.heso = heso;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }
    public double getluong(){
        return heso * 500000;
    }

    @Override
    public String toString() {
        return "nhanVienFullTime{" +
                "heso=" + heso + "luong = " + getluong() +
                '}';
    }
}
