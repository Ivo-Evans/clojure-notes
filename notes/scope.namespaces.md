---
id: arvbcojloj5jhp8qimym551
title: Namespaces
desc: ''
updated: 1681486785842
created: 1681486566726
---

Namespaces are Clojure's mechanism for packages/modules.

By convention, one file corresponds to one namespace, and the namespace name represents the folder path. The namespace of the file `utils/time.clj` might be `utils.time`. 

Namespaces in Clojure are first class, meaning they can be read and modified at runtime. 

Clojure ships a varety of functions for working with namespaces, but you will almost always want to use the `ns` macro. 