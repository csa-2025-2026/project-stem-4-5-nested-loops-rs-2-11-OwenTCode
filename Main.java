import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNtimes("buh", 3);
    printNums(10);
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
    for (int i = 10; i > 0; i--)
    {
      for (i > 9)
      {
        System.out.print(i);
      }
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
