import java.io.*;

public class ReadFileText {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Modul 1\\A0523I1-TRINHVANBAN\\A0523I1-TrinhVanBan-modul2\\BaiTap_modul2\\IOFile\\TongCacSoFile\\src\\Number.csv");
            if(!file.exists()){
                System.out.println("Lỗi");
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tong la: "+sum);
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại or nội dung có lỗi!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
