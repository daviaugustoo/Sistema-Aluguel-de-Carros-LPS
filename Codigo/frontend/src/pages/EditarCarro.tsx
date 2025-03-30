import { useEffect, useState } from "react"
import { Row, Col, Container, Table, Button } from "react-bootstrap"
import { useParams, useNavigate } from "react-router-dom";
import NavBar from "../components/NavBar";


export default function EditarCarro() {
    const { idCarro } = useParams<{ idCarro: string }>();
    const navegar = useNavigate()


    return (
        <>
            <Row>
                <NavBar />
                <Col>
                    <h1>aaaaaaaaaaaaaaaaaaaa</h1>
                    <h1>{idCarro}</h1>
                </Col>
            </Row>
        </>
    )
}