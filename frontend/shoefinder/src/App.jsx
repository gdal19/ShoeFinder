import Home from './pages/Home'
import Login from './pages/Login'
import Profile from './pages/Profile'
import { useState } from 'react'
import { BrowserRouter, Routes, Route } from "react-router-dom"

function App() {
  const [username, setUsername] = useState("")
  const [favorites, setFavorites] = useState([])


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