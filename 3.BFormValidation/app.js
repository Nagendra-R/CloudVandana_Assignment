
document.getElementById("submitBtn").addEventListener("click", function() {
    
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = Array.from(document.querySelectorAll("input[name='gender']:checked"))
                     .map(input => input.value)
                     .join(", ");
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;
    
    const popupMessage = `
        First Name: ${firstName}
        Last Name: ${lastName}
        Date of Birth: ${dob}
        Country: ${country}
        Gender: ${gender}
        Profession: ${profession}
        Email: ${email}
        Mobile Number: ${mobile}
    `;

    alert(popupMessage);

    // Reset the form
    document.getElementById("surveyForm").reset();
});

document.getElementById("resetBtn").addEventListener("click", function() {
    document.getElementById("surveyForm").reset();
});