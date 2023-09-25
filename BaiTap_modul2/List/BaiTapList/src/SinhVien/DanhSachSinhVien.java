package SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public void addSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    public void hienThiDanhSach(){
        for (int i = 0; i < danhSach.size(); i++){
            System.out.println(danhSach.get(i));
        }
    }
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();//danh sach co rong hay khong
    }
    public int kiemTraLuongSV(){
        return this.danhSach.size();
    }
    public void lamRongDanhachSinhVien(){
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTai(String sv){
        return this.danhSach.contains(sv);
    }
    public boolean xoaSinhVien(String sv){
        return this.danhSach.remove(sv);
    }

    public void timKiemSinhVien(String sv){
        for (SinhVien sinhVien: danhSach){
            if(this.danhSach.indexOf(sv) >= 0){
                System.out.println(sinhVien);
            }
        }
    }

    public void kiemTraDiemTBtuCaoToiThap(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTB()>sv2.getDiemTB()){
                    return -1;
                }else if(sv1.getDiemTB()<sv2.getDiemTB()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
    }

}
