(ns demo.palindrome
  (:require [clojure.string :as str]))

(comment
  (defn palindrome [s]
  (if (= s (str/reverse s))
    (println "palindrome string")
    (println "not a palindrome string"))))
;;(println (palindrome "hello"))
;;(palindrome "nag")


(defn palindrome [s]
  (let [lowercase (str/lower-case s)
        reversed (str/reverse lowercase)]
    (= reversed lowercase)))


(not= ["hello" 2 3] [(str "hell" "o") 2 3])

(cond
  (= 1 2)
  (println "yes")
  (not= 3 4)
  (println "yes")

  true
  :conditionalstatement)

