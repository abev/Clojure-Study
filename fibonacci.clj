;; returns a fibonacci sequence
(defn fibonacci []
     (letfn [(fib [[a b]] [b (+ a b)])]
                     (->> [0 1]
        	 (iterate fib)
	 (map first) )))
;;  some Notes	
;;  runs upto 91 fibonacci numbers until its Arithmetic Overflow
;;  to get first 10 fibonacci nos. (take 10 (fibonacci))