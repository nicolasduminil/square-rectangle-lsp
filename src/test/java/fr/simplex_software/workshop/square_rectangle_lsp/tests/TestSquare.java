package fr.simplex_software.workshop.square_rectangle_lsp.tests;

import fr.simplex_software.workshop.square_rectangle_lsp.*;
import org.junit.jupiter.api.*;

public class TestSquare
{
  @Test
  public void testSquare()
  {
    Square square = new Square(20);
    Assertions.assertEquals(20, square.getWidth());
    Assertions.assertEquals(20, square.getHeight());
    Assertions.assertEquals(400, square.area());
  }
}
