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

```java
// Исходный кода файла Test.java
class Test {
	public static void main (String[] args) {
		System.out.println("Run Test");
	}
}
```

Имя файла с исходным кодом долхно совпадать с именем класса (class Test -> Test.java).

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
