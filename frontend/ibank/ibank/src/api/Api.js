import axios from "axios"

//api rest
export const api = axios.create({
    baseURL: "http://localhost:8080/"
})