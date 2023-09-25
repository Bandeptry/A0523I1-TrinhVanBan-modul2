package SinhVien;

import java.util.Scanner;

public class TestSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien =new DanhSachSinhVien();
        boolean flag = false;
        do {
            flag = true;
            System.out.println("----------------MENU------------");
            System.out.println("1. add sinh vien\n"
                    +"2. In sinh vien danh sach ra man hinh\n"
                    +"3. Kiem tra danh sach co rong hay khong\n"
                    +"4. Lay ra so luong sinh vien trong danh sach\n"
                    +"5. Lam rong danh sach sinh vien\n"
                    +"6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dau tren ma sinh vien\n"
                    +"7. Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien\n"
                    +"8. Tim kiem sinh vien dua tren Ten duoc nhap tu ban phim\n"
                    +"9. Xuat ra sinh vien co diem tu cao den thap\n"
                    +"0. thoat khoi chuong trinh"
            );
            int select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 1:
                    System.out.println("Nhap ma sinh vien");
                    String maSV = sc.nextLine();
                    System.out.println("Nhap ten sinh vien");String tenSV = sc.nextLine();
                    System.out.println("Nhap nam sinh");int namSinh = sc.nextInt();
                    System.out.println("Nhap diem trung binh");float diem = sc.nextFloat();
                    SinhVien sv = new SinhVien(maSV,tenSV,namSinh,diem);
                    danhSachSinhVien.addSinhVien(sv);
                    break;
                case 2:
                    System.out.println("Hien thi danh sach");
                    danhSachSinhVien.hienThiDanhSach();
                    break;
                case 3:
                    System.out.println("Kiem tra danh sach rong khong: "+ danhSachSinhVien.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("So luong sinh vien trong danh sach: "+ danhSachSinhVien.kiemTraLuongSV());
                    break;
                case 5:
                    System.out.println("Lam rong danh sach sinh vien");
                    danhSachSinhVien.lamRongDanhachSinhVien();
                    break;
                case 6:
                    System.out.println("kiem tra ton tai");
                    String s = sc.nextLine();
                    System.out.println("Kiem tra ton tai"+danhSachSinhVien.kiemTraTonTai(s));
                    break;
                case 7:
                    System.out.println("Xoa sinh vien");
                    String ten = sc.nextLine();
                    System.out.println(danhSachSinhVien.xoaSinhVien(ten));
                    break;
                case 8:
                    System.out.println("Tim kiem danh sach ");
                    String search = sc.nextLine();
                    System.out.println("ket qua tim kiem: ");
                    danhSachSinhVien.timKiemSinhVien(search);
                    break;
                case 9:
                    danhSachSinhVien.kiemTraDiemTBtuCaoToiThap();
                    danhSachSinhVien.hienThiDanhSach();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
}
