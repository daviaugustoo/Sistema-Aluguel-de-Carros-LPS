import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import Nav from 'react-bootstrap/Nav';
import { Row, Col, Button, ButtonGroup, ToggleButton, Navbar } from 'react-bootstrap';
import bambobi from './imagens/bumbobi.jpg'
import ListaCarros from './pages/ListaCarros';
import ListaClientes from './pages/ListaClientes';
import Home from './pages/Home';
import EditarCarro from './pages/EditarCarro';
import { BrowserRouter, Routes, Route, useNavigate } from "react-router-dom";
import NavBar from './components/NavBar';
import NovoCarro from './pages/NovoCarro';
import NovoCliente from './pages/NovoCliente';

function App() {

  const [componente, setComponente] = useState<String>("")
  const navegar = useNavigate()


  return (
    <>
      <Routes>
        <Route
          path="/"
          element={<Home />}
        />
        <Route path="/EditarCarro" element={<EditarCarro />} />
        <Route path="/ListaCarros" element={<ListaCarros />} />
        <Route path='/ListaClientes' element={<ListaClientes />} />
        <Route path='/NovoCarro' element={<NovoCarro />} />
        <Route path='/NovoCliente' element={<NovoCliente />} />
      </Routes>
    </>
  );
}

export default App;
