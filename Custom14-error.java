// test for redefinition of method in non-main class
class A {
    public static void main (String [] laskdjflkasjdfkl){
    }
}

class B {
    public int x(){
	return true;
    }
    public int y(){
	return 5;
    }
    public int x(int n){
	return 1;
    }
}

