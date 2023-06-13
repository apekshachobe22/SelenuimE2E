package seleniumE2E;

import org.testng.annotations.*;

public abstract class Main {



    public class FindIt {

        @BeforeClass
        public void beforeClass() {
            System.out.println("Before Class");
        }

        @AfterClass
        public void afterClass() {
            System.out.println("After Class");
        }


        @BeforeMethod
        public void beforeTest() {
            System.out.println("Before Test");
        }

        @AfterMethod
        public void afterTest() {
            System.out.println("After Test");
        }

        @Test
        public void test1() {
            System.out.println("test 1");
        }

        @Test
        public void test2() {
            System.out.println("test 2");
        }

        @Test
        public void test3() {
            System.out.println("test 3");
        }

        @Test
        public void test4() {
            System.out.println("test 4");
        }


    }}