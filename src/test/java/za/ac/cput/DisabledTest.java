package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DisabledTest
{
    @Test
    @Disabled("method not ready yet")
    public void disabledTest()
    {
        List<Integer> numbers = List.of(
                1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);
    }
}
