import { useState } from "react"
import ShoeCard from "../components/ShoeCard"
import "./Home.css"
import jordan1 from "../assets/images/jordan1.jpg.webp"
import jordan3 from "../assets/images/jordan3.webp"
import curry6 from "../assets/images/curry6.jpg.avif"

function Home(){
    let appName = "Shoe Finder"
    let message = "Welcome"
    const [search, setSearch] = useState("")
    const [favorites, setFavorites] = useState([])

    const shoes = [
        {id: 1, name: "Jordan 1", price: 1300, image: jordan1},
        {id: 2, name : "Curry 6", price: 1100, image: curry6},
        {id: 3, name : "Jordan 3", price: 1200, image: jordan3}
    ]

    const filteredShoes = shoes.filter((shoe) => {
        return shoe.name.includes(search)}
    )

    function newSearch(event){
        // console.log(event)
        // console.log(event.target)
        // console.log(event.target.value)
        setSearch(event.target.value)
    }

    function editFavorites(id){
        if (favorites.includes(id)) {
            setFavorites(favorites.filter((favoriteId) => {
                            return favoriteId !== id
                        }))
        } else {
            setFavorites([...favorites, id])
        }
    }



    return(
        <div className="home-container">
            <h1>{appName}</h1>
            <p>{message}</p>
            <input className="search-bar" type ="text" placeholder="Search..." value={search} onChange={newSearch}/>
            <p>{search}</p>
            <div className="shoe-list">
                {
                    filteredShoes.map((shoe) => { 
                        const isFavorite = favorites.includes(shoe.id)

                        return (
                            <ShoeCard 
                                key = {shoe.id}
                                id = {shoe.id}
                                name = {shoe.name}
                                price= {shoe.price}
                                image= {shoe.image}
                                isFavorite= {isFavorite}
                                editFavorites= {editFavorites}
                            />
                        )
                    })
                }
            </div>
        </div>
    )
}

export default Home