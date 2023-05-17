(ns Aufgabe1.TeilaufgabeE)
(require '[Aufgabe1.TeilaufgabeC :as c])

(
  ; returns true if the string x only contains letters as tested by the letter? function
  defn letters? [x]
       "does it only contain letters"
       (every? true? (map c/letter? x))
)