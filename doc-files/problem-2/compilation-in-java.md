<div id="header" align="center">
    <h1>Компиляция в java</h1>
</div>

<div id="header" align="center">
    <h3>Компиляция и выполнение одного класса</h3>
</div>

Исходный код программы находится в файле **Test.java** по пути:

```
project-dir/
	Test.java
```

Имя файла с исходным кодом должно совпадать с именем класса (class Test -> Test.java).

```java
// Исходный кода файла Test.java
class Test {
    public static void main(String[] args) {
        System.out.println("Run Test");
    }
}
```

* Компилируем файл **Test.java** в файл с байт-кодом **Test.class** командой:

```javac Test.java```

Файл **Test.class** появится рядом с **Test.java**:

```
project-dir/
	Test.java
	Test.class
```

* Запускаем программу командой:

```java Test```


<div id="header" align="center">
    <h3>Компиляция и выполнение нескольких классов</h3>
</div>

Для работы с несколькими классами нужен **classpath**. Он похож на файловую систему, в которой содержатся классы, а
функции папок выполняют пакеты (**packages**).

Отделим файлы исходного кода (каталог **src/**) от скомпилированных файлов (**bin/**).

Например, в пакете **src** находится два класса **Box** и **BoxMachine**.

```java
package src;

public class Box {
    private double size;

    public Box(double size) {
        this.size = size;
    }

    public String toString() {
        return "Box have size " + size;
    }
}
```

```java
package src;

public class BoxMachine {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(new Box(Math.random() * 10));
        }
    }
}
```

Все это образует файловую структуру:

```
project-dir/
    src/
        Box.java
        BoxMachine.java      
```

Чтобы скомпилировать эту группу классов, необходимо из главного каталога (в котором лежит **src/** каталог) выполнить
команду:

```
javac -d bin ./src/*
где:
    -d      - флаг, после которого следует указать местоположение, куда попадут скомпилированные файлы.
    bin     - название папки
    ./src/* - расположение исходных файлов
    *       - указывает, что необходимо скомпилировать все файлы
```

Теперь скомпилированные файлы появились в папке **bin/**:

```
project-dir/
    src/
        Box.java
        BoxMachine.java
    bin/
        src/
            Box.class
            BoxMachine.class
```

Для их запуска из главной директории воспользуемся командой:

```
java -classpath ./bin src.BoxMachine
где:
    -classpath      - флаг, после которого указывается местоположение скомпилированных файлов
    ./bin           - название папки, в которой лежат скомпилированные файлы
    src.BoxMachine  - название пакета и главного класса 
```

<div id="header" align="center">
    <h3>Создание JAR-файлов</h3>
</div>

Соберем скомпилированные файлы в **jar-файл** - архив классов.

* В главном каталоге создадим файл-манифест **manifest.mf**:

```
project-dir/
    manifest.mf
    src/
        Box.java
        BoxMachine.java
    bin/
        src/
            Box.class
            BoxMachine.class
```

В нем указывается главный класс, который будет запускаться при выполнении **jar-файла**, **classpath** и дополнительная
информация.

```
main-class: src.BoxMachine  // класс, содержащий метод main
class-path: bin/            // путь к скомпилированным классам или дополнительным библиотекам
```

* Собираем **jar-файл**:

```
jar -cmf manifest.mf box-machine.jar -C bin .
где:
    -cmf            - флаг, после которого указывают путь к файлу манифеста
    manifest.mf     - путь к манифесту
    box-machine.jar - название выходного jar-файла
    -C              - флаг, после которого указывают путь к скомпилированным классам
    bin             - путь к скомпилированным классам
    .               - путь, куда будет помещен jar-файл
```

**jar-файл** создан в текущей папке

```
project-dir/
    box-machine.jar
    manifest.mf
    src/
        Box.java
        BoxMachine.java
    bin/
        src/
            Box.class
            BoxMachine.class
```

* Запускаем **jar-файл** командой:

```java -jar box-machine.jar```

В качестве проверки создадим отдельную директорию `lib/`, перенесем туда наш jar-файл и запустим  его оттуда.

```
project-dir/
    manifest.mf
    src/
        Box.java
        BoxMachine.java
    bin/
        src/
            Box.class
            BoxMachine.class
    lib/
        box-machine.jar
```
