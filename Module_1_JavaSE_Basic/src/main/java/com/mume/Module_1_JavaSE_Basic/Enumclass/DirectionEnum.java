package com.mume.Module_1_JavaSE_Basic.Enumclass;

public enum DirectionEnum implements DirectionInterface {

//    UP("向上"),DOWN("向下"),LEFT("向左"),RIGHT("向右");
    UP("向上"){
        @Override
        public void show() {
            System.out.println("up");
        }
    },DOWN("向下") {
        @Override
        public void show() {
            System.out.println("down");
        }
    },LEFT("向左") {
        @Override
        public void show() {
            System.out.println("left");
        }
    },RIGHT("向右") {
        @Override
        public void show() {
            System.out.println("right");
        }
    };

    private String desc;

    private DirectionEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public void show() {
        System.out.println("whole file");
    }
}
