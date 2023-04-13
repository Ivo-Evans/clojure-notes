---
id: cl412urks46pwd9wkl2wj4i
title: Compilers and Interpreters
desc: ''
updated: 1681405313376
created: 1681404310790
---

You might not need any compiler at all. `clojure` is distributed in a `jar` file, and in most projects it is listed as a dependency. This means that if you run the project with `lein run` or similar, the Clojure `jar` will be used. 

`lein` is not a compiler, but a Clojure build and project management tool. To use the Clojure `jar`, you will want a JDK.

Clojure provides an official command line tool called [`clj`](https://clojure.org/guides/deps_and_cli), which can be run to start a REPL or execute a file. 

I use [Babashka](https://github.com/babashka/babashka) for playing around, which is a Clojure interpreter designed to be used with Bash. It's based on GraalVM and bypasses the JVM, so promises fast startup. Its binary is `bb`. 

```bash
bb # enter a repl
bb foo.clj # run foo.clj
```