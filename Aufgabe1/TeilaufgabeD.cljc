(ns Aufgabe1.TeilaufgabeD)
(require '[Aufgabe1.TeilaufgabeB :as b])

(
  ; returned true, wenn es sich um ein Literal handelt, was eine Ziffer ist
  defn digit? [x]
       "is it a digit"
       (b/between? x \0 \9)
)