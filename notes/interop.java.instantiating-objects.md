---
id: 8ntm6lhsd2ztavuqe8272jw
title: Instantiating Objects
desc: ''
updated: 1681400675881
created: 1681400349259
---

You can instantiate a Java object by using a macro over the dot operator, or the `new` keyword. The dot version is more idiomatic:

```clojure
(String. "sup") ; note the `.` after `String`
(new String "sup")
```