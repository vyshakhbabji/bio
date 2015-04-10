(defn sdsu-reverse [coll]
  (loop [coll coll reverse-list '()]
    (if (empty? coll) reverse-list
     (recur (rest coll ) (cons(first coll) reverse-list)))))


(sdsu-reverse [1 2 3])

(sdsu-reverse '("one" "two" "three"))
