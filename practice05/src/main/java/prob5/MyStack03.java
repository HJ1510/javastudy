package prob5;

public class MyStack03<T> {
	private int top;
	private T[] buffer; //캐스팅으로 타입 지정 안해도 되도록 수정!! 제너릭 클래스

	@SuppressWarnings("unchecked")
	public MyStack03(int capacity) {
		top = -1;
		buffer =(T[]) new Object[capacity]; //new T[capacity]; 안됨
	}

	public void push(T o) {
		if (top == buffer.length - 1) {
			resize();
		}

		buffer[++top] = o;		
	}

	public T pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		T result = buffer[top];
		buffer[top--] = null;

		return result;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	@SuppressWarnings("unchecked")
	private void resize() {
		T[] temp = (T[])new Object[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}

		buffer = temp;
	}
}