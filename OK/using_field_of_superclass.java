class using_field_of_superclass {
    public static void main(String[] a) {

    }
}

class A extends B {
    public int f() {
        int x;
        int y;
        int z;
        z = 3;
        return my_field;
    }
}

class B {
    int my_field;
}