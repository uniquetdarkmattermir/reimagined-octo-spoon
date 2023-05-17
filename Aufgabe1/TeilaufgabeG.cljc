(ns Aufgabe1.TeilaufgabeG)

(require '[Aufgabe1.TeilaufgabeC :as c])
(require '[Aufgabe1.TeilaufgabeD :as d])

(
  defn iban? [x]
       "ist es eine iban"
       (and (= (count x) 22)
            (re-matches #"[A-Z]{2}\d{20}" x))
)