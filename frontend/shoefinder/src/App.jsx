import Home from './pages/Home'
import Login from './pages/Login'
import Profile from './pages/Profile'
import { useState, useEffect } from 'react'
import { BrowserRouter, Routes, Route } from "react-router-dom"

function App() {
  const [username, setUsername] = useState("")
  const [favorites, setFavorites] = useState([])
  const [shoes, setShoes] = useState([])

  async function loadShoes(){
    const response = await fetch("http://localhost:8080/shoes")
    const data = await response.json()
    setShoes(data)
  }

  useEffect(() => {
    loadShoes()
  }, [])

  return (
    <BrowserRouter> 

      <Routes>
          <Route path="/" element={<Home username={username} favorites={favorites} setFavorites={setFavorites}/>} />
          <Route path="/login" element={<Login username={username} setUsername={setUsername} favorites={favorites}/>} />
          <Route path="/profile" element={<Profile username={username} favorites={favorites}/>} />
      </Routes>
    
    </BrowserRouter>

  )
}

export default App