import React, { useContext, useState } from "react";
import { Status } from "./FormProvider";

function DisplayComponent() {

const { formdata } = useContext(Status);

return <div>
<h1>{formdata.name}</h1>
<h1>{formdata.age}</h1>  
</div>;
}
export default DisplayComponent;
