import { useState } from "react";
import { Button, Col, Form, Row } from "react-bootstrap";
import NavBar from "../components/NavBar";


export default function NovoCliente() {

    const [cliente, setCliente] = useState({
        id: 4,
        nome: "",
        cpf: "",
        rg: "",
        endereco: "",
        profissao: "",
        entidadeEmpregadora: "",
        rendimento: ""
    });

    const handleChange = (e: any) => {
        const { name, value } = e.target;
        setCliente({ ...cliente, [name]: value });
    };

    const handleSubmit = (e: any) => {
        e.preventDefault();
        console.log("Dados do cliente:", cliente);
    };

    return (
        <Row>
            <NavBar />
            <Col>
                <Form onSubmit={handleSubmit}>

                    <Form.Group controlId="formNome">
                        <Form.Label>Nome</Form.Label>
                        <Form.Control type="text" name="nome" value={cliente.nome} onChange={handleChange} required />
                    </Form.Group>

                    <Form.Group controlId="formCpf">
                        <Form.Label>CPF</Form.Label>
                        <Form.Control type="text" name="cpf" value={cliente.cpf} onChange={handleChange} required />
                    </Form.Group>

                    <Form.Group controlId="formRg">
                        <Form.Label>RG</Form.Label>
                        <Form.Control type="text" name="rg" value={cliente.rg} onChange={handleChange} required />
                    </Form.Group>

                    <Form.Group controlId="formEndereco">
                        <Form.Label>Endereço</Form.Label>
                        <Form.Control type="text" name="endereco" value={cliente.endereco} onChange={handleChange} required />
                    </Form.Group>

                    <Form.Group controlId="formProfissao">
                        <Form.Label>Profissão</Form.Label>
                        <Form.Control type="text" name="profissao" value={cliente.profissao} onChange={handleChange} required />
                    </Form.Group>

                    <Form.Group controlId="formEntidadeEmpregadora">
                        <Form.Label>Entidade Empregadora</Form.Label>
                        <Form.Control type="text" name="entidadeEmpregadora" value={cliente.entidadeEmpregadora} onChange={handleChange} required />
                    </Form.Group>

                    <Form.Group controlId="formRendimento">
                        <Form.Label>Rendimento</Form.Label>
                        <Form.Control type="number" name="rendimento" value={cliente.rendimento} onChange={handleChange} required />
                    </Form.Group>

                    <Button variant="primary" type="submit" className="mt-3">Enviar</Button>
                </Form>
            </Col>
        </Row>
    );


}
