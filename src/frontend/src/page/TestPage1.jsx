import React from "react";
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import axios from "axios";

function TestPage1(props) {
  const [test, setTest] = useState([]);

  const showTest = () => {
    axios
      .get("http://localhost:8080/api/test")
      .then((response) => {
        setTest(response.data);
      })
      .catch((error) => {
        console.log("Error while fetching books:", error);
      });
  };

  useEffect(() => {
    showTest();
  }, []);

  return (
    <div>
      <h1>test1</h1>
      <p>test1</p>
      <p>test1</p>
      <p>testing = {test}</p>
      <Link to={`/test2`}>go to test2</Link>
    </div>
  );
}

export default TestPage1;
