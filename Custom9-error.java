// test for redefinition of class not clashing with the main class
class A {
    public static void main (String [] laskdjflkasjdfkl){
    }
}

class B {
    public int x(){
	return 1;
    }
}

class B {
    public int y(){
	return 1;
    }
}
