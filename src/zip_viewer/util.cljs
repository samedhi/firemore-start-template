(ns zip-viewer.util
  (:require
   [cljs.pprint :as pprint]))

(defn pprint [o]
  (with-out-str (pprint/pprint o)))

(defn evt->value [evt]
  (.-value (.-target evt)))
