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

(= (interl [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(interl [1 2 3] [:a :b :c])

(= (interl [1 2] [3 4 5 6]) '(1 3 2 4))

(= (interl [1 2 3 4] [5]) [1 5])

(= (interl [30 20] [25 15]) [30 25 20 15])
