(defproject migratus-container "0.1.0-SNAPSHOT"

  :description "Apply migrations with migratus docker container"

  :url "https://github.com/macielti/migratus-container"

  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}

  :dependencies [[org.clojure/clojure "1.12.0"]
                 [com.taoensso/timbre "6.6.1"]
                 [migratus "1.6.3"]]

  :repl-options {:init-ns migratus-container.core})
