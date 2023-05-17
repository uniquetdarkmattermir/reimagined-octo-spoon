(ns Aufgabe1.TeilaufgabeB)
(require '[Aufgabe1.TeilaufgabeA :as a])

(
  defn between? [a b c]
       "is a between b an c"
       ; wenn b <= a und a <= c, dann true
       (= (a/at-most? b a) (a/at-most? a c))
)