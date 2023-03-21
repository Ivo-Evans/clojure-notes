---
id: vm398kbfqpou8bvoooq787m
title: Strings and Chars
desc: ''
updated: 1679426551584
created: 1678917336845
---

Clojure uses Java string and chars. 

The syntax for strings is the double-quote:

```clojure
"hello world"
```

The single quote is not for strings. It is used to tell the reader to evaluate but not read the next form - useful for macros. 


The syntax for Clojure chars is the backslash:

```clojure
\h
```

In Java, a char is a primitive type, and a string is a class which represents its data as an array of chars.

In Clojure, if you have chars, you can use the `str` function, which calls `toString()` on each argument and concatenates the result.

```clojure
(str \h \e \l \l \o \  \w \o \r \l \d)
```

Notice that `\ ` actually worked.