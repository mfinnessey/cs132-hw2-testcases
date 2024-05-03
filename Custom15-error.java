// test for clash between field and parameter identifier
class A {
    public static void main (String [] laskdjflkasjdfkl){
    }
}

class B {
    int a;
    public int x(int a){
	return 5;
    }
}
