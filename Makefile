
SOURCES=\
	src/java/main/org/wonderly/awt/Packer.java \
	src/java/main/org/wonderly/awt/PackAs.java

all: ${SOURCES} classes Example.class
	javac -d classes `find src -name '*.java'`

run: all
	java -cp classes Example

Example.class: Example.java
	javac -cp classes -d classes Example.java

jar:
	rm -rf classes;mkdir -p classes
	javac -d classes `find src -name '*.java'`
	(cd classes;jar cvf ../packer.jar .)
	
classes:
	mkdir -p classes
