package org.abstract_class;


import org.testng.Assert;
import org.testng.annotations.*;

public class SquareTest {

    @BeforeClass
    void setUp() {
    }

    @AfterClass
    void tearDown() {
    }

    @Test
    void getPerimeter() {
        Square square1 = new Square(1.0); // Это пример downcast  (upcast \ downcast - загуглить.)
        Assert.assertEquals(square1.getPerimeter(), 4.0, "error!");
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getSide());
        System.out.println(square1.getSide());
        System.out.println(square1.getSquare());
    }


    @Test(dataProvider = "dataProviderSquare")
    public void testGetSquare(Square square1, double result, String message) {
        Assert.assertEquals(square1.getSquare(), result, message);
    }

    @DataProvider
    public Object[][] dataProviderSquare() {
        return new Object[][]{
                {new Square(1.0), 1.0, "error number 1"},
                {new Square(2.0), 4.0, "error number 2"},
                {new Square(3.0), 9.0, "error number 3"},
                {new Square(4.0), 16.0, "error number 4"},
        };
    }
    //сделать тесты на getPerimeter
    //посмотреть методы системного класса Object

    @DataProvider(parallel = true)
    // аргумент "parallel = true" означает, что тесты с всеми данными будут запущены параллельно
    public Object[][] dataProviderPerimeter() {
        return new Object[][]{
                {new Square(1.0), 4.0, "error number 1"},
                {new Square(2.0), 8.0, "error number 2"},
                {new Square(3.0), 12.0, "error number 3"},
                {new Square(4.0), 16.0, "error number 4"},
        };
    }

    @Test(dataProvider = "dataProviderPerimeter", threadPoolSize = 10, invocationCount = 3)
        // threadPoolSize=2  означает количество потоков,
        // а invocationCount означает кол-во вызовов метода
        //например, если threadPoolSize=2 и invocationCount=3 , то метод будет вызван 3 раза в два потока (т.е. тест с каждым параметром был выполнен по 3 раза. в два потока)
    void testGetPerimeter(Square square1, double result, String message) throws InterruptedException {
        //Thread.sleep(20000);
        Assert.assertEquals(square1.getPerimeter(), result, message);
    }
}

//сделать еще классы формы - сфера и куб, методы для них и тесты методов
//сделать интерфейс
// параллельный запуск тестов?

// найти в документации testNG (погуглить), как поставить ограничение на кол-во потоков
// дз  -  Реализовать функцию, которая будет будет принимать на вход целое число и выводить в консоль "foo", если число кратно
//3, "bar", если число кратно 5 и "foobar", если число кратно 15. Покрыть тестами.  +сделать вывод и в консоль и return