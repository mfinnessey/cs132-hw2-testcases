// test for redefinition of method in non-main class
class A {
    public static void main (String [] laskdjflkasjdfkl){
    }
}

class B {
    public bool x(){
	return true;
    }
    public int y(){
	return 5;
    }
    public int x(){
	return 1;
    }
}

