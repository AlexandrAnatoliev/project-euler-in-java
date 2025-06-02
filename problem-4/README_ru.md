## Запуск программы

Компиляция исходного кода:
`javac -d bin src/Solution.java`

Запуск скомпилированного кода:
`java -cp bin/ Solution`

## Тестирование

Определить местоположение нужных файлов junit5:
`dpkg -L "junit5"`

Для ноутбука Honor:
```
/usr/share/java/junit-jupiter-api-5.10.1.jar
/usr/share/java/junit-platform-console-standalone-1.9.1.jar
```

Компиляция тестового класса:
`javac -d bin/ -cp "/usr/share/java/junit-jupiter-api-5.10.1.jar:/usr/share/java/junit-platform-console-standalone-1.9.1.jar:bin" 
src/test/SolutionTest.java`

Запуск тестов:
`java -jar /usr/share/java/junit-platform-console-standalone-1.9.1.jar --classpath bin/ --scan-class-path`



