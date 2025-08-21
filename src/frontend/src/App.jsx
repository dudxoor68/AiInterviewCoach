import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import TestPage1 from "./page/TestPage1";
import TestPage2 from "./page/TestPage2";

function App(props) {
  return (
    <BrowserRouter>
      <Routes>
        <Route exact path="/" element={<TestPage1 />} />
        <Route path="/test2" element={<TestPage2 />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
