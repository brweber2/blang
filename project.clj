(defproject blang "1.0.0-SNAPSHOT"
  :description "blang, a simple lisp implementation"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [javassist/javassist "3.8.0.GA"]
                 [junit/junit "4.8.1"]]
  :dev-dependencies [[lein-javac "1.2.1-SNAPSHOT"]
                     [lein-junit "0.0.3-SNAPSHOT"]
                     [junit/junit "4.8.1"]]
  :source-path "src"
  :java-source-path [["src"] ["test" :debug true]]
  :junit [["classes"]]
  :java-options {:debug "true"}
  :jvm-opts ["-XX:MaxPermSize=128m"])
