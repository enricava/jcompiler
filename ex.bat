call :sub >output.txt 2>&1
exit /b

:sub

java -cp jlex.jar JLex.Main ./alex/AnalizadorLexicoExp.l
cd ./alex
del AnalizadorLexicoExp.java
ren AnalizadorLexicoExp.l.java AnalizadorLexicoExp.java
cd ..

cd ./constructorast
java -cp ../cup.jar java_cup.Main -parser ConstructorASTExp -symbols ClaseLexica -nopositions ConstructorAST.cup
cd ..
javac -cp "cup.jar;." alex/*.java ast/*.java constructorast/*.java errors/*.java
java -cp "cup.jar;." constructorast.Main input.txt

del /s *.class