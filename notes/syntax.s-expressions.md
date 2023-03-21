---
id: vw3kxjphkcwhw1129c965jw
title: S Expressions
desc: ''
updated: 1678991162898
created: 1678722640274
---

An s-expression, short for symbolic expression and often shorted to sexp or sexpr, is probably Clojure's most basic syntactic unit. An s-expression is either a bare literal, or a list:

```clojure
;; an s-expression (literal)
5
;; an s-expression (list)
(add 5 5)

;; an s-expression (list)
()
```

When an s-expression is a list, the first position is called the calling position. Every other item will be passed to the item in the calling position. 