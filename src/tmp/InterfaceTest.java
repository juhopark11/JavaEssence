package tmp;

class A {
	public void methodA(i i_nickname) {
		i_nickname.methodB();
	}
}

interface i {
	public void methodB();
}

class B implements i {
	public void methodB() {
		System.out.println("methodB() output");
	}
}


class C implements i {
	public void methodB() {
		System.out.println("c타입으로 변경해봄.");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {

		A a = new A();
		a.methodA(new C());
	}
}
