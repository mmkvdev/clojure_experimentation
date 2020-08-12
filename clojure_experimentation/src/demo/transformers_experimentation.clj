;;Breaking down problems in Functional Programming is taking some input data then transforming it, to produce some data structures.
(ns demo.transformers-experimentation
  (:require [demo.string-experimentation :as string]
            [demo.practiceclojure :as practice]
            [clojure.string :as cs]))

(comment
  (defn transform-function-character [transform-fn]
  (transform-fn (rand-nth practice/city_names))))

(comment
  (defn transform-function-character [transform-fn]
  (transform-fn (rand-nth practice/city_names))))

(comment
  (defn transform-string-function [transform-fn]
  (transform-fn (println (string/strcount "cool")))))

(defn transform-string-function [transform-fn]
  (transform-fn (string/strcount "cool")))

(defn transform-stringjoin-function [transform-fn]
  (transform-fn (string/strjoin ", " ["a" "b"])))

(comment
  (defn transform-string-function-slurp [transform-fn]
  (transform-fn (rand-nth practice/city_names))))

(defn add [x y]
  (+ x y))


;;(def add_use (println add (1 2)))

;;(println add (1 2))

;;(println (add 1 2))

;;used for data transformation.
(defn calling-function-from-a-function [x]
  ;;(println "x value is:" x)
  (fn [y]
    ;;(println "y value is:" y)
    (println x "+" y "=" (add x y))
    ;;(println (x))
    ;;(println (y))
    (+ x y)))

(def increase (calling-function-from-a-function 1))
(def decrease (calling-function-from-a-function -1))

;;(println (increase 2))
;;(println (decrease 3))

;; iterate function -> (iterate function starting_point)
(comment
  (defn iterate_function [func limit]
  (take limit (iterate func 0))
))


;;take function -> (take n)(take n coll)
;;Returns a lazy sequence of the first n items in coll, or all items if
;there are fewer than n.  Returns a stateful transducer when
;no collection is provided.
(take 5 (iterate increase 1))
;;(println (string/strcat "hello" "world"))


;;LAZY FUNCTIONS
;; Most of the sequence library functions are lazy, i.e. functions that return seqs do so incrementally,
;; as they are consumed, and thus consume any seq arguments incrementally as well.
;; Functions returning lazy seqs can be implemented using the lazy-seq macro. See also lazy.

;; evaluation of lazy sequences is called realization.

;;PRODUCING LAZY SEQUENCES
;; Lazy sequences are produced by functions.
;; Such functions either use the clojure.core/lazy-seq macro or other functions that produce lazy sequences.

;;filter operation - takes a test function

;;list= ["nile" "barcelona"]

(println list)

(comment
  (println (filter (fn [name]
          cs/ends-with? name "e")
        ["nile" "barcelona"])))

(comment
  (defn filter_out [x y z]
  ;;(println x "," y "," z)
  (filter (fn [x y z]))
)
)

(comment
  (def filter_out (fn [x y z]
  (filter (fn [x y z]))
)))

(comment
  (def filter_out (filter (fn [name]
                          (cs/ends-with? name "e"))
                        ["nile" "bile"])))

(println (filter (fn [name]
          (cs/ends-with? name "e"))
        ["nile" "bile"]))


(println (filter (fn [name]
                   (cs/starts-with? name "n"))
                 ["nile" "bile"]))

