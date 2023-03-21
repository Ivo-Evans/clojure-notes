---
id: fuowjlnkxs80t23y35c8k8q
title: Type Validation
desc: ''
updated: 1678990998770
created: 1678989447041
---

Clojure has a built in mechanism to validate input and output types, preconditions and postconditions.


```clojure
(defn times-n
  [n get-m]
  {:pre [(number? n) (fn? get-m)] :post (number? %)}
  (* n (get-m)))

(times-n 2 (fn [] 4)) ;; happy
(times-n 2 4) ;; throws
(times-n 2 (fn [] nil)) ;; throws
```
