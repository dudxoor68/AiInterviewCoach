import React from "react";
import { Link } from "react-router-dom";

function TestPage2(props) {
  return (
    <div>
      <p>test2</p>
      <p>test2</p>
      <p>test2</p>
      <Link to={`/`}>go to test1</Link>
    </div>
  );
}

export default TestPage2;
