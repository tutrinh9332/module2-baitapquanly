
package demoproduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        Scanner scanner = new Scanner(System.in);
        String menuString = "=== Menu ===\n" +
                "1. Hiển thị sản phẩm\n" +
                "2. Thêm 1 Sp \n" +
                "3. Xóa sp tại index \n" +
                "4. Sửa/ cập nhật\n" +
                "5. Sắp xếp\n" +
                "6. Thoát.";

        while (true) {
            System.out.println(menuString);
            System.out.println("Nhap tùy chọn: ");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    quanLySanPham.hienThi();
                    break;
                case 2:
                    quanLySanPham.them1SanPham();
                    break;
                case 3:
                    System.out.println("Nhap vi tri can xoa: ");
                    int viTri = Integer.parseInt(scanner.nextLine());
                    quanLySanPham.xoaTaiViTri(viTri);
                    break;
                case 4:
                    System.out.println("Nhap ma can sua: ");
                    String maCanSua = scanner.nextLine();
                    quanLySanPham.suaSanPham(maCanSua);
                    break;
                case 5:
                    quanLySanPham.sapXepTheoGia();
                    break;
            }
        }
    }
}