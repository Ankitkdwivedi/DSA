package Stack;
public class Dynamic_Stack extends Stack {
    public void push(int item){
            if(this.isFull()){
                int []a=new int[2*arr.length];
                for(int i=0;i<arr.length;i++){
                    a[i]=arr[i];
                }
                arr=a;
            }
            super.push(item);
        }
    }
    
