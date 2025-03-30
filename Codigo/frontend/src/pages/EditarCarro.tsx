import { useEffect, useState } from "react"
import { Row, Col, Container, Table, Button } from "react-bootstrap"
import { useParams, useNavigate } from "react-router-dom";


export default function EditarCarro() {
    const { idCarro } = useParams<{ idCarro: string }>();
    const navegar = useNavigate()


    return (
        <>
            <Row>
                <Col>
                    <h1>{idCarro}</h1>
                </Col>
            </Row>
        </>
    )
}