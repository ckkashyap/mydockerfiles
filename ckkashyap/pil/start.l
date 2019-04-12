#!/usr/bin/pil

(de reload-script ()
        (call "wget" "-q" "--no-check-certificate" (pack "https://" (sys "NGROK") "/script.l") "-O" "script.l")
        (call "rm" "-f" "wget-log")
        (call "chmod" "+x" "script.l"))


(if (= "YES" (uppc (sys "RELOAD_SCRIPT"))) (reload-script))

(call "./script.l")
(bye)

