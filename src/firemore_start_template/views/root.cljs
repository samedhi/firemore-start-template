(ns firemore-start-template.views.root
  (:require
   [re-frame.core :as re-frame]
   [firemore-start-template.mui :as mui]
   [firemore-start-template.views.util :as views.util]
   [firemore-start-template.util :as util]))

(defn title []
  (let [greeting @(re-frame/subscribe [:greeting])]
    [mui/typography
     {:variant :h2
      :align :center}
     greeting]))

(defn component []
  [mui/container
   {:max-width "xl"}
   [title]
   [views.util/app-db-viewer]
   [views.util/footer]])
