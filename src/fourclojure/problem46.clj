(ns fourclojure.problem46)

(defn flip-arguments [f]
  (fn[y x]
    (f x y)))

