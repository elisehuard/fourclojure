(ns fourclojure.test.problem80
  (:use [fourclojure.problem80])
  (:use [clojure.test]))
  
(deftest perfect-number-test
  (is (= (perfect-number 6) true))
  (is (= (perfect-number 7) false))
  (is (= (perfect-number 496) true))
  (is (= (perfect-number 500) false))
  (is (= (perfect-number 8128) true))
)

