// test call to a method that takes one paramer with one parameter
class M {
    public static void main (String [] laskdjflkasjdfkl){
	A a;
	B b;
	C c;
	D d;
	Foo f;
	boolean x;
	a = new A();
	b = new B();
	c = new C();
	d = new D();
	x = f.bar(a);
    }
}

class A {
}

class B extends A {
}

class C extends A{
}

class D{}

class Foo{
    public boolean bar(A a){
	return true;
    }
}
