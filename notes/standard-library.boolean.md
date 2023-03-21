---
id: bl0pe3qafl6bzy2lusdk74f
title: Boolean
desc: ''
updated: 1679426688300
created: 1678917183936
---
`boolean` returns a passed boolean, `false` for `nil` and `true` for everything else.

```clojure
(boolean false) ;; false
(boolean nil) ;; false
(boolean "false") ;; true
(boolean 0) ;; true
```