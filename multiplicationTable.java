public class multiplicationTable {

  public static void main(String[] args) {
    
    System.out.println("            Multiplication Table");
    final int totalRow = 9;
    final int totalCol = totalRow;
    System.out.print("      ");
    for(int i = 1; i <= 9; i++) {
      System.out.printf("%4d", i);
    }
    System.out.print("\n   ---------------------------------------");
    //draw all the row in the table
    for(int row = 1; row <= totalRow; row++) {
      
        System.out.println("");
        System.out.printf("%4d |", row);
        
        for (int col = 1; col <= totalCol; col ++) {
          System.out.printf("%4d",row * col);
        }
        //at the end of the row do a \a to go to the next row.
      }
        System.out.println("");
  }
}
