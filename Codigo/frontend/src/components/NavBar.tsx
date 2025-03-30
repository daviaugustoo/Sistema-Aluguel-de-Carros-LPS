import { Button, Col, Row } from "react-bootstrap";
import { useNavigate } from "react-router-dom";
import carro from '../imagens/300px-Chick_Hicks.jpeg'

export default function NavBar() {

    const navegar = useNavigate()

    return (
        <>

            <Col lg="3" style={{ backgroundColor: "gray" }} >
                < img src={carro} style={{ maxHeight: "150px" }} className='mb-2'></img>
                <Row >
                    <Button variant="unknow"
                        onClick={() => {
                            navegar({
                                pathname: "/ListaCarros",
                            })
                        }}> ListaCarro</Button>
                    <Button variant="unknow"
                        onClick={() => {
                            navegar({
                                pathname: "/ListaClientes",
                            })
                        }}> Lista de Clientes</Button>

                </Row>
            </Col>
        </>
    )
}