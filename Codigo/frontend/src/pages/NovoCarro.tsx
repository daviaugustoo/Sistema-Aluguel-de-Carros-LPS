import { Button, Col, Form, Row } from "react-bootstrap";
import NavBar from "../components/NavBar";
import { useState, useEffect } from "react";

export default function NovoCarro() {

    const [user, setUser] = useState({
        id: 2,
        nome: "Gay",
        cpf: '123123123-12',
        rg: "12312323",
        endereço: "aaaaaaaaa,aaaaaaaaaaaaa,aaaaaaaaaa,33",
        profissao: "Gay2",
        entidadeEmpregadora: "Gol Viagens",
        rendimento: 12344

    });

    const [carro, setCarro] = useState({
        id: 1,
        matricula: "",
        ano: "",
        marca: "",
        modelo: "",
        placa: "",
        cliente: user
    });

    const handleChange = (e: any) => {
        const { name, value } = e.target;
        setCarro({ ...carro, [name]: value });
    };

    const handleSubmit = (e: any) => {
        e.preventDefault();
        console.log("Dados do carro:", carro);
    };

    return (
        <>
            <Row>
                <NavBar />
                <Col>
                    <Form onSubmit={handleSubmit}>
                        <Form.Group controlId="formMatricula">
                            <Form.Label>Matrícula</Form.Label>
                            <Form.Control type="text" name="matricula" value={carro.matricula} onChange={handleChange} required />
                        </Form.Group>

                        <Form.Group controlId="formAno">
                            <Form.Label>Ano</Form.Label>
                            <Form.Control type="number" name="ano" value={carro.ano} onChange={handleChange} required />
                        </Form.Group>

                        <Form.Group controlId="formMarca">
                            <Form.Label>Marca</Form.Label>
                            <Form.Control type="text" name="marca" value={carro.marca} onChange={handleChange} required />
                        </Form.Group>

                        <Form.Group controlId="formModelo">
                            <Form.Label>Modelo</Form.Label>
                            <Form.Control type="text" name="modelo" value={carro.modelo} onChange={handleChange} required />
                        </Form.Group>

                        <Form.Group controlId="formPlaca">
                            <Form.Label>Placa</Form.Label>
                            <Form.Control type="text" name="placa" value={carro.placa} onChange={handleChange} required />
                        </Form.Group>

                        <Button variant="primary" type="submit" className="mt-3">Enviar</Button>
                    </Form>
                </Col>

            </Row>
        </>
    )
}