#!/bin/bash
# Компиляция
javac -d out/ src/main/java/org/example/*.java

# Создание JAR
jar cfe heapsort.jar org.example/HeapSort -C out/ .

# Запуск программы
java -jar heapsort.jar
