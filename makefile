# Axel Fahy
# 24.03.2015
#
# TCPIA
#
# Makefile for JFlex and JCup.
#
# 'make'	build executable file
# 'make clean'	remove temporary files and .class, .java files, ...

CLASSPATH=java-cup-11b.jar:.
SRCFLEX=TCPIA_Flex.flex
SRCCUP=TCPIA_Cup.cup
OBJ=sym.class parser.class Lexer.class TCPIA.class

all : $(OBJ)

Lexer.java : $(SRCFLEX)
	jflex $(SRCFLEX)

sym.java parser.java : $(SRCCUP)
	java -jar java-cup-11b.jar $(SRCCUP)

%.class : %.java
	javac -classpath $(CLASSPATH) $<

clean:
	rm -rf *.class *~ $(PARSER).java $(LEXER).java sym.java parse_prog
	rm -rf Arbre/*.class Arbre/*~
