;; returns the factorial of a number
;; uses loop and recur 
 (defn factorial [n] 
  (loop [result 1  counter n]
      (if (= counter 1) 
        result
        (recur (* result counter) (dec counter) ) ) ) )