(ns firemore-start-template.subs
  (:require
   [re-frame.core :as re-frame]
   [firemore-start-template.util :as util]))

(re-frame/reg-sub
 :greeting
 (fn [db]
   (:greeting db)))

(re-frame/reg-sub
 :pretty-print-db
 (fn [db]
   (util/pprint db)))
