(ns demo.string-experimentation
  (:require [clojure.string :as s]))

(defn strcat [s1 s2]
  println (str s1 s2))

(defn strformat [s]
  (println (format s "%s, ok")))

(defn strcount [s]
  (println (count s)))

(defn substr [s start end]
  (println (subs s start end)))

(defn strcompare [start end]
  (println (compare start end)))

(defn strlower [s]
  (println (s/lower-case s)))

(defn strupper [s]
  (println (s/upper-case s)))

(defn strjoin [sep col]
  (println (s/join sep col)))

(defn strsplit [s reg]
  (println (s/split s reg)))

(defn strrev [s]
  (println (s/reverse s)))

(defn strreplace [s match replacement]
  (println (s/replace s match replacement)))

(defn strtrim [s choice]
  (if (= choice "l")
    (println clojure.string/triml s)
    (if (= choice "r")
      (println clojure.string/trimr s)
      (println clojure.string/trim s)))
)
(comment
  (def string_world
  (fn [] (
  ;;string concatenation -> str stringvar1 stringvar2 stringvarn
  (println (str "hell" "o"))
  ;;string formatting -> (format fmt args)
  (println (format "hello, %s" "ok"))
  ;;counting the no.of characters in a string -> (count stringvariable)
  (println (count "cool"))
  ;;returning a substring, provided start and end params -> (subs s start end)
  (println (subs "HELLO" 2 3))
  ;;Returns a negative number, zero, or a positive number when ‘x’ is logically 'less than', 'equal to', or 'greater than' ‘y’.(compare x y)
  (println (compare 2 3))
  ;;lower-case
  (println (s/lower-case "HeLlo"))
  ;;uppercase
  (println (s/upper-case "hhhhh"))
  ;;join statement in clojure , involves sep and col attributes -> (join sep col) -> sep optional but makes it better formattable.
  (println (s/join ", " [1 2 3]))
  ;;splitting a string based on a regular expression -> (split str reg)
  (println (s/split "Hello World" #" "))
  ;;reverse of a string
  (println (reverse "Hello World"))
  ;;reverse of a string via clojure.core.string
  (println (s/reverse "Hello"))
  ;;replacing the string with the specified match ->   (replace str match replacement)
  (println (s/replace "consider this mercy" #"this" "cool"))
  ;;trimming the whitespaces from both ends of a string
  (println (s/trim " White spaces "))
  ;;trimming the whitespaces from left side of the string
  (println (s/triml " White spaces"))
   ;;trimming the whitespaces from the right side of the string
   (println (s/trimr "white spaces  t"))
))))