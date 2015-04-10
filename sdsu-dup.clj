(defn sdsu-dup [coll] (reduce
        #(concat %1 (repeat 2 %2))
        '() coll))

(= (sdsu-dup [1 2 3]) '(1 1 2 2 3 3))
(= (sdsu-dup [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
(= (sdsu-dup [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))


