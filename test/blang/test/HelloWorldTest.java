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
        String setup = "(def environment {})";
        String additionalsetup = "(set environment :console (native-get 'java.lang.System/out'))";
        String function =
                "(defn write-to-console [message]" +
                "  (native-invoke (get environment :console) println message))";
        String source =
                "(write-to-console 'hello world!')";
    }

    @Test
    public void saySomethingElse()
    {
        String a = "(def out (native-get 'java.lang.System/out')";
        String b = "(native-invoke out println 'something else')";
    }

    @Test
    public void sayYetAnotherThing()
    {
        String a = "(def out (native-get 'java.lang.System/out')";
        String b = "(. out println 'something else')";
        // dot '.' is a reader macro (syntactic sugar), it reverses the verb -> noun to noun -> verb
    }
}
