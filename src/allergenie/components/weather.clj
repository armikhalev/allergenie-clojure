(ns allergenie.components.weather)

(defn weather
  [state]
  [:div {:class "column card m-4"}
   [:h3 {:class "title is-3 has-text-centered"} "Weather"]
   [:p {:class "is-small has-text-justified m-2"} "Weather conditions can affect how you experience your allergy symptoms. For example, dry, windy weather means that pollen levels go up, which might influence how you feel that day."]
   [:div {:class "m-5"}
    [:p
     [:img {:src (str "/img/icons/" (:icon state) ".svg") :style "height: 10rem"}]]
    [:p {:class "m-2"} (str (:description state))]
    [:p {:class "m-2"} (str "Temperature: " (:temperature state) "°F")]
    [:p {:class "m-2"} (str "Humidity: ") (:humidity state) "%"]
    [:p {:class "m-2"} (str "Wind speed: ") (:wind-speed state) "Mph"]
    [:p {:class "m-2"} (str "Wind direction: ") (:wind-dir state)]]])