
public class StackByAraay {
    

   public static  class Stack{
        private int arr[]=new int[10];
        private int idx=-1;
        public void push(int data){
            idx++;
         arr[idx]=data;
         
        }
        public int pop(){
            if(idx==-1){
                System.out.println("Stack is underflow");
                return -1;
            }
            
            int value = arr[idx];
            idx--;
            return value;
           
        }
        public int peek(){
            if(idx==-1){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx];

        }
        boolean empty(){
            if(idx==0){
                return true;
            }
            else
              return false;
        }
        void diplay(){
            System.out.print("[");
            if(idx!=-1){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i]+",");
            }
            System.out.print(arr[idx]);
        }
            System.out.println("]");
        }
    }
      
    public static void main(String[] args) {
       Stack s=new  Stack();
       s.push(4);
       s.push(5);
       s.pop();
       s.diplay();
    //    System.out.println(s.empty());
    
    }
}
