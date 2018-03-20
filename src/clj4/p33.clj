(ns p33)

((fn [s n]
   (mapcat #(repeat n %) s))
 [1 2 3] 2)

(repeat 2 '(1 2 3 4))