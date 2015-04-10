(defn sdsu-no-dup [coll]
  (reduce #(if (= (last %1) %2) %1 (concat %1 (list %2))) '() coll))



(= (sdsu-no-dup [1 1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
(= (sdsu-no-dup [[1 2] [1 2] [3 4] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))


