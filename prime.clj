;;to find if a number is prime or not

(defn- divides? [ n m ]
  {:pre (m > 0) }
  (zero? (rem n m)))

(defn- prime-divisor-limit [n] 
  (inc (int (/ n 2))))


(defn- divisors [n] 
  (for [i (range 2 (prime-divisor-limit n) )  :when (divides? n i) ] i ))


;; here pre condition is not working why
;; why integer is getting overflow if large input is given
(defn isPrime [n] 
    {:pre (> n 2) }
    (if-not (seq (divisors n)) true false))


;; returns  prime nos. between 1 and 9999 --> 
;;  (for [i (range 1 10000) :when (isPrime i)] [i])