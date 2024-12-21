package fr.simplex_software.workshop.square_rectangle_lsp;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle rectangle = new Rectangle (10, 20);
    printData(rectangle);
    Square square = new Square(10);
    printData(square);
  }

  private static void printData (Rectangle rectangle)
  {
    String fmt = "*** Printing data for %s(%d%s)";
    String dimensions = rectangle instanceof Square ? "" : ", " + rectangle.getHeight();
    System.out.println (String.format(fmt, rectangle.getClass().getSimpleName(),
      rectangle.getWidth(), dimensions));
    System.out.println("\t>>> Width: " + rectangle.getWidth());
    System.out.println("\t>>> Height: " + rectangle.getHeight());
    System.out.println("\t>>> Area: " + rectangle.area());
    System.out.println("\t>>> Perimeter: " + rectangle.perimeter());
  }
}
