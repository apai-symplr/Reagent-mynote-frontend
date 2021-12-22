(ns com.symplr.app
(:require [reagent.dom :as rdom])

  )

(defn main-component []
      [:div.container
       [:nav {:class ["navbar" "navbar-light" "bg-light"]}
        [:div.container-fluid
         [:a.navbar-brand
         [:svg {:class ["bi" "bi-chat-right-text"] :xmlns "http://www.w3.org/2000/svg" :width 16 :height 16 :fill "currentColor"} :viewBox "0 0 16 16"
          [:path {:d "M2 1a1 1 0 0 0-1 1v8a1 1 0 0 0 1 1h9.586a2 2 0 0 1 1.414.586l2 2V2a1 1 0 0 0-1-1H2zm12-1a2 2 0 0 1 2 2v12.793a.5.5 0 0 1-.854.353l-2.853-2.853a1 1 0 0 0-.707-.293H2a2 2 0 0 1-2-2V2a2 2 0 0 1 2-2h12z"}]
          [:path {:d "M3 3.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zM3 6a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9A.5.5 0 0 1 3 6zm0 2.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5z"}]
          ]
          "Note Maker"
          ]
         [:ul {:class ["nav" "justify-content-end"]}
          [:li [:button {:type "button" :class ["btn" "btn-outline-dark"]}
                "Add"
                [:svg {:class ["bi" "bi-plus-circle"] :xmlns "http://www.w3.org/2000/svg" :width 16 :height 16 :fill "currentColor"} :viewBox "0 0 16 16"
                 [:path {:d "M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"}]
                 [:path {:d "M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"}]
                 ]
                ]]]
         ]]])

(defn render-main
 []
 (rdom/render [main-component] (.getElementById js/document "root"))
      )
;Learn about below function https://shadow-cljs.github.io/docs/UsersGuide.html#_lifecycle_hooks

(defn ^:dev/after-load start []
      (render-main))

