;; sum numbers upto  n 
(defn sum-upto-number [ n ]
	(loop [result 0 counter n]
                          (if (zero? counter)
		result
		(recur (+ result counter) (dec counter) ) ) ) )
