import java.util.*;
import java.io.*;
public class USACO{
  private String[] lake;
  private int[] instruction;
  public static int row;


  public USACO(String filename)throws FileNotFoundException{
    try {
      ArrayList<String> temp = new ArrayList<String>();
      File f = new File(filename);
      Scanner scan = new Scanner(f);

       while (scan.hasNextLine()) {
        temp.add(scan.nextLine());
       }
       lakeArray(temp);

       } catch(FileNotFoundException e) {
           System.out.println("Could not find :" + filename);
             System.exit(0);
       }
  }

  private void lakeArray(ArrayList<String> arr){
      lake = new String[arr.size()];
      for( int i = 0; i < arr.size(); i++){
        lake[i] = arr.get(i);
      }
  }

  public static int returnRow(){
    return 0;
  }

  public static void main(String[] args){
    System.out.println();
  }

}
