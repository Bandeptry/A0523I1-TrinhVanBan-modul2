package CopyFile;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File pathFile1 = new File("E:\\Modul 1\\A0523I1-TRINHVANBAN\\A0523I1-TrinhVanBan-modul2\\BaiTap_modul2\\IOFile\\TongCacSoFile\\src\\CopyFile\\CopyFile1.csv");
        File pathFile2 = new File("E:\\Modul 1\\A0523I1-TRINHVANBAN\\A0523I1-TrinhVanBan-modul2\\BaiTap_modul2\\IOFile\\TongCacSoFile\\src\\CopyFile\\CopyFile2.csv");
        InputStream inputStream = null;
        OutputStream outputStream = null;

        // Kiểm tra xem file c tồn tại không.
        if (!pathFile1.exists()) {
            System.out.println("File 1 không tồn tại");
        } else if (!pathFile2.exists()) {
            System.out.println("File 2 không ồn tại");
        } else {
            try {
                inputStream = new FileInputStream(pathFile1);
                outputStream = new FileOutputStream(pathFile2);

                int length;
                byte[] buffer = new byte[1024];

                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
                System.out.println("File is copied successful!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
