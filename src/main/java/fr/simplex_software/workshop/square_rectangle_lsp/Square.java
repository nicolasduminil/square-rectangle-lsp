package fr.simplex_software.workshop.square_rectangle_lsp;

public class Square extends Rectangle
{
  private int size;

  public Square(int size)
  {
    super(size, size);
    this.size = size;
  }

  public Square()
  {
    this(0, 0);
  }

  public Square(int width, int height)
  {
    super(width, height);
  }

  public int getSize()
  {
    return size;
  }

  public void setSize(int size)
  {
    this.size = size;
  }

  @Override
  public void setWidth(int width)
  {
    super.setWidth(width);
    super.setHeight(width);
  }

  @Override
  public void setHeight(int height)
  {
    super.setHeight(height);
    super.setWidth(height);
  }
}
