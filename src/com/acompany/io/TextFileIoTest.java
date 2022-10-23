package com.acompany.io;

import java.io.*;

public class TextFileIoTest {
    public static void main(String[] args){
        // 1. 텍스트파일에서 파일 읽기
        try (BufferedReader in = new BufferedReader(
                new FileReader("yesterday.txt"))) {

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fe) {
        } catch (IOException ie) {
        }

        // 2. 텍스트 파일로 쓰기
        try (BufferedWriter out = new BufferedWriter(
                new FileWriter("output.txt")
        )) {
            out.write("hello world\nJava is very interesting language");
        } catch (IOException ioException) {
        }

    }
}
