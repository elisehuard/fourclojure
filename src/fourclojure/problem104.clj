(ns fourclojure.problem104)


(defn thousands [[arabic roman]]
  [(rem arabic 1000) (str (apply str roman (repeat (quot arabic 1000) "M")))])

(defn high-hundreds [[arabic roman]]
  (cond (>= arabic 900)
     [(rem arabic 100) (str roman "CM")]
        (>= arabic 500)
     [(rem arabic 500) (str roman "D")]
        :else
     [arabic roman]))

(defn low-hundreds [[arabic roman]]
     [(rem arabic 100) (str (apply str roman (repeat (quot arabic 100) "C")))])

(defn high-tens [[arabic roman]]
  (cond (>= arabic 90)
     [(rem arabic 90) (str roman "XC")]
        (>= arabic 50)
     [(rem arabic 50) (str roman "L")]
        (>= arabic 40)
     [(rem arabic 40) (str roman "XL")]
        :else
     [arabic roman]))

(defn low-tens [[arabic roman]]
     [(rem arabic 10) (str (apply str roman (repeat (quot arabic 10) "X")))])

(defn high-units [[arabic roman]]
  (cond (>= arabic 9)
     [(rem arabic 9) (str roman "IX")]
        (>= arabic 5)
     [(rem arabic 5) (str roman "V")]
        (>= arabic 4)
     [(rem arabic 4) (str roman "IV")]
        :else
     [arabic roman]))

(defn low-units [[arabic roman]]
   [0 (str (apply str roman (repeat arabic "I")))])

(defn roman-numerals [arabic]
  ; if remaining >= 1000 = M - remove that amount
  ; if remaining >= 100 = C unless 900 then CM
  ; if remaining >= 10 = X unles 90 then XC
  ; if remaining >= 5 V unless 9 then IX
  ; if remaining >= 1 I unles 4 then IV
  (last
    (let [roman ""]
             (-> [arabic roman]
                 thousands
                 high-hundreds
                 low-hundreds
                 high-tens
                 low-tens
                 high-units
                 low-units))))

