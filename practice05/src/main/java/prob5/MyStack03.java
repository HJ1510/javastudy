package prob5;

public class MyStack03 {
	private int top;
	private Object[] buffer; //String 외에 다른 종류의 객체도 다 사용 가능하게 수정!!

	public MyStack03(int capacity) {
		top = -1;
		buffer = new String[capacity];
	}

	public void push(Object o) {
		if (top == buffer.length - 1) {
			resize();
		}

		buffer[++top] = o;		
	}

	public Object pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		Object result = buffer[top];
		buffer[top--] = null;

		return result;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	private void resize() {
		Object[] temp = new Object[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}

		buffer = temp;
	}
}