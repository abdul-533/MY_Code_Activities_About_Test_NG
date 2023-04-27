package Day01;

import org.testng.annotations.*;

public class _02_Annotations {

    @AfterClass //Her metoddan sonra
    public void afterclass(){
        System.out.println("afterclass calishdi");
    }
    @BeforeClass //
    public void beforeclass(){ //her metotdan once calishir
        System.out.println("before class calishdi");
    }

    @AfterMethod // her metoddan sonra caloshir
    public void afterMethod(){
        System.out.println("after method calishdi");
    }

 @BeforeMethod // her metoddan once calishir
 public void beforeMethod(){
     System.out.println("before method calishdi");
 }

    @Test // her biri bir test metodu
    public void Test1() {
        System.out.println("test 1 calishdi");
    }

    @Test
    public void Test2() {
        System.out.println("test 2 calishdi");
    }
}

