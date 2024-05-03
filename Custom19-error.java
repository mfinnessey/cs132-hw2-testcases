// test for illegal overload after legal override
class M {
    public static void main (String [] laskdjflkasjdfkl){
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
    public int b(){
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

class C extends B {
    public int b(int delta){ // illegal
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
