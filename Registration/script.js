const button = document.querySelector(".button");
button.onclick = () => {
    const name = document.getElementById("name").value;
    const uname = document.getElementById("uname").value;
    const email = document.getElementById("email").value;
    const phoneno = document.getElementById("phoneno").value;
    const password = document.getElementById("password").value;
    const cpassword = document.getElementById("cpassword").value;

    localStorage.setItem('Name', name);
    localStorage.setItem('User Name', uname);
    localStorage.setItem('Email', email);
    localStorage.setItem('PhoneNo', phoneno);
    localStorage.setItem('Password', password);
    localStorage.setItem('CPassword', cpassword);

    if (name == "" && uname == "" && email == "" && phoneno == "" && password == "" && cpassword == "") {
        alert("Input field has no value");
    }
    else if (phoneno.length < 10) {
        alert("Phone no must be of 10 digit ");
    }
    else if (phoneno.length > 10) {
        alert("Phone no must be of 10 digit ");
    }
    else if (isNaN(phoneno)) {
        alert("Phone no must be numeric ");
    }
    else if ((phoneno.charAt(0) != 9) && (phoneno.charAt(0) != 8) && (phoneno.charAt(0) != 7)) {
        alert("phoneno must start with 9,8 or 7");
    }
    else {
        if (password != cpassword) {
            alert("Password not matching");
        }
        else if(password.length<6)
        {
            alert("password must be of 6 characters");
        }
        else {
            alert('registration successful!!');
        }
    }
}