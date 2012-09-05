(ns bakewell.core
  (:use  [biscuit.core :as crc]))

(defn wrap-payload
  "Turn the payload into a message"
  [payload]
  (reduce into [[0xd5 (count payload)]
                payload
                [(crc/checksum payload)]]))
