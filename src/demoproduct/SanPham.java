package demoproduct;

import java.util.Scanner;

public class SanPham {
    private String maSP, tenSP, moTa;
    private int gia, soLuong;
    private Scanner scanner = new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String moTa, int gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public void nhap() {
        System.out.println("Nhap ma: ");
        maSP = scanner.nextLine();
        System.out.println("Nhap ten: ");
        tenSP = scanner.nextLine();
        System.out.println("Nhap gia: ");
        gia = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong: ");
        soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap mo ta: ");
        moTa = scanner.nextLine();
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", moTa='" + moTa + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                '}';
    }
}