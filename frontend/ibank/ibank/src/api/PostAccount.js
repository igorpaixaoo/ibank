import { api } from "./Api"

//função para criar post com parâmetro um objeto "user"
const PostAccount = (user) =>{
    return api.post("/create", user)
}

export default PostAccount