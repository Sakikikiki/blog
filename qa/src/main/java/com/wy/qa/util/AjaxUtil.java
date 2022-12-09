package com.wy.qa.util;

import java.io.IOException;
import java.io.OutputStream;

public class AjaxUtil {
    public static void write(OutputStream os, String text) {
        try {
            os.write(text.getBytes());
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
