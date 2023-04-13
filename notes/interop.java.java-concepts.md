---
id: i5ncpswlz1o6te7jpum2dn5
title: Java Concepts
desc: ''
updated: 1681399148263
created: 1681398057354
---

## File and class names

In Java, class names need to correspond to file names, and a file can only export a single top-level class.

```
HelloWorld.java
```

```java
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
}
```

If you run `javac PiratePhrases.java && java PiratePhrases`, it will print `Hello world!`. The compilation step worked because the class had the same name as the file. 

## Folder and package names

You can group functionality across files with _packages_. Packages are based on folder names:

```
words/Hello.java
```

```java
package words;

public class Hello {
    public static String word() {
        return "hello";
    }
}
```


```
words/World.java
```

```java
package words;

public class World {
    public static String word() {
        return "world";
    }
}
```

```
HelloWorld.java
```

```java
import words.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(new Hello().word());
        System.out.println(new World().word());
    }
}
```

## The classpath

The classpath is used when compiling Java code to determine where to look for files and folders to create packages. It has the same syntax as Bash's `$PATH` (items are separated by colon) and it doesn't recurse. 

## JAR files

A JAR file is a zip file with some extra metadata. You can look inside them using `zip` or a GUI archive manager. 