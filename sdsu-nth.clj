(defn sdsu-nth [coll n]
  (last (take (inc n) coll)))

(= (sdsu-nth '(6 5 4 3) 2) 4)
(= (sdsu-nth [:a :b :c] 1) :b)
(= (sdsu-nth '([1 2] [3 4] [5 6]) 2) [5 6])



(def sdsu-nth2 (fn [coll nthEle]
                ((apply comp (cons first  (repeat nthEle rest))) coll )))


(= (sdsu-nth2 '(6 5 4 3) 2) 4)
(= (sdsu-nth2 [:a :b :c] 1) :b)
(= (sdsu-nth2 '([1 2] [3 4] [5 6]) 2) [5 6])
