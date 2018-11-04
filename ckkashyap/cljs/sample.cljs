(ns sample)

(println "hello world")

(defn ^:export setup []
  (println "Setup called"))

(js/alert "hello")