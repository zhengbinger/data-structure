
public class ArrayQueueDemo{

    public static void main(String[] args) {
        
    }
}

/**
 * 使用数组模拟队列，编写一个ArrayQueue
 */
class ArrayQueue{

    private int maxSize;  // 队列数组最大容量
    private int front;    // 队列头
    private int rear;     // 队列尾
    private int[] arr;    // 队列容器数组        

    /**
     * 创建队列构造器
     * @param arrMaxSize
     */
    public ArrayQueue(int arrMaxSize){
        this.maxSize = arrMaxSize;
        arr = new int[maxSize];
        this.rear = -1;   // 指向队列尾部，指向队列尾部的数据（即：队列最后一个数据）
        this.front = -1;  // 指向队列头部，分析出front是指向队列猎头的前一个位置。
    }

    /**
     * 判断队列是否已经满了
     * @return
     */
    public boolean isFull(){
        return rear == maxSize-1;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty(){
        return rear == front;
    }

    // 添加数据到队列

    public void addQueue(int n){
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    /**
     * 获取队列的数据，出队列
     * @return
     */
    public int getQueue(){
        // 判断队列是否为空
        if(isEmpty()){
            // 跑出异常
            throw new RuntimeException("队列空，无法获取数据");
        }
        front++;
        return arr[front];
    }

    /**
     * 展示队列的所有数据
     */
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列空，无法获取数据");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t\t%d",i,arr[i]);
        }
    }

    /**
     * 显示队列的头数据
     */
    public int headQueue() {
        if(isEmpty()){
            throw new RuntimeException("队列空，无法获取数据");
        }
        return arr[front+1]
        
    }
}