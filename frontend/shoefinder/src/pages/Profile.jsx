import './Profile.css'
import Header from "../components/Header"

function Profile({ username, favorites }){

    return (
        <div>
            <Header name="Shoe Finder" username={username} favoritesCount={favorites.length}/>
            <h1>{username}</h1>
            <p>Favorites</p>
            <p>name@email.com</p>
        </div>
    )
}

export default Profile