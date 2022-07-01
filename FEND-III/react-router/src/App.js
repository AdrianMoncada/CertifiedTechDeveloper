import { useState } from "react";


import { BrowserRouter, Routes, Route} from "react-router-dom";
import Home from "./pages/home/Home"
import About from "./pages/about/About"
import Contact from "./pages/contact/Contact"
import ProtectedRoutes from "./components/protectedRoutes/ProtectedRoutes"
import Error from "./components/Error";
import Register from "./pages/register/Register";

function App() {
  const [isLogged, setIsLogged] = useState(false);
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/register" element={<Register setIsLogged={setIsLogged}/>} />
        <Route element={<ProtectedRoutes isLogged={isLogged}/>}>
          <Route path="/home" element={<Home/>}/>
          <Route path="/about" element={<About/>}/>
          <Route path="/contact" element={<Contact/>}/>
          <Route path="*" element={<Error/>}/>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
