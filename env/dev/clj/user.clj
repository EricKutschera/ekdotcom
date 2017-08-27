(ns user
  (:require [mount.core :as mount]
            ekdotcom.core))

(defn start []
  (mount/start-without #'ekdotcom.core/repl-server))

(defn stop []
  (mount/stop-except #'ekdotcom.core/repl-server))

(defn restart []
  (stop)
  (start))
