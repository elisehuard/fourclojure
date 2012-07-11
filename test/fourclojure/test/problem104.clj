(ns fourclojure.test.problem104
  (:use [fourclojure.problem104])
  (:use [clojure.test]))
  
(deftest roman-numerals-test
  (is (= "I" (roman-numerals 1)))
  (is (= "XXX" (roman-numerals 30)))
  (is (= "IV" (roman-numerals 4)))
  (is (= "CXL" (roman-numerals 140)))
  (is (= "DCCCXXVII" (roman-numerals 827)))
  (is (= "MMMCMXCIX" (roman-numerals 3999)))
  (is (= "XLVIII" (roman-numerals 48))))
