// test for returning subtype of declared return type
class M {
    public static void main (String [] laskdjflkasjdfkl){
    }
}

class A {
    int a;
}
// B is a subtype of A
class B extends A {
    
}

class C {
    public A x(){
	return new B();
    }
}
