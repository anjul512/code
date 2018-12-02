package queues;

public class QueueMain {

	public static void main(String args[]) {
		Queue que = new Queue(5);
		System.out.println("enqueue items to the queue");
		System.out.println("Size  of queue is " +  que.size()+"\n"); 
		que.enqueue(10);
		System.out.println("front index of new item is :"+que.front);
		System.out.println("rear index of new item is :"+que.rear);
		System.out.println("Size  of queue is " +  que.size()+"\n"); 
		que.enqueue(20);
		System.out.println("Size  of queue is " +  que.size()+"\n"); 
		que.enqueue(30);
		System.out.println("Size  of queue is " +  que.size()+"\n"); 
		que.enqueue(40);
		System.out.println("Size  of queue is " +  que.size()+"\n"); 
		que.enqueue(50);
		System.out.println("Size  of queue is " +  que.size()+"\n"); 

		System.out.println(que.dequeue() +  " dequeued from queue\n"); 
		System.out.println("Front item is " +  que.front()); 
		System.out.println("Rear item is " +  que.rear()); 
		System.out.println("Size  of queue is " +  que.size()); 
		//calling deque to reamove all items 
		System.out.println(que.dequeue() +  " dequeued from queue\n");
		System.out.println("Size  of queue is " +  que.size()); 
		System.out.println(que.dequeue() +  " dequeued from queue\n");
		System.out.println("Size  of queue is " +  que.size()); 
		System.out.println(que.dequeue() +  " dequeued from queue\n");
		System.out.println("Size  of queue is " +  que.size()); 
		System.out.println(que.dequeue() +  " dequeued from queue\n");
		System.out.println("Size  of queue is " +  que.size()); 
		//here all items are dequeued so it will return Integer min value 
		System.out.println(que.dequeue() +  " dequeued from queue\n");
		System.out.println("Size  of queue is " +  que.size()); 
		// now lets add items over here and see the index of the front and rear 
		que.enqueue(60);
		System.out.println("front index of new item is :"+que.front);
		System.out.println("rear index of new item is :"+que.rear);
		System.out.println("Size  of queue is " +  que.size()+"\n"); 
		
		que.enqueue(70);
		System.out.println("front index of new item is :"+que.front);
		System.out.println("rear index of new item is :"+que.rear);
		System.out.println("Size  of queue is " +  que.size()); 
		System.out.println("check queue is empty :" + que.isEmpty(que));
		
	}
}
