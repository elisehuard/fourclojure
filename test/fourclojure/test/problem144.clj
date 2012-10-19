(ns fourclojure.test.problem104
  (:use [fourclojure.problem108])
  (:use [clojure.test]))

(deftest oscilrate-test
  (is (= (take 3 (oscilrate 3.14 int double)) [3.14 3 3.0]))
  (is (= (take 5 (oscilrate 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7]))
  (is (= (take 12 (oscilrate 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3]))
)
