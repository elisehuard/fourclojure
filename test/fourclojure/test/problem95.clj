(ns fourclojure.test.problem95
  (:use [fourclojure.problem95])
  (:use [clojure.test]))


(deftest binary-tree-test[]
  (is (= (binary-tree? '(:a (:b nil nil) nil)) true))
  (is (= (binary-tree? '(:a (:b nil nil))) false))
  (is (= (binary-tree? [1 nil [2 [3 nil nil] [4 nil nil]]]) true))
  (is (= (binary-tree? [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false))
  (is (= (binary-tree? [1 [2 [3 [4 nil nil] nil] nil] nil]) true))
  (is (= (binary-tree? [1 [2 [3 [4 false nil] nil] nil] nil]) false))
  (is (= (binary-tree? '(:a nil ())) false)))

(run-tests 'fourclojure.test.problem95)
