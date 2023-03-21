(str \h \e \l \l \o \  \w \o \r \l \d)
(#(* 2))

(defn times-n
  [n get-m]
  {:pre [(number? n) (fn? get-m)] :post (number? %)}
  (* n (get-m)))

(times-n 2 (fn [] 4)) ;; happy
(times-n 2 4) ;; fails
(times-n 2 (fn [] nil)) ;; fails
