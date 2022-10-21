package com.acompany.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LylicReader {
    public void doJob() {
        Path path = Paths.get("yesterda.txt");

        try (Scanner in = new Scanner(path, "UTF-8");){

            in.useDelimiter("\n");
            while (in.hasNext()) {
                System.out.println(in.next());
            }
        } catch (IOException ie) {
            //System.out.println("error occurred");
            throw new BizException("파일이 없습니다.", ie);
        }
    }
}

