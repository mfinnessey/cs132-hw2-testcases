// test assignment of a subtype to a supertype
class M {
    public static void main (String [] laskdjflkasjdfkl){
	A x;
	int c;
	x = new B();
	// call base class method on object
	c = x.b();
    }
}

class A {
    int a;
    public int b(){
	a = 0;
	System.out.println(a);
	return 0;
    }
}

class B extends A {
    boolean a;
    public int c(){
	a = true;
	if(a){
	    System.out.println(1);
	}
	else{
	    System.out.println(2);
	}
	return 0;
    }
}
