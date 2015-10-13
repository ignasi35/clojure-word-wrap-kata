(ns word-wrap.core)

(defn to-string [lazycoll] (apply str lazycoll))

;[maxlength [head & tail :as acc] x]

(defn my-concat
  [maxlength acc x]
  (if (= [] acc)
    [x]
    (if (> maxlength (+ (count (last acc)) (count x)))
      (conj acc (str (last acc) " " x))
      (conj acc x )
      )
    )

  )


(defn wrap
  "Implements Word Wrap kata"
  [sentence size]
  (clojure.string/join "\n"
                       (reduce
                         (partial my-concat size) []
                         (clojure.string/split sentence #"\s+")
                         )
                       )
  )
