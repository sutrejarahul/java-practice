package com.enum_practice;

enum Direction {

    NORTH {
        @Override
        public String getDescription() {
            return "Upwards";
        }
    },
    SOUTH {
        @Override
        public String getDescription() {
            return "Downwards";
        }
    },
    EAST {
        @Override
        public String getDescription() {
            return "Right";
        }
    },
    WEST {
        @Override
        public String getDescription() {
            return "Left";
        }
    };

    public abstract String getDescription();
}

public class EnumWithAbstraction {

    public static void main(String[] args) {
        System.out.println(Direction.NORTH.getDescription()); // Output: Upwards
    }
}
