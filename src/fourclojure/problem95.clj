(ns fourclojure.problem95)

(defn binary-tree? [x]
  (reduce #(and %1 %2)
          (map #(if (coll? %1)
                  (= 3 (count %1))
                  (nil? %1))
            (tree-seq coll? seq x))))
