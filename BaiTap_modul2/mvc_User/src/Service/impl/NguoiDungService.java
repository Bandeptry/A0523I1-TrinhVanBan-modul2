package Service.impl;

import Model.NguoiDung;
import Repository.impl.NguoiDungRepository;
import Service.INguoiDungService;

import java.util.List;
import java.util.Scanner;

public class NguoiDungService implements INguoiDungService {
    NguoiDungRepository nguoiDungRepository = new NguoiDungRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void xuLyThemNguoiDung() {
        System.out.println("Nhap ten nguoi dung: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap tuoi:");
        String tuoi = scanner.nextLine();
        int age = Integer.parseInt(tuoi);
        System.out.println("Nhap dia chi: ");
        String diaChi = scanner.nextLine();
        NguoiDung nguoiDung = new NguoiDung(ten, email, age, diaChi);
        nguoiDungRepository.addNguoiDung(nguoiDung);
    }

    @Override
    public void xuLyHienThiNguoiDung() {
        List<NguoiDung> nguoiDung = nguoiDungRepository.hienThiNguoiDung();
        for(int i = 0; i < nguoiDung.size(); i++){
            if(nguoiDung.get(i) != null){
                System.out.println(i+1 +" "+nguoiDung.get(i));
            }
        }
    }

    @Override
    public void suaByNguoiDung() {
        System.out.println("Nhap ten nguoi dung muon sua: ");
        String ten = scanner.nextLine();
        nguoiDungRepository.suaNguoiDung(ten);
    }

    @Override
    public void xoaByNguoiDung() {
        System.out.println("Nhap ten nguoi dung muon xoa: ");
        String nDung = scanner.nextLine();
        nguoiDungRepository.xoaNguoiDung(nDung);
    }

}
