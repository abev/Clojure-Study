;; how to point to a function and 
;; then call the function
(defn twice [a] 
  (* a 2))


(def x #'twice)

(x 2)

