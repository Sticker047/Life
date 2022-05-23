package com.sticker;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        Window window = new Window();
        javax.swing.SwingUtilities.invokeAndWait(window);
    }
}
