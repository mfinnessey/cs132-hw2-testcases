// test for returning non-subtype of declared return type but in hierarchy
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
    public B x(){
	return new A();
    }
}
