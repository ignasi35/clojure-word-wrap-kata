(ns word-wrap.core-test
  (:require [clojure.test :refer :all]
            [word-wrap.core :refer :all]))

(deftest a-test

  (testing "Word wrapping when input is shorter than line maxlength is identity"
    (is (=
          "hello"
          (wrap "hello" 100)
          ))
    )
  )

(deftest b-test
  (testing "Word wrapping considers white space"
    (is (=
          "hello\nworld"
          (wrap "hello world" 5)
          ))
    )

  )
