
package CleanCode;
//Tach hang
public class DoiTenBienVaHang {
    public static final char Cong = '+';
    public static final char Tru = '-';
    public static final char Nhan = '*';
    public static final char Chia = '/';
    public static int calculate(int fistOpera, int secanOpera, char opera){
        switch (opera){
            case Cong:
                return fistOpera + secanOpera;
            case Tru:
                return fistOpera - secanOpera;
            case Nhan:
                return fistOpera * secanOpera;
            case Chia:
                if(secanOpera != 0)
                    return fistOpera / secanOpera;
                else
                    System.out.println("khong thuc hien duoc");
            default:
                throw new RuntimeException("Unsupported operation");// dung de nam gia tri khong hop le
        }
    }
}
