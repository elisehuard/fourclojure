(ns fourclojure.problem104)

(defn convert-number [arabic-number roman-translation]
  (fn[v] (let [arabic (first v)
               roman (last v)]
            [(rem arabic arabic-number)
                        (str (apply str roman (repeat (quot arabic arabic-number) roman-translation)))])))
  

(defn roman-numerals [arabic]
  (last
    (let [roman ""]
             ((apply comp
                (map convert-number
                     [1   4    5   9    10  40   50  90   100 500 900  1000]
                     ["I" "IV" "V" "IX" "X" "XL" "L" "XC" "C" "D" "CM" "M"]
                     )) [arabic roman]))))
