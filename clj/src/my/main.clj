(ns my.main
  (:import (my.project Thing)))

(defn -main [& args]
  (println (.stuff (Thing.)))
  (shutdown-agents))
