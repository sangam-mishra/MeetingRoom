document.addEventListener("DOMContentLoaded", function() {
    fetch('../static/data/data.json')
        .then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }
            return response.json();
        })
        .then(data => {
            const meetingsContainer = document.getElementById('meetings-container');

            if (!data.meetings || !Array.isArray(data.meetings)) {
                throw new Error('Invalid data format: Expected an array of meetings.');
            }

            data.meetings.forEach(meeting => {
                const meetingDiv = document.createElement('div');
                meetingDiv.className = 'meeting';

                // Set image path based on meeting venue or any other logic
                let imagePath;
                if (meeting.venue === "Projector Room") {
                    imagePath = "../static/images/real_time_availabillity_image_3.png";
                } else if (meeting.venue === "Conference Room") {
                    imagePath = "../static/images/real_time_availabillity_image_3.png";
                } else {
                    imagePath = "../static/images/real_time_availabillity_image_3.png";
                }

                meetingDiv.innerHTML = `
                    <div class="meeting-details">
                        <p><strong>${meeting.date}</strong></p>
                        <p class="time">${meeting.time}</p>
                        <p class="organizer"><strong>Organizer:</strong> ${meeting.organizer}</p>
                    </div>
                    <div class="venue">
                        <div class="venue-details">
                            <p><strong>Venue</strong></p>
                            <p>${meeting.venue}<br>${meeting.location}</p>
                        </div>
                        <img src="${imagePath}" alt="${meeting.venue}">
                    </div>
                `;

                meetingsContainer.appendChild(meetingDiv);
            });
        })
        .catch(error => console.error('Error fetching meeting data:', error));
});
