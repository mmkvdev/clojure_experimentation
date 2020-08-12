(ns demo.if-experimentation)

(comment
  (if (= "hello" (str "hell" "i"))
  "YES"
  (do
    ;;(println "log no")
    "NO")))
(comment (defn issmall? [number]
  (if (< number 50 ) "yes" "no")))

(comment
  (defn isvowel? [s]
  (if (contains? [1 2 3] s) "yes" "no")))

(comment
  (defn doif []
  (if (= "hello" (str "hell" "o"))
             (do
               (println "cool")
               (println "not cool"))))
)


(comment
  (def if_experimentation
  (fn [] ((if (= "hello" (str "hell" "o"))
  "YES"
  (do
    (println "log no")
    "NO")
  )))))


;;perfect example of if condition evaluation
(comment
  (def if_experimentation
  (fn []
    (if (not= "hello" (str "hell" "o"))
      "YES"
      (do
        (println "log no")
        "NO")
      )
    )
))


;;in the case of when -> having implicit do statement

(comment
  (def when_do_experimentation(
       fn []
       (
         (when (= "hello" (str "hell" "o"))
           (println "cool")
           (println "cool ok!!")
           )
         )
       )))


(comment
  ;;just experimental
  (def when_do_experimentation (
  fn [] (
    (when (="hello" (str "hell" "o"))
      (println "cool")
      (println "cool ok!!!"))
  )
)))

(comment
  (def evalwhen (
                 when true
                 (println "cool")
                 "OK!!  ")))

(def evalwhen (when true
                (println "Hello")
"OK"))