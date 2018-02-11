(ns datagen.core)

(defn gen-int
  "Generates a list of integers (elements are between min and max) with size count
  TBD: cardinality"
  [min max count _cardinality]
  (let
    [rng (range min max)]
      (take count (repeatedly #(rand-nth rng)))))

(defn gen-strings
  "Generates a list of strings"
  [value-set count]
  (take count (repeatedly #(rand-nth value-set))))

(defn gen-csv
  [cnt & columns]
  (take cnt (repeatedly #(map rand-nth columns))))

(defn test-gen-csv
  []
  (doseq [g (gen-csv 10 (gen-strings
                          (list "A" "B") 100)
                          (gen-int 20160101 20180301 525 1)
                          (gen-strings (list "A" "B") 10)
                          (gen-strings (list "A" "B") 100))] (println g)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
