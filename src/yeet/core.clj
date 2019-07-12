(ns yeet.core)

(defn yeet [x]
  (throw (ex-info "" {::value x})))

(defmacro yoink [& body]
  `(try
     ~@body
     (catch Throwable e#
       (let [ex-data# (ex-data e#)]
         (if (contains? ex-data# ::value)
           (::value ex-data#)
           e#)))))
