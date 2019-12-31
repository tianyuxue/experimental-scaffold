javac Foo.java
java Foo
java -cp ../lib/asmtools.jar org.openjdk.asmtools.jdis.Main Foo.class > Foo.jasm.1
awk 'NR==1,/iconst_1/{sub(/iconst_1/, "iconst_2")} 1' Foo.jasm.1 > Foo.jasm
java -cp ../lib/asmtools.jar org.openjdk.asmtools.jasm.Main Foo.jasm
java Foo
