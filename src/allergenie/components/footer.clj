(ns allergenie.components.footer)
(defn footer
  []
  [:footer {:class "footer"}
   [:div {:class "content has-text-centered"}
    [:p [:strong "AllerGenie"] " by " [:a {:href "https://ostash.dev" :target "_blank"} "© Roman Ostash 2020"]]
    [:p "Information is provided by " 
     [:a {:href "https://www.pollen.com/" :target "_blank" :rel "noopener noreferrer"} "IQVIA, "]
     [:a {:href "https://openweathermap.org/" :target "_blank" :rel "noopener noreferrer"} "OpenWeather, "]
     [:a {:href "https://www.airnow.gov/" :target "_blank" :rel "noopener noreferrer"} "AirNow"]]
    [:p "Weather icons by " [:a {:href "https://www.amcharts.com/free-animated-svg-weather-icons/" :target "_blank" :rel "noopener noreferrer"} "amCharts"]]]])