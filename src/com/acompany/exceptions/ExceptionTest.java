package com.acompany.exceptions;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

        LylicReader reader = new LylicReader();
        try {
            reader.doJob();
        } catch (BizException e) {
            System.out.println(e);
        }
    }
}
