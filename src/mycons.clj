(defn mycons
      [a b]
      (fn [pick]
          (if (= pick 1)
              a
              b)))

(defn mycdr
      [mycons]
      (mycons 1))

(defn mycar
      [mycons]
      (mycons 2))

