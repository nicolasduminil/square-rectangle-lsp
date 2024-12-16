package fr.simplex_software.workshop.square_rectangle_lsp;

public class Main
{
  public static void main(String[] args)
  {
    Square square = new Square();
    square.setWidth(10);
    square.setHeight(20);
    System.out.println(">>> Square width: " + square.getWidth());
    System.out.println(">>> Square height: " + square.getHeight());
    System.out.println(">>> Square size: " + square.getWidth());
    System.out.println(">>> Square area: " + square.area());
  }
}
