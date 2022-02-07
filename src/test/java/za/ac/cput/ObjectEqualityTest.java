package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ObjectEqualityTest
{
    private Customer customerA;
    private Customer customerB;

    @BeforeEach
    public void setup()
    {
        customerA = new Customer(1,
                "Devin",
                "Torax",
                "devin@gmail.com");
        customerB = new Customer(2,
                "Alonso",
                "Meca",
                "alonso@gmail.com");
    }

    @Test
    @DisplayName("CustomerA should not equal to CustomerB")
    public void shouldNotEqualObjects()
    {
        assertNotEquals(customerA, customerB);
    }

    @DisplayName("CustomerA should equal to CustomerB")
    @Test
    public void shouldEqualObjects()
    {
        customerB = customerA;
        assertEquals(customerA, customerB);
    }
}
