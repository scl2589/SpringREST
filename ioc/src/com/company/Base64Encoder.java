package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encoder {
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
