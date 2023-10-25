package BaiTap;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi cua ban: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++){
            LinkedList<Character> characters = new LinkedList<>();
            characters.add(string.charAt(i));
            for(int j = i + 1;j < string.length();j++){
                if (string.charAt(j) > characters.getLast()) {
                    characters.add(string.charAt(j));
                }
            }
            if(characters.size() > max.size()){
                max.clear();
                max.addAll(characters);
            }

            characters.clear();
        }
        for(Character ch: max){
            System.out.println(ch);
        }

        System.out.println();
    }

}
