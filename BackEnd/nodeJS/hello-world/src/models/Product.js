const mongoose = require('mongoose');

const ProductSchema = new mongoose.Schema({
    title:{
        type: String,
        required: true
    },
    description:{
        type: String,
        required: true
    },
    url:{
        type: String,
        required: true
    },
    createdAt:{
        date: Date,
        // default: Date.
    }
});

mongoose.model('Product',ProductSchema);
