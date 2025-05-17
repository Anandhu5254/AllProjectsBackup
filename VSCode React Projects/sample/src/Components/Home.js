import React from 'react'
import room from '../images/Room.webp';

function Home({b}) {
  return (
    <div>
      <img src={room} alt='error'></img>
      <h4>{b}</h4>
    </div>
  )
}

export default Home
