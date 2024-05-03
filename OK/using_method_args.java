class using_method_args {
    public static void main(String[] a) {

    }
}

class A {
    public int f(int arg1, int arg2, boolean b) {
        int x;
        x = arg1 + arg2;
        if (b) {
            x = x + 33;
        } else {

        }
        return x;
    }
}
