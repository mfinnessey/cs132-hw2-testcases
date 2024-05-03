// test for illegal overload
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
    public int x(int n){
	return n;
    }
}
