(ns demo.hello
  (:gen-class) (:require [demo.practiceclojure :as pc]))
(defn hello-world []
  ;;(println "Hello World")
  (pc/names "/home/madhumudunuri/Documents/clojure_project/city.txt")
  )
;(println ((+ 1 2)))
;;(hello-world)