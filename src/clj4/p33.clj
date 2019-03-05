(ns p33)

((fn [s n]
   (mapcat #(repeat n %) s))
 [1 2 3] 2)

(def f (comp mapcat partial repeat))
(f 2 [1 2 3 4])

#(mapcat (partial repeat 2) %)