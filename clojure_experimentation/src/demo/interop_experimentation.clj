(ns demo.interop-experimentation)

;;(println (String. "cool"))

(comment
  (let [string (String. "cool")]
  (. string charAt 1)))                                      ;;(.charAt string 2)

(comment
  (let [string (String. "cool")]
  (. string charAt 1)))

(comment (System/getProperty "java.version"))                         ;;calling function inside a module.

(comment
  (defn let_experimentation ((let [string (String. "cool")]
                             (.charAt string 1)))))


(comment
  (defn letexperimentation [] (
  let [string (String. "cool")]
  (.charAt string 1))))

(defn letexperimentation [] (
                              let [string (String. "cool")]
                              (.charAt string 1)))

(defn letexperimentation_1 [] (let [string (String. "cool")]
                               (. string charAt 1)))

(System/getProperty "java.version")

(defn stringbuilder []
  (.. (StringBuilder.)
    (append "Running Java")
      ;;(def str1 "AAABBBCCC")
    (append (System/getProperty "java.version"))
    (toString)))