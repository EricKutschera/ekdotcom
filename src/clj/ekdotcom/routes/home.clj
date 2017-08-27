(ns ekdotcom.routes.home
  (:require [ekdotcom.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.response :refer [redirect]]))

;; TODO setup a landing page
;; (defn home-page []
;;   (layout/render "home.html"))

;; (defroutes home-routes
;;   (GET "/" [] (home-page)))

;; Rerouting the root to resources/public/cis_192_spring_2015
(defroutes home-routes
  (GET "/" []
       (redirect "/cis_192_spring_2015/index.html")))
