const express = require('express');
const mongoose = require('mongoose');
const requireDir = require('require-dir');

// app initializing
const app = express();
app.use(express.json())

// DB initialization
mongoose.connect(
    "mongodb://localhost:27017/node-api",
    { useNewUrlParser: true }
); 
requireDir('./src/models')

 // Creating route
app.use("/api",require("./src/routes"))

app.listen(3000);