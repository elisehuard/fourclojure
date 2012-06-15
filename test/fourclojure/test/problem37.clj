(ns fourclojure.test.problem37
  (:use [fourclojure.problem37])
  (:use [clojure.test]))

(deftest same-length
  (is (= (interl [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))))

(deftest different-length
  (is (= (interl [1 2] [3 4 5 6]) '(1 3 2 4)))
  (is (= (interl [1 2 3 4] [5]) [1 5]))
  (is (= (interl [30 20] [25 15]) [30 25 20 15])))

(deftest interleaving
       (same-length)
       (different-length))
         
