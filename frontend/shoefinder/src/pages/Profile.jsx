import './Profile.css'

function Profile({ username }){

    return (
        <div>
            <h1>{username}</h1>
            <p>Favorites</p>
            <p>name@email.com</p>
        </div>
    )
}

export default Profile