(ns word-wrap.core)

(defn to-string [lazycoll] (apply str lazycoll))

(defn wrap
  "Implements Word Wrap kata"
  [sentence size]
  (clojure.string/join "\n"
                       (map to-string
                            (partition size size "" sentence)
                            )
                       )
  )
