import bodyParser from 'body-parser';
import express from 'express';
import { createConnection } from "mysql";
import cors from 'cors';

const app = express();
const PORT = 5500;

app.use(cors());
app.use(express.json());
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());


app.listen(PORT,()=>{
    console.log(`Server is running at http:localhost:${PORT}`);// dekhna thoda eska
});

const connectionConfig = createConnection({
    host: "localhost",
    user: "root",
    password: "Owner@1998",
    database: "practice"
});

connectionConfig.connect((err)=>{
    if(err){
        console.log(err);
        return;
    }
    console.log('Connected to mysql database');
});


async function savestudent(event){
    event.preventDefault();//prevent page from refresh

    var erno=document.getElementById("erno").value;
    var name=document.getElementById("fullname").value;
    var email=document.getElementById("email").value;
    var college =document.getElementById("college").value;
    var course=document.getElementById("course").value;
    var mobno=document.getElementById("mobno").value;
    var pwd=document.getElementById("pwd").value;

    var student = {
        erno,
        name,
        email,
        college,
        course,
        mobno,
        pwd
    }
    try{
        const response=await fetch("http://192.168.1.4:5500/students/save",
            {
                method: "POST",
                headers:{
                    'Accept':'application/json',
                    'Content-Type':'application/json'  
                },
                body:JSON.stringify(student)
                });
                const data=await response.json();
                console.log(data);
                document.getElementById("msg").innerHTML=data.message;
    }catch(error){
        console.log(error);
    }
}

app.post("/students/save",(request,response)=>{
    var data=request.body;
    response.send({message:`Welcome to app ${data}`});
    console.log("done",data);
});