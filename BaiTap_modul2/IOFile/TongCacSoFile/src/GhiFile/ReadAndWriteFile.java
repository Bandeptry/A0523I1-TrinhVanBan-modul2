package GhiFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String pathFile){
        List<Integer> integers = new ArrayList<>();

        try {
            File file = new File(pathFile);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line = bufferedReader.readLine();
            while (line != null){
                integers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file khong hop le 1");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("file khong hop le 2");
        }
        return integers;
    }
    public void writeFile(String pathFile, int max){
        try {
            FileWriter  fileWriter = new FileWriter(pathFile);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));

            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }

}
