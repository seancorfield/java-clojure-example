(ns build
  (:require [clojure.tools.build.api :as b]))

(defn compile-java [& _]
  (b/delete {:path "target"})
  (b/javac {:src-dirs  ["java/src"]
            :class-dir "target/classes"}))

(defn run [& _]
  (compile-java)
  (let [cmd (b/java-command {:basis (b/create-basis)
                             :main  'clojure.main
                             :main-args ["-m" "my.main"]})]
    (b/process cmd)))

(comment
  (run)
  )
