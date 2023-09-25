package SinhVien;

import java.util.HashMap;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
    private String maSinhVien;
    private String tenSinhVien;
    private int namSinh;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String tenSinhVien, int namSinh, float diemTB) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", tenSinhVien='" + tenSinhVien + '\'' +
                ", namSinh=" + namSinh +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinhVien sinhVien)) return false;
        return getNamSinh() == sinhVien.getNamSinh() && Float.compare(sinhVien.getDiemTB(), getDiemTB()) == 0 && getMaSinhVien().equals(sinhVien.getMaSinhVien()) && Objects.equals(getTenSinhVien(), sinhVien.getTenSinhVien());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaSinhVien(), getTenSinhVien(), getNamSinh(), getDiemTB());
    }
}
