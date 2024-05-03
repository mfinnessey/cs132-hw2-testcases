// test call to a method using subtypes of declared types 
class M {
    public static void main (String [] laskdjflkasjdfkl){
	A a;
	B b;
	C c;
	Foo f;
	boolean x;
	a = new A();
	b = new B();
	c = new C();
	x = f.bar(a, b, c);
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
    public boolean bar(A one, A two, A three){
	return true;
    }
}
