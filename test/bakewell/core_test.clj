(ns bakewell.core-test
  (:use clojure.test
        bakewell.core))

(deftest test-wrap-payload
  (is (= (wrap-payload [20 26 0])
         [213 3 20 26 0 223])))
