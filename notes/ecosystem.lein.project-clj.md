---
id: nq5bd0xrdu16s84qxss3ida
title: Project Clj
desc: ''
updated: 1681309941544
created: 1681308953632
---

here's a sample `project.clj`. You can see a more thorough sample with comments [here](https://codeberg.org/leiningen/leiningen/src/branch/stable/sample.project.clj).

```clojure
(defproject my-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  
  :main ^:skip-aot my-app.core
  :target-path "target/%s"
  ; use other repositories alongside Clojars and Maven Central
  :repositories [["java.net" "https://download.java.net/maven/2"]]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
```