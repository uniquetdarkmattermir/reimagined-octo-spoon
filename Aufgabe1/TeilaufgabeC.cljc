(ns Aufgabe1.TeilaufgabeC)
(require '[Aufgabe1.TeilaufgabeB :as b])

(
  defn letter? [x]
       "is it a letter"
       (b/between? x \A \z)
)