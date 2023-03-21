---
id: k6ys9b1uiwjq7dui8r1nuyp
title: Hoisting
desc: ''
updated: 1678725981150
created: 1678725843841
---


Global variables defined within a Clojure file are hoisted:

```clojure
(println (* foo foo))
(def foo 10)
;; only the linter complains - 100 is logged to the console
```

However, global functions are not:

```clojure
(println (* (foo) (foo)))
(defn foo [] 10) ;; error
```