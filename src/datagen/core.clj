(ns datagen.core)

(defn take-n-rand
  "Takes n random element from a collection"
  [n coll]
  (take n (shuffle coll)))

(defn gen-int
  "Generates a list of integers (elements are between min and max) with size count
  TBD: cardinality"
  [n_min n_max cardinality n_count]
  (println (str n_min n_max cardinality n_count))
  (let
    [ rng       (range n_min n_max)
      cnt       (count rng)
      samples   (if (> cnt cardinality)
                  (take-n-rand cardinality rng)
                  rng)
     ]
      (take n_count (repeatedly #(rand-nth samples)))))

(defn gen-strings
  "Generates a list of strings"
  [value-set count]
  (take count (repeatedly #(rand-nth value-set))))

(defn gen-csv
  [cnt & columns]
  (take cnt (repeatedly #(map rand-nth columns))))

(defn test-gen-csv
  []
  (doseq [g (gen-csv 100  (gen-strings (list "A" "B") 100)
                          (gen-int 20160101 20180301 525 1000)
                          (gen-strings (list "A" "B") 100)
                          (gen-strings (list "A" "B") 100))]
    (println g)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
