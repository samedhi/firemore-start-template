(ns ^:figwheel-hooks zip-viewer.core
  (:require
   [goog.dom :as goog.dom]
   [reagent.core :as reagent]
   [reagent.dom :as reagent.dom]
   [zip-viewer.mui :as mui]))

(defn main-panel []
  (fn []
    [mui/container
     "Welcome to the zip-viewer app!"]))

(defn mount-root []
  (when-let [el (goog.dom/getElement "app")]
    (println :load-this-bad-boy!)
    (reagent.dom/render [main-panel] el)))

(defn ^:dev/after-load init []
  (mount-root))

(init)
