package com.qabootcamp.constants;

public class FrameworkConstants {
    public static String getDriverPath() {
        return System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver";
    }
}
