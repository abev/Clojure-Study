;; count down from number n 
;; using various clojure constructs

(defn count-down [n] 
  (when (pos? n) 
    (println "Countdown " n)
    (recur (dec n))))

(defn count-down-with-for [n] 
  (for [i (range n 1 -1)] (println "Count-down " i) ) )

(defn count-down-with-doseq [n] 
  (doseq [i (range n 1 -1)] (println "Count-down " i) ) )

(defn count-down-with-dotimes [n] 
  (dotimes [i n] (println "Count-down " i) ) )