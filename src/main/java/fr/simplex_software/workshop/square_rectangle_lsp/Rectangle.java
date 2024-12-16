package fr.simplex_software.workshop.square_rectangle_lsp;

public class Rectangle
{
  private int width;
  private int height;

  public Rectangle()
  {
  }

  public Rectangle(int width, int height)
  {
    this.width = width;
    this.height = height;
  }

  public int getWidth()
  {
    return width;
  }

  public void setWidth(int width)
  {
    this.width = width;
  }

  public int getHeight()
  {
    return height;
  }

  public void setHeight(int height)
  {
    this.height = height;
  }

  public int area ()
  {
    return width * height;
  }
}
