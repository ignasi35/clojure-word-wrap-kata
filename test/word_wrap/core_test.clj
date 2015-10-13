(ns word-wrap.core-test
  (:require [clojure.test :refer :all]
            [word-wrap.core :refer :all]))

(deftest a-test

  (testing "Word wrapping wrapper wrap"
    (is (=
          "hello"
          (wrap "hello" 100)
           ))
    )

  (testing "Word wrapping wrapper wrap"
    (is (=
          "hell\no wo\nrld"
          (wrap "hello world" 4)
           ))
    )
)
