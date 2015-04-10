(defn r-sdsu-nth [coll n]
    (if (= n 0) (first coll) (check (rest coll) (- n 1) )
  ))


(= (r-sdsu-nth '(1 2 3 4 5) 2) 3)

(= (r-sdsu-nth '("two" "three" "four") 2)  "four")
