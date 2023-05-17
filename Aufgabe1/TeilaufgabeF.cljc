(ns Aufgabe1.TeilaufgabeF)
(require '[Aufgabe1.TeilaufgabeD :as d])
(
  ; returns true if the string x only contains digits as tested by the digit? function
  defn digits? [x]
       "does it only contain digits"
       (every? true? (map d/digit? x))
)