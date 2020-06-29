(ns ^:figwheel-hooks zip-viewer.core
  (:require
   [firemore.core :as firemore]
   [goog.dom :as goog.dom]
   [reagent.dom :as reagent.dom]
   [re-frame.core :as re-frame]
   [zip-viewer.breakpoints :as breakpoints]
   [zip-viewer.events :as events]
   [zip-viewer.subs :as subs]
   [zip-viewer.views.root :as root]))

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
