const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors({
    origin: '*',
    methods: ['GET','POST','DELETE','UPDATE','PUT','PATCH'],
    credentials: true //check bene a cosa serve
}));
//per creare altre rotte copi e incollo app.get/test...
app.get("/test", (req,res) => {
    console.log("aisdno");
    res.json({
        result: true,
        nome: "test",
        cognome: "test"
    });
});
//per le richieste usare sempre la get.

app.get("/ciao", (req,res) => {
    console.log("aisdno");
    res.json({
        result: true,
        nome: "test",
        cognome: "test",
        anni:20
    });
});

app.listen(3000);
