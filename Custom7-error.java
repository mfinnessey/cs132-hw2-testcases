// test for illegal overload in grandparent
class ASDFASDF {
    public static void main (String [] laskdjflkasjdfkl){
    }
}

class A{
    public int x(){
	return 1;
    }
}

class B extends A{
    public int x(){
	return 10;
    }
}

class C extends B{
    public int x(int n){
	return n;
    }
}
