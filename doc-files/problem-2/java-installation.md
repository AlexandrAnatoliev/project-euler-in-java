<div id="header" align="center">
    <h1>Установка Java на Ubuntu сервер</h1>
</div>

Обновляем перечень пакетов **apt** в системе:

```sudo apt update```

Проверим, устанавливалась **Java** на **Ubuntu** или нет.

```java -version```

В ответ на выполнение команды пользователь получит текст, похожий на указанный ниже:

```
...:~# java -version
Command 'java' not found, but can be installed with:
apt install default-jre
apt install openjdk-11-jre-headless
...
```

Используем команду из списка, предложенного консолью:

```apt install имя-версии```

* **JRE** - это программная среда, в которой выполняются программы **Java**. Она включает в себя **JVM** и библиотеки
  классов **Java**.
* **JDK** - это платформа разработки для создания приложений **Java**. В него входит сам **JRE**, компилятор, отладчик и
  другие полезные инструменты разработчика.

Для скачивания на сервер **JRE** из **OpenJDK** пишем, например:

```apt install openjdk-21-jre-headless```

Если необходимо скачать **JDK**:

```apt install openjdk-21-jdk-headless```

Чтобы проверить, что все прошло успешно, проверяем версию **Java**:

```java -version```

...и компилятора:

```javac -version```


