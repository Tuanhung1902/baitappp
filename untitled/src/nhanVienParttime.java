public class nhanVienParttime extends nhanVien {
    private double sobuoi;

    public nhanVienParttime(String name, int age, String gender, double sobuoi) {
        super(name, age, gender);
        this.sobuoi = sobuoi;
    }

    public double getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(double sobuoi) {
        this.sobuoi = sobuoi;
    }

    public nhanVienParttime(double sobuoi) {
        this.sobuoi = sobuoi;
    }
    public double getluong(){
        return sobuoi*200000;
    }

    @Override
    public String toString() {
        return "nhanVienParttime{" +
                "sobuoi=" + sobuoi + "luong =" + getluong() +
                '}';
    }
}
