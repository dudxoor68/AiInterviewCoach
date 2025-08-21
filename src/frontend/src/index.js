import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import axios from "axios";

const root = ReactDOM.createRoot(document.getElementById("root"));
axios.defaults.baseURL = "http://localhost:8080/";
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

reportWebVitals();
