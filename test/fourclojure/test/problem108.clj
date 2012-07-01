(ns fourclojure.test.problem108
  (:use [fourclojure.problem108])
  (:use [clojure.test]))

(deftest lazy-searching-test
  (is (= 3 (lazy-searching [3 4 5])))
  (is (= 4 (lazy-searching [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
  (is (= 7 (lazy-searching (range) (range 0 100 7/6) [2 3 5 7 11 13])))
  (is (= 64 (lazy-searching (map #(* % % %) (range)) ;; perfect cubes
                      (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
                      (iterate inc 20)))) ;; at least as large as 20
  )

