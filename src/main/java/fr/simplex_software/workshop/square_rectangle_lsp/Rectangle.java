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

  public Rectangle setWidth(int width)
  {
    return new Rectangle(width, height);
  }

  public int getHeight()
  {
    return height;
  }

  public Rectangle setHeight(int height)
  {
    return new Rectangle(width, height);
  }

  public int area ()
  {
    return width * height;
  }
}
