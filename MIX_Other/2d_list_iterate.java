public class 2d_list_iterate {
    Scanner scan = new Scanner(System.in);  
int no_of_rows = scan.nextInt();         //Number of rows 
int no_of_columns = scan.nextInt();      //Number of columns 
ArrayList<ArrayList<String>> list = new ArrayList<>();
for (int i = 0; i < no_of_rows; i++) {      
    list.add(new ArrayList<>());      //For every instance of row create an Arraylist
    for (int j = 0; j < no_of_columns; j++) {
        list.get(i).add(scan.next());        //Specify values for each indices
    }
}
//ArrayList Travesal
for (int i = 0; i < list.size(); i++) {
    for (int j = 0; j < list.get(i).size(); j++) {
        System.out.print(list.get(i).get(j)+" ");   //LineX
    }
    System.out.println();
}
}
