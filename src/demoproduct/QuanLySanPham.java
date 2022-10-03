package demoproduct;

import java.util.ArrayList;

public class QuanLySanPham {
    private ArrayList<SanPham> listSanPham;

    public QuanLySanPham() {
        this.listSanPham = new ArrayList<>();
    }

    public void hienThi() {
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < listSanPham.size(); i++) {
            System.out.println(listSanPham.get(i).toString());
        }
    }

    public void them1SanPham() {
        SanPham sanPham = new SanPham();
        sanPham.nhap();
        listSanPham.add(sanPham);
    }

    public void xoaTaiViTri(int viTri) {
        if (viTri<listSanPham.size() && viTri>=0)
            listSanPham.remove(viTri);
    }

    public void suaSanPham(String maCanSua) {
        for (int i = 0; i < listSanPham.size(); i++) {
            if (maCanSua.equals(listSanPham.get(i).getMaSP())) {
                listSanPham.get(i).nhap();
            }
        }
    }

    // sap xep tang dan
    public void sapXepTheoGia() {
        for (int i=0; i<listSanPham.size()-1; i++) {
            for (int j = i+1; j < listSanPham.size(); j++) {
                if (listSanPham.get(i).getGia() > listSanPham.get(j).getGia()) {
                    //doi cho i, j
                    SanPham tmp = listSanPham.get(i);
                    listSanPham.set(i, listSanPham.get(j));
                    listSanPham.set(j, tmp);
                }
            }
        }
    }
}