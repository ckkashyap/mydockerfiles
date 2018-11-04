(require 'cljs.build.api)

(cljs.build.api/watch "src"
                      {:main 'sample
                       ;:optimizations :advanced
                       :output-to "out/main.js"})
