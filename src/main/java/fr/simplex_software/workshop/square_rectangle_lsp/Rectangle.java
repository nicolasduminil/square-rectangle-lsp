package fr.simplex_software.workshop.square_rectangle_lsp;

public class Rectangle
{
  private int width;
  private int height;

  public Rectangle(int width, int height)
  {
    this.width = width;
    this.height = height;
  }

  public int getWidth()
  {
    return width;
  }

  public int getHeight()
  {
    return height;
  }

  public int area ()
  {
    return width * height;
  }

  public int perimeter ()
  {
    return 2 * (width + height);
  }
}
