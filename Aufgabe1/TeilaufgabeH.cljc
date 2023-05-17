(ns Aufgabe1.TeilaufgabeH)

(defn by-9? [x]
      "ist durch 9 teilbar"
      (= (mod (read-string x) 9) 0)
)