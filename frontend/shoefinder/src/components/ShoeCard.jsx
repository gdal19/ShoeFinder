import "./ShoeCard.css"

function ShoeCard({id, name, price, image, isFavorite, editFavorites}) {

    return (
        <div className="shoe-card"> 
            <img className="shoe-image" src={image} alt={name}/>
            <h2>{name}</h2>
            <p>R$ {price}</p>
            <button onClick={() => editFavorites(id)}>
                {isFavorite ? "★" : "☆"}
            </button>
        </div>
    )
}

export default ShoeCard
