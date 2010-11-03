/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.test;

import org.junit.Test;

/**
 * @version $Rev$
 */
public class HelloWorldTest
{
    @Test
    public void sayHelloWorld()
    {
        String function =
                "(defn write-to-console [message]" +
                "  (native-write (get environment :console) message))";
        String source =
                "(write-to-console 'hello world!')";
    }
}
