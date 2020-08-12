(ns demo.practiceclojure
  (:require [clojure.string :as s]))

;;(def names (slurp "/home/madhumudunuri/Documents/clojure_project/clojure_links.txt"))

(comment
  (defn names []
  (if (= "a" "b")
    (println "hello")
    (println "world")
    )
)
(names))

(comment(def fn names [st]
  (s/split-lines(slurp st))))

(def names (fn [st]
       (s/split-lines (slurp st))))


(comment (not= ["hello" 2 3] [(str "hell" "o") 2 3]))

(contains? #{"a","b","hello"}
           (str "hell" "o"))

(defn city_names []
  (println (s/split-lines (slurp "/home/madhumudunuri/Documents/clojure_project/city.txt"))))