import React, { useState, useEffect } from 'react';
import { Row, Col, Table, Button } from 'react-bootstrap';
import NavBar from '../components/NavBar';
import { useNavigate, createSearchParams } from 'react-router';


export default function ListaClientes() {
    const [listaClientes, setListaClientes] = useState<Cliente[]>()
    const navegar = useNavigate()

    useEffect(() => {


        const clientes = [
            {
                id: 2,
                usuario: {
                    id: 2,
                    nome: "Cleiton",
                    cpf: "12321",
                    rg: "string",
                    endereço: "endereco",
                    profissao: "viador",
                    entidadeEmpregadora: "santander",
                    rendimento: 10000
                }
            },
            {
                id: 2,
                usuario: {
                    id: 2,
                    nome: "Jessica",
                    cpf: "12321",
                    rg: "string",
                    endereço: "endereco",
                    profissao: "viador",
                    entidadeEmpregadora: "santander",
                    rendimento: 10000
                }
            },
            {
                id: 2,
                usuario: {
                    id: 2,
                    nome: "MiMIla",
                    cpf: "12321",
                    rg: "string",
                    endereço: "endereco",
                    profissao: "viador",
                    entidadeEmpregadora: "santander",
                    rendimento: 10000
                }
            },
            {
                id: 2,
                usuario: {
                    id: 2,
                    nome: "KKKKKK",
                    cpf: "12321",
                    rg: "string",
                    endereço: "endereco",
                    profissao: "viador",
                    entidadeEmpregadora: "santander",
                    rendimento: 10000
                }
            }
        ]

        setListaClientes(clientes)
    }, [])

    function abreNovoCarro() {
        return
    }

    return (
        <>
            <Row>
                <NavBar />
                <Col>
                    <Row className="text-center mt-5">
                        <h2>Lista de Clientes</h2>
                    </Row>
                    <Row>
                        <Col>
                            <Button onClick={() => {
                                navegar({
                                    pathname: "/NovoCliente",
                                })
                            }}>Novo Cliente</Button>
                        </Col>
                    </Row>
                    <Row>
                        <Table>
                            <thead>
                                <tr>
                                    <th>
                                        Nome:
                                    </th>
                                    <th>
                                        Cpf:
                                    </th>
                                    <th>
                                        Endereco:
                                    </th>
                                    <th>
                                        Profissao:
                                    </th>
                                    <th>
                                        Ações:
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                                {listaClientes?.map((cliente) =>
                                    <tr>
                                        <td>
                                            {cliente.usuario.nome}
                                        </td>
                                        <td>
                                            {cliente.usuario.cpf}
                                        </td>
                                        <td>
                                            {cliente.usuario.endereço}
                                        </td>
                                        <td>
                                            {cliente.usuario.profissao}
                                        </td>
                                        <td>
                                            <Button variant="primary"
                                                onClick={() => {
                                                    navegar({
                                                        pathname: "/EditarCliente",
                                                        search: createSearchParams({
                                                            Id: cliente.usuario.id.toString()
                                                        }).toString()
                                                    })
                                                }}> Editar</Button>
                                        </td>
                                    </tr>
                                )}
                            </tbody>
                        </Table>
                    </Row>
                </Col>
            </Row>

        </ >
    )
}