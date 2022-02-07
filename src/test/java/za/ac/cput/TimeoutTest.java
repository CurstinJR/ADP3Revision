package za.ac.cput;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutTest
{
    @Test
    @Timeout(1)
    public void timeout_pass()
    {
        int [] arr = new int[3];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }
}
