# Square, Rectangle and the Liskov Substitution Principle

This test aims at proving that, as opposed to what this [article](https://medium.com/@alex24dutertre/square-rectangle-and-the-liskov-substitution-principle-ee1eb8433106) states,
the `Square` class can be an extension of the `Rectangle` one, without violating LSP.

## Testing and running

Testing with JUnit 5

### With Maven

    $ git clone https://github.com/nicolasduminil/square-rectangle-lsp.git
    $ cd square-rectangle-lsp
    $ mvn test

This should display a test report as shown below:

    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running fr.simplex_software.workshop.square_rectangle_lsp.tests.TestSquare
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.032 s -- in fr.simplex_software.workshop.square_rectangle_lsp.tests.TestSquare
    [INFO]
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  1.305 s
    [INFO] Finished at: 2024-12-16T18:50:36+01:00
    [INFO] ------------------------------------------------------------------------

### In the IntelliJ IDEA

In the `Project` pane, right click on the `TestSquare` class and select `Run TestSquare`

## Running with Maven

In command line mode:

    $ git clone https://github.com/nicolasduminil/square-rectangle-lsp.git
    $ cd square-rectangle-lsp
    $ mvn exec:java

This will display the result below:

    >>> Square width: 20
    >>> Square height: 20
    >>> Square size: 20
    >>> Square area: 400

## Running in IntelliJ IDEA

In the `Project` pane, right click on the `Main` class and select `Run Main.main()`


