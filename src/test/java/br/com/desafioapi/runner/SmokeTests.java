package br.com.desafioapi.runner;


import br.com.desafioapi.tests.auth.tests.PostAuthTest;
import br.com.desafioapi.tests.booking.tests.DeleteBookingTest;
import br.com.desafioapi.tests.booking.tests.GetBookingTest;
import br.com.desafioapi.tests.booking.tests.PostBookingTest;
import br.com.desafioapi.tests.booking.tests.PutBookingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.desafioapi.suites.SmokeTests.class)
@Suite.SuiteClasses({
        PostAuthTest.class,
        DeleteBookingTest.class,
        GetBookingTest.class,
        PostBookingTest.class,
        PutBookingTest.class

})

public class SmokeTests {
}
