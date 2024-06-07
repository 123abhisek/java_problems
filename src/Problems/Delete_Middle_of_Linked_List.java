package Problems;

class DeleteMiddleNode {
	int data;
	DeleteMiddleNode next;

	DeleteMiddleNode(int d) {
		data = d;
		next = null;
	}
}

public class Delete_Middle_of_Linked_List {
	static DeleteMiddleNode head = null;

	static void insertData(int data) {
		DeleteMiddleNode newNode = new DeleteMiddleNode(data);
		if (head == null) {
			head = newNode;
		} else {
			DeleteMiddleNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	static void printNode() {
		if (head == null) {
			System.out.println("Data is empty");
		} else {
			DeleteMiddleNode temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.print(temp.data);
		}
	}

	static int count() {
		int count = 0;
		if (head == null) {
			return count;
		} else {
			while (head.next != null) {
				count++;
				head = head.next;
			}
			count++;
		}
		return count;
	}

	static DeleteMiddleNode deleteMid(DeleteMiddleNode head) {
		
		if (count() % 2 == 0) {
			// linked list is of even size
			DeleteMiddleNode temp = head;
			int count =1;
			while (temp.next != null) {
				if (Math.ceil(count/2)+1 == count) {
					System.out.println("\n"+count+" delete");
				}
				temp = temp.next;
			}
		}
		else {
			// linked list is of odd size
			DeleteMiddleNode temp = head;
			int count =1;
			while (temp.next != null) {
				if (Math.ceil(count/2) == count) {
					System.out.println("\n"+count+" delete");
				}
				temp = temp.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {

		insertData(1);
		insertData(2);
		insertData(5);
		insertData(10);
		insertData(15);

		printNode();

		System.out.println("\ncount : " + count());

		deleteMid(head)
	}

}
