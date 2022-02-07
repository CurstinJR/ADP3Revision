package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ObjectIdentityTest
{
    private Student studentA;
    private Student studentB;

    @BeforeEach
    public void setup()
    {
        studentA = new Student(1,
                "Jack",
                "Russ",
                "ADP3");
        studentB = new Student(2,
                "Kailey",
                "Johnson",
                "CNF3");
    }

    @Test
    public void shouldNotBeSameObjects()
    {
        assertNotSame(studentA, studentB);
    }

    @Test
    public void shouldBeSameObjects()
    {
        studentB = studentA;
        assertSame(studentA, studentB);
    }
}
