(require '[cljs.closure :as cljsc])

(println "Building ...")

(let [start (System/nanoTime)]
  (cljsc/build "src"
    {:output-to "release/daylight_enfocus.js"
     :output-dir "release"
     :optimizations :advanced
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
