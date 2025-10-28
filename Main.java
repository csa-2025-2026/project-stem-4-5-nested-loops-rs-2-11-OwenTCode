import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // printNtimes("buh", 3);
    printNums();
    System.out.print("Input an int: ");
    Scanner input = new Scanner(System.in);
    int blah = input.nextInt();
    uprightNumberTriangle(blah);
    starTree();

  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String current = word.substring(i,i+1);
      for (int j = 0; j < N; j++)
      {
        System.out.println(current);
      }
    }
  }

  public static void printNums()
  {
    for (int rowNum = 10; rowNum > 0; rowNum--)
    {
      for (int j = 0; j < rowNum; j++)
      {
        System.out.print(rowNum);
      }
      System.out.println("");
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 1; row <= N; row++)
    {
      int wah = 1;
      for (int count = 0; count < row; count++)
      {
        
        System.out.print(wah + " ");
        wah++;
        
      }
      System.out.println("");
    }

  }

  public static void starTree()
  {
    for (int starCount = 10; starCount > 0; starCount--)
    {
      for (int row = starCount; row > 1; row--)
      {
        System.out.print("*");
        System.out.print(" ");
      }
      System.out.println(" ");
      
      
    }
  }

  public static void multTable()
  {
    // code solution here
  }
}
