import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> list;

    public Heap() {
        list = new ArrayList<>();
    }
    public void Add(int item){
        list.add(item);
        upheapify(list.size()-1);
    }
    private void upheapify(int ci){
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(pi, ci);
            upheapify(pi);
        }
    }
    public void swap(int pi,int ci){
        int t=list.get(pi);
        list.set(pi,list.get(ci));
        list.set(ci, t);
    }
    public int get(){
        return list.get(0);
    }
    public void Display(){
        System.out.println(list);
    }
    public int remove(){
        int rv=list.get(0);
        swap(0, list.size()-1);
        list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }
    public void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<list.size()&&list.get(lci)<list.get(mini)){
            mini=lci;
        }
        if(rci<list.size()&&list.get(rci)<list.get(mini)){
            mini=rci;
        }
        if(mini!=pi){
            swap(pi, mini);
            downheapify(mini);
        }
    }
}