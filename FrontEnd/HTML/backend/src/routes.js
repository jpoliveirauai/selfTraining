const express =  require('express')
const postController = require('./controllers/PostController')
const likeController = require('./controllers/LikeController')
const uploadConfig = require('./config/upload')
const multer  = require('multer')

const routes = express.Router()
const upload = multer(uploadConfig)


 routes.get('/posts',upload.single('image'), postController.index)
 routes.post('/posts',upload.single('image'), postController.store)

 routes.post('/posts/:id/like',upload.single('image'), likeController.store)


module.exports = routes