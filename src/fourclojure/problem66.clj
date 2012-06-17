(ns fourclojure.problem66)

;; Euclidian algorithm to find gcd
(defn gcd [a b]
  (loop [bigger a
         smaller b]
    (if (= smaller 0)
      bigger
      (recur smaller (mod bigger smaller)))))
