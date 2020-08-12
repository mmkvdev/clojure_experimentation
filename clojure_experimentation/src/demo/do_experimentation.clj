(ns demo.do-experimentation)

(comment
  "Evaluates the expressions in order and returns the value of the last. If no
expressions are supplied, returns nil. See http://clojure.org/special_forms
for more information.")
;; do is used to evaluate multiple expressions in order, usually for the
;; purpose of evaluating exprs that have side-effects (such as printing
;; or I/O).  do returns the value of its last expression.
;;
;; do w/o args returns nil.

(comment
  (do
  (println "do experimentation")
  (+ 1 1)))


;;fn, defn and let, implicitly have do

(comment
  (fn []
  (+ 1 1)
  "OK"))

(comment
  (defn do_experimentation []
  (println "do-experimentation")
  (println "cool")))

(comment
  (defn do_experimentation [s]
  (let [name s]
    (println "Cool")
    (str name " " "Cool")))
)

(name "MMK")