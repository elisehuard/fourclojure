(ns fourclojure.test.problem46
  (:use [fourclojure.problem46])
  (:use [clojure.test]))

(deftest flip-args-test
  (is (= 3 ((flip-arguments nth) 2 [1 2 3 4 5])))
  (is (= true ((flip-arguments >) 7 8)))
  (is (= 4 ((flip-arguments quot) 2 8)))
  (is (= [1 2 3] ((flip-arguments take) [1 2 3 4 5] 3))))
