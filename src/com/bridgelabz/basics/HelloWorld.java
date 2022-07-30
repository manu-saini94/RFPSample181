package com.bridgelabz.basics;

// JDK => JRE + Compilers + javadoc ,debugger etc.
// JRE => JVM + browser plugins
// JVM => Java Virtual Machine
        // JVM converts bytecode produced by the compiler into machine readable code

// HelloWorld.java (source code)
// When we run a java file the source code is given to the compiler
// Compiler takes the source code and converts it into byte code(.class file)
// .class file is taken by JVM and it is interpreted into machine readble code
// this machine readable code is finally executed.


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("branch1 code");
    }
}
