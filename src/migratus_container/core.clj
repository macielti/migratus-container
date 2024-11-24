(ns migratus-container.core
  (:require [clojure.edn :as edn]
            [migratus.core :as migratus])
  (:gen-class))

(defn fetch-config
  []
  (edn/read-string (slurp "resources/migratus.config.edn")))

(defn apply-migrations
  []
  (-> (fetch-config)
      migratus/migrate))

(defn -main []
  (apply-migrations))
