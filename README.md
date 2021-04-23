# JCompiler

This project implements a small compiler for a custom language for a college
course, built using **Java**, **JLex** for the lexical analyzer, and **CUP**
(Constructor of Useful Parsers) for the syntactic analyzer and Abstract Syntax
Tree (AST) generation.

## Prerequisites

The following must be installed:

1.  **Java Development Kit (JDK)**: To compile and run Java code.
2.  **JLex**: The JAR file (`jlex.jar`) must be present in the root directory.
3.  **CUP**: The JAR file (`cup.jar`) must be present in the root directory.

## Running

| File        | Description                                          |
| ----------- | ---------------------------------------------------- |
| `input.txt` | The source file containing the code to be processed. |
| `build.bat` | The script to build and run everything.              |

To build the lexer, parser, compile all components, and run the final program
against `input.txt`, run the `build.bat` file.
