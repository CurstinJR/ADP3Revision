package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class FailingTest
{
    @Test
    public void shouldFailMethod()
    {
        fail("this method fails");
        System.out.println("This will not print");
    }
}
