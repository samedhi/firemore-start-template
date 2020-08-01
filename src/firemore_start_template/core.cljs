(ns ^:figwheel-hooks firemore-start-template.core
  (:require
   [firemore.core :as firemore]
   [goog.dom :as goog.dom]
   [reagent.dom :as reagent.dom]
   [re-frame.core :as re-frame]
   [firemore-start-template.breakpoints :as breakpoints]
   [firemore-start-template.events.core :as events]
   [firemore-start-template.subs.core :as subs]
   [firemore-start-template.views.root :as root]))

(enable-console-print!)

(defn mount-root []
  (when-let [el (goog.dom/getElement "app")]
    (reagent.dom/render root/component el)))

(defn ^:after-load init []
  (re-frame/clear-subscription-cache!)
  (breakpoints/init)
  (mount-root)
  :success)

(defonce run-at-app-startup
  (do
    (re-frame/dispatch-sync [:initialize-db])
    (init)))
