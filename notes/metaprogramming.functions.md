---
id: 3efp2v5brxrx5sxlp6l9l1s
title: Functions
desc: ''
updated: 1680514400669
created: 1680514297374
---

Clojure ships a set of functions that enable metaprogramming, including (but not limited to) the one's below


```clojure
(read-string "(println 5)") ;; (println 5)

(eval (read-string "println 5")) ;; prints 5

(eval (map (fn [item] (if (int? item) (* 2 item) item))
           (read-string "(println 5)"))) ;; prints 10
```
