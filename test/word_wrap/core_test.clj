(ns word-wrap.core-test
  (:require [clojure.test :refer :all]
            [word-wrap.core :refer :all]))

(deftest a-test

  (testing "Word wrapping  when input is shorter than line maxlength is identity"
    (is (=
          "hello"
          (wrap "hello" 100)
           ))
    )

  (testing "Word wrapping naive ignores white space"
    (is (=
          "hell\no wo\nrld"
          (wrap "hello world" 4)
           ))
    )

  )
