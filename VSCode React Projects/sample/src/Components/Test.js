import React from 'react'

const Test=(props)=>{
    console.log(props)
  return (
   <h1>Hello {props.name},Written using {props.language}</h1>
  )
}
export default Test
