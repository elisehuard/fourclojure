(ns fourclojure.test.problem76
  (:use [fourclojure.problem76])
  (:use [clojure.test]))

(defn trampoline-test
  (is (= tp
     (letfn
       [(foo [x y] #(bar (conj x y) y))
        (bar [x y] (if (> (last x) 10)
                     x
                     #(foo x (+ 2 y))))]
       (trampoline foo [] 1))))
