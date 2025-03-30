import { useEffect, useState } from "react"
import { Row, Col, Container, Table, Button } from "react-bootstrap"
import { Route, useNavigate } from "react-router";
import NovoCarro from "../components/NovoCarro";



export default function ListaCarros() {

    const [listaDeCarros, setListaDeCarro] = useState<Automovel[]>()
    const [usuario, setUsuario] = useState<Usuario>()
    const [cliente, setCliente] = useState<Cliente>()
    const navegar = useNavigate()

    useEffect(() => {
        const user = {
            id: 2,
            nome: "Gay",
            cpf: '123123123-12',
            rg: "12312323",
            endereço: "aaaaaaaaa,aaaaaaaaaaaaa,aaaaaaaaaa,33",
            profissao: "Gay2",
            entidadeEmpregadora: "Gol Viagens",
            rendimento: 12344
        }
        const client = {
            id: 12,
            usuario: user
        }

        const carros = [
            {
                id: 1,
                matricula: "12",
                proprietario: client,
                modelo: "Mob",
                ano: 2025,
                marca: "Fiat",
                placa: "1123-1234",
            },
            {
                id: 1,
                matricula: "12",
                proprietario: client,
                modelo: "Palio",
                ano: 2010,
                marca: "Fiat",
                placa: "1123-1234"
            },
            {
                id: 1,
                matricula: "12",
                proprietario: client,
                modelo: "Gol",
                ano: 1000,
                marca: "Fiat",
                placa: "1123-1234"
            },
            {
                id: 1,
                matricula: "12",
                proprietario: client,
                modelo: "Celta",
                ano: 1090,
                marca: "Fiat",
                placa: "1123-1234"
            }
        ]
        if (usuario) {
            setCliente(client)
        }
        setUsuario(usuario)
        setListaDeCarro(carros)
    }, [usuario])

    function abreNovoCarro() {
        return
    }

    function editarCarro(id: number) {
        navegar('EditarCarro', {
            state: { id: id }
        })
    }

    return (
        <Container>
            <Row className="text-center mt-5">
                <h2>Tabela de Carros</h2>
            </Row>
            <Row>
                <Col>
                    <Button onClick={() => {
                        abreNovoCarro()
                    }}>Novo Carro</Button>
                </Col>
            </Row>
            <Row>
                <Table>
                    <thead>
                        <tr>
                            <th>
                                Modelo:
                            </th>
                            <th>
                                Ano:
                            </th>
                            <th>
                                Marca:
                            </th>
                            <th>
                                Cliente:
                            </th>
                            <th>
                                Ações:
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        {listaDeCarros?.map((carro) =>
                            <tr>
                                <td>
                                    {carro.modelo}
                                </td>
                                <td>
                                    {carro.ano}
                                </td>
                                <td>
                                    {carro.marca}
                                </td>
                                <td>
                                    {carro.proprietario.usuario.nome}
                                </td>
                                <td>
                                    <Button variant="primary" onClick={() => {
                                        editarCarro(carro.id)
                                    }}>Editar</Button>
                                </td>
                            </tr>
                        )}
                    </tbody>
                </Table>
            </Row>
            <Row>
                <Col></Col>
            </Row>
        </Container>
    )
}