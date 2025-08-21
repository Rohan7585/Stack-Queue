/**
 * 
 */

//Functions for Stack
async function pushStack(){
	const data = document.getElementById("stackData").value;
	try{
		const response = await fetch('/stack',{
			method: 'POST',
			headers: {
				"Content-Type": "application/json"
			},
			body:  JSON.stringify({ data : data })
		});
		const result = await response.text();
		document.getElementById("stackMsg").innerText = result;
		await stackDisplay();
		document.getElementById('stackData').value='';
	}catch(error){
		console.error("Error: ", error);	
	}
/*	fetch('/stack',{
		method: 'POST',
		headers: {
			"Content-Type": "application/json"
		},
		body:  JSON.stringify({ data : data })
	}) 
	.then(response => response.text())
	.then(result => {
		document.getElementById("stackMsg").innerText = result;
	})
	.catch(error => console.error("Error:", error));*/
}

async function popStack(){
	try{
		const response  = await fetch('/stack/pop');
		const popMsg = await response.text();
		document.getElementById('stackMsg').innerText = popMsg;
		await stackDisplay();
		document.getElementById('stackData').value='';
	}catch(error){
		console.log("Error: ",error);
	}
}

async function stackTop(){
	try{
		const response = await fetch('/stack/top');
		const popMsg = await response.text();
		document.getElementById('stackMsg').innerText = popMsg;
		document.getElementById('stackData').value = '';
	}catch(error){
		console.log("Error: ",error);
	}	
}

async function stackDisplay(){
	try{
		const response = await fetch('/stack');
		const stackResponse = await response.text();
		document.getElementById('stackDisplay').innerText = stackResponse;
		document.getElementById('stackData').value = '';
	}catch(error){
		console.error("Error: ",error);
	}
	
/*	fetch('/stack')
	.then(response => response.text())
	.then(data => {
		console.log(data);
		document.getElementById("stackDisplay").innerText = data;
	})
	.catch(error => console.error("Error:", error));*/
}

async function stackLength(){
	try{
			const response = await fetch('/stack/len');
			const popMsg = await response.text();
			document.getElementById('stackMsg').innerText = popMsg;
			document.getElementById('stackData').value = '';
		}catch(error){
			console.log("Error: ",error);
		}	
}


//Functions for queue
async function enqueueQueue(){
	const inputData = document.getElementById('queueData').value;
	try{
		const response = await fetch('/queue',{
			method: "POST",
			headers:{
				"Content-Type": "application/json"
			},
			body: JSON.stringify({ data : inputData})
		});
		const result = await response.text();
		document.getElementById("queueMsg").innerText = result;
		await queueDisplay();
		document.getElementById('queueData').value='';
	}catch(error){
		console.log("Error:  " , error);
	}
}

async function dequeueQueue(){
	try{
		const response = await fetch('/queue/dequeue');
		const DQmsg = await response.text();
		document.getElementById('queueMsg').innerText = DQmsg;
		document.getElementById('queueData').value = '';
		await queueDisplay();
	}catch(error){
		console.log("Error: ",error);
	}
}

async function queueDisplay(){
	try{
		const response = await fetch('/queue');
		const DQbody = await response.text();
		document.getElementById('queueDisplay').innerText = DQbody;
		document.getElementById('queueData').value = '';
	}catch(error){
		console.log("Error: ",error);
	}
	
}

async function queueLength(){
	try{
		const response = await fetch('/queue/len');
		const len = await response.text();
		document.getElementById('queueMsg').innerText = len;
		document.getElementById('queueData').value = '';
	}catch(error){
		console.log("Error: ",error);
	}
	
}

