(ns fourclojure.problem37)

(defn interl [x y]
  (loop [result '()
         first-map x
         second-map y]
    (if (or (empty? first-map) (empty? second-map))
      (reverse result)
      (recur (-> result (conj (first first-map)) (conj (first second-map)))
             (rest first-map)
             (rest second-map)))))

(interl [1 2 3] [:a :b :c])
