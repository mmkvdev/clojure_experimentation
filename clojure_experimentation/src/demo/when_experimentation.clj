(ns demo.when-experimentation)

;;Evaluates test. If logical true, evaluates body in an implicit do.

(def valuewhen (when true
                 (println "cool")
                 "OK"))

(def notvaluewhen (when (= 2 3)
                    (println "ok")
                    "ok"))

