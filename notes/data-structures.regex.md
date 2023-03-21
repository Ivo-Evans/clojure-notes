---
id: gozjn563q4bhyljd3jiu4gt
title: Regex
desc: ''
updated: 1678988005114
created: 1678987792034
---
Regex literals use the string syntax, but are prepended with a hashbang/octothorpe:

```clojure
#"\s.+"
```

## Which RegEx engine is used?

> Clojure defers to the host regex syntax and semantics instead of defining a standard that works on all platforms. On the JVM, you're using Java regexes. In ClojureScript, it's Javascript regexes.

([source](https://ericnormand.me/mini-guide/clojure-regex))

Apparently Java 8 and Java 9 have different RegEx engines.