document
  .getElementById("signupForm")
  .addEventListener("submit", function (event) {
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;
    const email = document.getElementById("email").value;
    const terms = document.getElementById("terms").checked;

    // Password length validation
    if (password.length < 8) {
      alert("Password must be at least 8 characters long!");
      event.preventDefault();
      return;
    }

    // Password match validation
    if (password !== confirmPassword) {
      alert("Passwords do not match!");
      event.preventDefault();
      return;
    }

    // Email validation (basic check)
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
      alert("Please enter a valid email address!");
      event.preventDefault();
      return;
    }

    // Terms and conditions validation
    if (!terms) {
      alert("You must agree to the Terms & Conditions and Privacy Policy!");
      event.preventDefault();
      return;
    }
  });
