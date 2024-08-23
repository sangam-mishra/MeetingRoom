const users = [
  {
    name: "Ridhanshu",
    role: "Admin",
    email: "help@hsbc.support.com",
    phone: "+1 (201) 895-3801",
  },
  {
    name: "Jai",
    role: "Manager",
    email: "help@hsbc.support.com",
    phone: "+1 (201) 895-3801",
  },
  {
    name: "Karamveer",
    role: "Manager",
    email: "help@hsbc.support.com",
    phone: "+1 (201) 895-3801",
  },
  {
    name: "Riddhika",
    role: "Member",
    email: "help@hsbc.support.com",
    phone: "+1 (201) 895-3801",
  },
  {
    name: "Darpan",
    role: "Member",
    email: "help@hsbc.support.com",
    phone: "+1 (201) 895-3801",
  },
];

function displayUsers(users) {
  const userTable = document.getElementById("userTable");
  userTable.innerHTML = "";

  users.forEach((user) => {
    const userItem = document.createElement("div");
    userItem.className = "user-item";

    userItem.innerHTML = `
      <div class="user-info">
        <div class="user-icon">
       <i style="font-size:65px" class="fa">&#xf007;</i>
</div>       

        <div class="user-details">
          <div class="user-header">
            <p>Name:</p>
            <p class="answers">${user.name}</p>
          </div>
          <div class="user-header">
            <p>Role:</p>
            <p class="answers">${user.role}</p>
          </div>
          <div class="user-header">
            <p>Email:</p>
            <p class="answers">${user.email}</p>
          </div>
          <div class="user-header">
            <p>Phone Number:</p>
            <p class="answers">${user.phone}</p>
          </div>
        </div>
      </div>
    `;

    userTable.appendChild(userItem);
  });
}

function searchUser() {
  const searchInput = document
    .getElementById("searchInput")
    .value.toLowerCase();

  const filteredUsers = users.filter(
    (user) =>
      user.name.toLowerCase().includes(searchInput) ||
      user.role.toLowerCase().includes(searchInput) ||
      user.email.toLowerCase().includes(searchInput) ||
      user.phone.includes(searchInput)
  );

  displayUsers(filteredUsers);
}

// Event listener for real-time search
document.getElementById("searchInput").addEventListener("input", searchUser);

// Initial load
displayUsers(users);
