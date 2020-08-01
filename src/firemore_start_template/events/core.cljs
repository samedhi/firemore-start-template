(ns firemore-start-template.events.core
  (:require
   [re-frame.core :as re-frame]
   [firemore-start-template.config :as config]))

(re-frame/reg-event-db
 :initialize-db
 (fn [_ _]
   config/default-db))
