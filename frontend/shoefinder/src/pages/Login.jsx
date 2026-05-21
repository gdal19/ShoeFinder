import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import './Login.css'
import Header from "../components/Header"

function Login({ username, setUsername, favorites }){

    //const [email, setEmail] = useState("")
    const [password, setPassword] = useState("")

    const navigate = useNavigate()

    function handleUser(event){
        setUsername(event.target.value)
    }

    function handlePassword(event){
        setPassword(event.target.value)
    }

    function handleLogin(event){
        event.preventDefault()
        if (username === "" || password === "") {
            alert("Please fill in all fields")
        }
        console.log(username)
        console.log(password)

        navigate("/profile")
    }

    return (
        <div>
            <Header name="Shoe Finder" username={username} favoritesCount={favorites.length}/>
            <div className='login-container'>
                <form className='login-form' onSubmit={handleLogin}>
                    <p>User Name</p>
                    <input className='login-input' type='text' value={username} onChange={handleUser} />
                    <p>Password</p>
                    <input className='login-input' type='password' value={password} onChange={handlePassword} />
                    <button className='login-button'>
                        Forgot Password
                    </button>
                    <button className='login-button' type='submit'>
                        Login
                    </button>
                </form>
            </div>
        </div>

    )
}

export default Login