import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import Nav from 'react-bootstrap/Nav';
import { Row, Col, Button, ButtonGroup, ToggleButton } from 'react-bootstrap';
import carro from './imagens/300px-Chick_Hicks.jpeg'
import bambobi from './imagens/bumbobi.jpg'
import ListaCarros from './components/ListaCarros';
import ListaClientes from './components/ListaClientes';

function App() {

  const [componente, setComponente] = useState<String>("")

  const opcoes = [
    "Lista de Carros",
    "Clientes"
  ]

  function mostraComponente() {
    if (componente == "Lista de Carros") {
      return (<ListaCarros />)
    } else if (componente == "Clientes") {
      return (<ListaClientes />)
    }
  }


  return (
    <Row>
      <Col lg="3" style={{ backgroundColor: "gray" }} >
        <Row >
          < img src={carro} style={{ maxHeight: "150px" }} className='mb-2'></img>
          {opcoes.map((opcao, idx) => (
            <Button
              variant={"unknow"}
              onClick={(e) => setComponente(opcao)}
            >
              {opcao}
            </Button>
          ))}
        </Row>
      </Col>
      <Col style={{ backgroundImage: bambobi }}>
        {mostraComponente()}
      </Col>
    </Row>
  );
}

export default App;
