import java.util.Scanner;

public class quanLyNhanVien {
    nhanVien[] nhanViens = new nhanVien[0];

    public quanLyNhanVien() {
    }

    public void addFulltime(nhanVienFullTime nhanVien1) {
        nhanVien[] nhanViens1 = new nhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens1[i] = nhanViens[i];
        }
        nhanViens1[nhanViens.length-1] = nhanVien1;
        nhanViens = nhanViens1;
    }


    public static nhanVien taoNvFulltime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên");
        String name = scanner.nextLine();
        System.out.println("Tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        System.out.println("Hệ số");
        double heso = Double.parseDouble(scanner.nextLine());
        nhanVien nhanVienfulltime = new nhanVienFullTime(name, age, gender, heso);
        return nhanVienfulltime;
    }
    public void addParttime(nhanVienParttime nhanVien2) {
        nhanVien[] nhanViens1 = new nhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens1[i] = nhanViens[i];
        }
        nhanViens1[nhanViens.length-1] = nhanVien2;
        nhanViens = nhanViens1;
    }

    public static nhanVien taoNvParttime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên");
        String name = scanner.nextLine();
        System.out.println("Tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        System.out.println("Số buổi");
        double sobuoi = Double.parseDouble(scanner.nextLine());
        nhanVien nhanVienparttime = new nhanVienParttime(name, age, gender, sobuoi);
        return nhanVienparttime;
    }
    public void delete(nhanVienParttime nhanVien2) {
        nhanVien[] nhanViens1 = new nhanVien[nhanViens.length - 1];
        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens1[i] = nhanViens[i + 1];
        }
        nhanViens1[nhanViens.length-1] = nhanVien2;
        nhanViens = nhanViens1;
    }
}
