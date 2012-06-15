(ns fourclojure.problem66)

(defn gcd [a b]
  (loop [bigger a
         smaller b]
    (if (= smaller 0)
      bigger
      (recur smaller (mod bigger smaller)))))
