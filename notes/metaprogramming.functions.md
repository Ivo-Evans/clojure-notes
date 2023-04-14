---
id: 3efp2v5brxrx5sxlp6l9l1s
title: Functions
desc: ''
updated: 1681479611827
created: 1680514297374
---

Clojure ships a set of functions that enable metaprogramming, including (but not limited to) the ones below


```clojure
(read-string "(println 5)") ;; (println 5)

(eval (read-string "println 5")) ;; prints 5

(eval (map (fn [item] (if (int? item) (* 2 item) item))
           (read-string "(println 5)"))) ;; prints 10
```

When you call `eval`, the Clojure code being evaluated is compiled into JVM bytecode.