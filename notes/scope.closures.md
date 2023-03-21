---
id: qoxislrp8b2r4o6gdscc9p7
title: Closures
desc: ''
updated: 1678732172563
created: 1678730343201
---

Clojure has closures:

```clojure
(defn times-n [n] (fn [m] (* n m)))
(def times-two (times-n 2))
(times-two 40) ;; 80
```
