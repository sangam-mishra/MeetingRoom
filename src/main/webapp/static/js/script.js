let totalCredits = 2000; // Manager starts with 2000 credits

document.querySelectorAll('.amenities input[type="checkbox"]').forEach(checkbox => {
    checkbox.addEventListener('change', calculateCost);
});

function calculateCost() {
    let capacity = parseInt(document.getElementById('capacity').value) || 0;
    let cost = 0;

    if (capacity > 5 && capacity <= 10) {
        cost += 10;
    } else if (capacity > 10) {
        cost += 20;
    }

    document.querySelectorAll('.amenities input[type="checkbox"]:checked').forEach(checkbox => {
        cost += parseInt(checkbox.value);
    });

    document.getElementById('cost').textContent = cost;

    let remainingCredits = totalCredits - cost;
    document.getElementById('remaining-credits-note').textContent = `NOTE: Only ${remainingCredits} points remaining in your account.`;
}

document.getElementById('book-room').addEventListener('click', function() {
    let totalCost = parseInt(document.getElementById('cost').textContent);
    if (totalCredits >= totalCost) {
        totalCredits -= totalCost;
        alert('Room booked successfully!');
        // Here you would also update the room schedule and record the booking
    } else {
        alert('Insufficient credits to book the room.');
    }
});
