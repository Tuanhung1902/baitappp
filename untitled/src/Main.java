import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Quản lý nhân viên");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Hiển thị nhân viên");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Loại nhân viên");
                    System.out.println("1. Nhân viên full time");
                    System.out.println("2. Nhân viên part time");
                    int a = Integer.parseInt(scanner.nextLine());
                    switch (a){
                        case 1:
                            quanLyNhanVien.taoNvFulltime();
                            break;
                        case 2:
                            quanLyNhanVien.taoNvParttime();
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
}
