package com.enum_practice;

interface Operation {
    int apply(int x, int y);
}
enum Calculator implements Operation {
    ADD {
        public int apply(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        public int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        public int apply(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        public int apply(int x, int y) {
            return x / y;
        }
    };
}

public class EnumWithInterface {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Addition: " + Calculator.ADD.apply(x, y));
        System.out.println("Subtraction: " + Calculator.SUBTRACT.apply(x, y));
    }
}
