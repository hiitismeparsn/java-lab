import java.util.Scanner;

interface Stack {
	void push();
	void pop();
	void display();
}



class stack implements Stack {
	static int size = 10;
	int[] S = new int[size];
	int top = -1;	
	public void push(int data) {
		if (top == (size -1 )) {
		       System.out.println("Stack is full!");
		}
 		
		else {
			top++;
			S[top] = data;
			System.out.println("Value pushed into stack!");
		}		
	}

	public void pop() {
		if (top == -1) {
			System.out.println("The stack is empty!!!");
		}
		else {
			System.out.println("Value at top: " + S[top]);
			int tmp = S[top];
			top--;
			return tmp;	
		}

	}

	public void display() {
		for (int i = 0; i<top+1; i++) {
			System.out.println(S[i]);
		}
	}
	
	public boolean isFull() {
		if (top == (size-1)) {
			return true;
		}
		else {
			return false; }

}


class Main {
	public static void main(String args[]) {
		stack S1 = new stack();
		stack S2 = new stack();
		int imp;
		int data;
		int[] dataOverflow = new int[20];
		int currentOverflow;
		Scanner sx = new Scanner(System.in);
		while (true) {	
			System.out.println("Enter 1 for push, Enter 2 for pop, Enter 3 for display");
			imp = sx.nextInt();

			switch(imp) {
				case 1:
					 data = sx.nextInt();
					
					if (S1.isFull==true && S2.isFull==true) {
						dataOverflow[currentOverflow] = S1.pop();
						currentOverflow++;
						
						dataOverflow[currentOverflow] = S2.pop();
						currentOverflow++;		
					
						}
					else if (S1.isFull == true) {
						S1.push(data);
					}
					else if (S1.isFull == true && s1.isFull == false) {
						S2.push(data);
					}

					break;
				case 2:

						if(S1.isFull == false) {
							S1.pop();
						}
						else if (S1.isFull == true && S1.isFull == false) {
							S2.pop();
						}
						break;

				case 3: 
						
					if(S1.isFull == false) {
                                                          S1.display();
                                                  }
                                                  else if (S1.isFull == true && S1.isFull == false) {
							  S1.display();
                                                          S2.display();
                                                  }
                                                  break;
			}
		}
}		
