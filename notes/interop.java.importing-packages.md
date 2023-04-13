---
id: rdlpy5ql69w2onschha10dw
title: Importing Packages
desc: ''
updated: 1681402982856
created: 1681400376889
---
There is an `import` function but it's most common to use `:import` in your namespace declaration:

```clojure
(ns pirate.talk
  (:import [java.util Date Stack]))
```

Here, in the namespace `pirate.talk`, we import the classes `Date` and `Stack` from `java.util` package. 

The entirety of the `java.lang` package is automatically available. 

`java.lang` contains such goodies as `Boolean`, `Number`, `String`, `Process`, `Runtime` and `System` ([Java 8](https://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html)).