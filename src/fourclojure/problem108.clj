(ns fourclojure.problem108)

(defn prune [n sq] (drop-while #(< %1 n) sq))

(defn maxfirst [& seqs]
  (apply max (map first seqs)))

(defn truncate [& seqs]
  (map (partial prune (apply maxfirst seqs)) seqs))

;(defn lazy-searching [& seqs]
;  (let [allseqs (apply truncate seqs)]
;    (if (apply = (map first allseqs))
;      (ffirst allseqs)
;      (apply lazy-searching (apply truncate (map next allseqs))))))

(defn lazy-searching [& seqs]
  (letfn [(prune [n sq]
           (drop-while #(< %1 n) sq))
         (maxfirst [& seqs]
           (apply max (map first seqs)))
         (truncate [& seqs]
           (map (partial prune (apply maxfirst seqs)) seqs))]
    (let [allseqs (apply truncate seqs)]
      (if (apply = (map first allseqs))
        (ffirst allseqs)
        (apply lazy-searching (apply truncate (map next allseqs)))))))
