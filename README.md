# Yeet

Yeet stuff around. Maybe yoink it if you want.

# Try it

```
clj -Sdeps '{:deps {vlaaad/yeet {:git/url "https://github.com/vlaaad/yeet" :sha "TODO"}}}'
```

# Usage

```clj
(require '[yeet.core :as y]) ;; y stands for why would you use it

;; yeet stuff around

(y/yeet :dab)
; => Execution error (ExceptionInfo)

;; yoink what you yeet
(y/yoink
  (y/yeet :dab-on/haters))
; => :dab-on/haters
```

# License

Yeet is yeeted straight into public domain with unlicense