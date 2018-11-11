(ns sample
  (:require
   [clojure.string :as string]
   [goog.html.SafeHtml :as goto.html.SafeHtml]
   [goog.events :as goog.events]
   [goog.object :as goog.object]
   [goog.net.XhrIo :as xhr]
   [goog.json :as gjson]
   [goog.dom :as goog.dom]))

(println "hello world")

(defn ^:export setup []
  (println "Setup called"))

(js/alert "hello")