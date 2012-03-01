;; test whether the entered word or number is a palindrome
(defn isPalindrome? [word]
  (let [chars (seq (str word))]
    (= (reverse chars) chars))) 