(ns fourclojure.problem80)

(defn divisor? [number factor]
  (= (mod number factor) 0))

(defn divisors [number]
  (filter (partial divisor? number) (range 1 number)))

(defn perfect-number [number]
  (= (reduce + (divisors number)) number))

(fn[x]
  (leftn [(divisor? [number factor] (= (mod number factor) 0))
          (divisors [number] (filter (partial divisor? number) (range 1 number)))]
         (= (reduce + (divisors number)) number)))

