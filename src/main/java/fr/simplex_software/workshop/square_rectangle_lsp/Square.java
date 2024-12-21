package fr.simplex_software.workshop.square_rectangle_lsp;

public class Square extends Rectangle
{
  public Square(int size)
  {
    super(size, size);
  }

  public int getSize()
  {
    return super.getWidth();
  }

  public Square setSize(int size)
  {
    return new Square(size);
  }
}
