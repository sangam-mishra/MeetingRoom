function searchUser() {
    let input = document.getElementById('searchInput').value.toLowerCase();
    let userItems = document.getElementsByClassName('user-item');

    for (let i = 0; i < userItems.length; i++) {
        let name = userItems[i].getElementsByClassName('user-details')[0].getElementsByTagName('p')[0].textContent.toLowerCase();
        if (name.includes(input)) {
            userItems[i].style.display = "";
        } else {
            userItems[i].style.display = "none";
        }
    }
}
