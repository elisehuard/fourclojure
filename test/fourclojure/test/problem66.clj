(ns fourclojure.test.problem66
  (:use [fourclojure.problem66])
  (:use [clojure.test]))


(deftest greatestcommondivisor
  (is (= (gcd 2 4) 2))
  (is (= (gcd 10 5) 5))
  (is (= (gcd 5 7) 1))
  (is (= (gcd 1023 858) 33)))
