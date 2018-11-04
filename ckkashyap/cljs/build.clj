(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'sample
                       ;:optimizations :advanced
                       :output-to "out/main.js"})
