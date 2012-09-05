(ns bakewell.core
  (:use  [biscuit.core :as crc]))

(def start-byte 0xd5)

(defn wrap-payload
  "Turn the payload into a message"
  [payload]
  (conj (into [start-byte (count payload)] payload)
        (crc/checksum payload)))
