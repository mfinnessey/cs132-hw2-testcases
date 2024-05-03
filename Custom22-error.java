// test call to a method using subtypes of declared types as well as non-subtype
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
	// should be an error
	x = f.bar(a, b, c, d);
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
    public boolean bar(A one, A two, A three, A four){
	return true;
    }
}
