(ns firemore-start-template.core-test
  (:require
   [cljs.test :as t :include-macros true]
   [firemore-start-template.core :as sut]))

(t/deftest test-example
  (t/is (= 1 (int "1")))
  (t/are [x y] (= x y)
    2 (+ 1 1)
    4 (* 2 2)))

