;; returns the factorial of a number
;; uses loop and recur
;; this is bit of imperative coding as compared to declarative functional coding
;; as in Haskell which supports like stating rules
;; let fact n = 
;;    n=1 :  1
;;    n : n * fact n             ;; syntax may be not correct in Haskell ... 

 (defn factorial [n] 
  (loop [result 1  counter n]
      (if (= counter 1) 
        result
        (recur (* result counter) (dec counter) ) ) ) )