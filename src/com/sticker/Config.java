package com.sticker;

import java.awt.*;

public class Config {
    public static final int SIZE = 10;
    public static final int WIDTH = 80;
    public static final int HEIGHT = 60;
    public static final int SLEEP_MS = 100;

    public static Color getColor(Status status) {
        return switch (status) {
            case NONE -> Color.BLACK;
            case BORN, DIED -> Color.GRAY;
            case LIVE -> Color.WHITE;
        };
    }

}
