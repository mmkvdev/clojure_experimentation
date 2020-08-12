(ns demo.strrev
  (:require [clojure.string :as string]))

(def join
  (fn [s]
    (string/join "-" (string/reverse s))))
