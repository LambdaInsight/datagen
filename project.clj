(defproject datagen "0.1.0"
  :description "Generate sample data"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure  "1.8.0"]
    [org.clojure/data.csv "0.1.4"]
    [org.clojure/tools.trace "0.7.9"]

  ]
  :repl-options {
    :init-ns datagen.core
  }
)
