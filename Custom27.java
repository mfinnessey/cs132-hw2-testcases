// test call to a method that takes two parameters with two parameters
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
	x = f.bar(a, b);
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
    public boolean bar(A one, A two){
	return true;
    }
}
