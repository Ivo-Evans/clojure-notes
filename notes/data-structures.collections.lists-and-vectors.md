---
id: qz6xnujlv25abvwb25hrxq3
title: Lists and Vectors
desc: ''
updated: 1681403354809
created: 1679583006762
---

A list can be constructed by using `'` as an escape sequence on parentheses:

```clojure
(def my-list '(1 2 3))
```

A vector uses square brackets:

```clojure
(def my-vector [1 2 3])
```

Both collections represent ordered data. A list is a linked list, and a vector is is an indexed collection. `conj` adds an item to the _beginning_ of a list, but the end of a vector:

```clojure
(println (conj my-list 0)) ; (0 1 2 3)
(println (conj my-vector 4)) ; )[1 2 3 4]
```

Another key difference between lists and vectors is that vectors are designed for index access (although they don't achieve this at constant time). 

```clojure
(my-vector 2) ;; 3
;; for lists, you should use nth
(nth my-list 2) ;; 3
```



While both vectors and lists support `seq`, vectors also support `rseq`, which returns the sequence in reverse order. 