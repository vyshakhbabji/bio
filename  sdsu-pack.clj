(defn sdsu-pack  [coll]
  (reverse (reduce
   #(if (=  %1 %2)
      (cons (cons %2 (first %1)) (rest %1))
      (cons (list %2) %1 ))
            '()  coll)))



(= (pack [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
(= (pack [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
