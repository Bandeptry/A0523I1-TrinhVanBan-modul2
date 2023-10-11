package ClassIllegalTriangleException;

public class ClassIllegalTriangleException {
    public static void kiemTraTamGiac(int a, int b, int c) throws IllegalTriangleException{
        if(a + b <= c || a + c <= b || b + c <= a ){
            throw new IllegalTriangleException("Tam giac khong hop le");
        }else {
            System.out.println("Tam giac hop le");
        }
    }
}
