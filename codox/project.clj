(defproject kyber-codox "0.10.3"
  :description "Generate analytics documentation from Clojurescript source files"
  :url "https://github.com/chrisc93/codox"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [org.clojure/clojurescript "1.7.189"]
                 [hiccup "1.0.5"]
                 [enlive "1.1.6"]
                 [org.pegdown/pegdown "1.6.0"]
                 [org.ow2.asm/asm-all "5.0.3"]])
