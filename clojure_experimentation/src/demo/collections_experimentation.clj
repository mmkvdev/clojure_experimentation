(ns demo.collections-experimentation)

(let [my-map {:a 1 :b 2}]
  (println (my-map :a)))

(let [my-list [1 2 3]]
  (println (my-list 0)))

(let [my-set #{:a :b}]
  (println (my-set :a)))

(let [my-vec (vector-of :double 1.2 3.4)]
  (println (my-vec 1)))

;;keyword is a function
(let [my-fun (fn [] :name)
      my-map {:name "Madhu"}]
  (println ((my-fun) my-map)))

(println (get [1 2 3] 4 :hello))

;; associate a value into the list/set.
(println (assoc [1 2] 0 2))

(let [my-vec1 [1 2]
      my-vec2 (assoc my-vec1 0 3)]
  (println my-vec2))

(let [my-map {:a 1 :b 2}]
  (println (assoc my-map
    :c 3
    :d 4
    :a 0)))

;;there is a converse function to assoc called dissoc that's gonna remove the keys/objects in the map provided a key.
(let [my-map {:a 1 :b 3}]
  (println (dissoc my-map
                   :a
                   :d)))

(let [my-map {:a 1 :b 2}]
  (println (assoc nil
             :a 2)))

;;nested maps
(let [my-map {:a 1 :b {:b1 1 :b2 [1 2 3]}}]
  (println (assoc-in my-map [:b :b2 2] 33)))