(ns sample
  (:require [clojure.java.jdbc :refer :all]
            [clojure.java.io :as io])
  (:gen-class))

(def testdata
  {:name "Apple"
   :age "100"})

(def db
  {:classname   "org.sqlite.JDBC"
   :subprotocol "sqlite"
   :subname     "sample.db"})

(defn create-db
  "Create the database and the table. Look at http://clojure.github.io/java.jdbc/#clojure.java.jdbc/create-table-ddl for details."
  []
  (try (db-do-commands db
                       (create-table-ddl :nameAndAge
                                         [[:timestamp :datetime :default :current_timestamp]
                                          [:name :text]
                                          [:age :text]]))
       (catch Exception e
         (println (.getMessage e)))))

(defn print-result-set
  "Prints the result set in tabular form"
  [result-set]
  (doseq [row result-set]
    (println row)))

(defn output
  "Execute query and return lazy sequence"
  []
  (query db ["select * from nameAndAge"]))

(defn launch
  "launch!"
  []
  (create-db)
  (insert! db :nameAndAge testdata)
  (print-result-set (output)))

(defn -main
  "launch!"
  []
  (if (.exists (io/as-file "sample.db"))
    (println "sample.db is already initialized")
    (launch)))