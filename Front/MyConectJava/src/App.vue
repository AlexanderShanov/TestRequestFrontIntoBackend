<script setup>
import {reactive} from 'vue'
import axios from 'axios'

const currentFolder = reactive({
  folderURL: "C:\\"
}) 

const currentFolderContains = reactive({
  test: ""
})

let userObj = {
  name: "Sammy",
  email: "sammy@example.com",
  plan: "Pro"
};

const send1 = () =>{

  let userStr = JSON.stringify(currentFolder);
  console.log(userStr);
  console.log('send!');
  axios.post('http://localhost:8080/simple/simple2/simple2',  userStr,{
    headers: {
    'Content-Type': 'application/json'
    },
    withCredentials: true
  })
  .then((response)=> {
    console.log('response');
    console.log(response);
  })
  .catch(function (error) {
    console.log('error');
    console.log(error);
  });
}

function send2() {
   var xhttp = new XMLHttpRequest();
   xhttp.open("POST", "http://localhost:8080/simple/simple2/simple2", true); 
   xhttp.setRequestHeader("Content-Type", "application/json");
   xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        // Response
        var response = this.responseText;
      }
   };
   xhttp.send(JSON.stringify({
                "time": 16400
            }));
}
</script>

<template>
  <form 
  @submit.prevent.stop ="send1"
    class = "container pt-5 pb-5"
  >
    <div class = "container pt-5 pb-5">
      <input
        type = "text"
        v-model ="currentFolder.folderURL" 
        class = "form-control"     
      >

      <listbox>


      </listbox>

      <button class ="mt-4 btn btn-primary" >
        отправить
      </button>


    </div>


  </form>

</template>

<style scoped>

</style>
