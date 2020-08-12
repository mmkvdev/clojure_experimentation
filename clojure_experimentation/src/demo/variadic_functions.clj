(ns demo.variadic-functions)

(defn greeting [hello & who]
  (println hello who))
