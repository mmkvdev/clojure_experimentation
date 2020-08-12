(ns demo.odd-even-experimentation)

;;method to return odd and even numbers in a given range n
(defn odd-even-experimentation [n choice]
  (if (= choice "odd")
    (filter odd? (range n))
    (if (= choice "even")
      (filter even? (range n))
      (println "regular call"))
))
