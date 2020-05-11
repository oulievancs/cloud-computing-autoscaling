'use script';
const express = require('express');

const PORT = '8080';
const HOST = '0.0.0.0';

const app = express();

app.get("/high-load", (req, res) => {
    var os = require('os');
    
	let i;
	let sum = 0;
	
	for (i=0; i < 5000000; i++) {
	    sum += Math.pow(Math.random()*Math.floor(500000), 2);
	}
	
	res.send('Goodbye World. Pod with id ' + os.hostname() + ' answered. The result of random\'s 2nd powers is: ' + sum + ' .');
});

app.listen(PORT, HOST);
console.log(`Running on http://${HOST}:${PORT}`);
