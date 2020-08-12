(ns demo.core
  (:gen-class) (:require
                 [demo.palindrome :as dp]
                 [demo.strrev :as str]
                 [demo.practiceclojure :as pc]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;;(println "Hello World" 3 5)
  ;;(println (s/upper-case "Hello"))
  (println (dp/palindrome "sneh1"))
  (str/join "hello")
  ;;(pc/names "/home/madhumudunuri/Documents/clojure_project/city.txt")
)

;;(println ("\H \r \space"))