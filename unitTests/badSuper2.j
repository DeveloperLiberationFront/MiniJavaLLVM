class Test {
    int x;
    public void test() {
        System.out("Test");
    }
}

class Test2 extends Test {
    public Test2() {
        /* no constructor but needed, since there can be no default */
    }
    public void test2() {
        super.x = 5;
        super.test();
        super.x = 10;
        super.test();
    }
}

class Main {
    public static void main() {
        Test2 t;
        t = new Test2();
        t.test2();
    }
}
