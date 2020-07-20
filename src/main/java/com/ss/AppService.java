package com.ss;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    public int multiply(int x, int y) {
        return x * y;
    }
}
