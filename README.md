Automated Meeting Room Booking System

Project Overview
The Automated Meeting Room Booking System is a web application designed to facilitate the booking of meeting rooms within a company. It caters to three types of users: Admins, Managers, and Members. Each user type has specific privileges and functionalities, such as creating and configuring meeting rooms, booking rooms based on seating capacity and available amenities, and managing credits required for bookings.
System Features
Core Functionalities
•	Role-Based Authentication: Secure access control tailored for Admin, Manager, and Member roles.
•	Bulk User Import: Admins can import user data directly from JSON files stored on the server.
•	Credit-Based Room Booking: Managers can reserve rooms using a dynamic credit system, with weekly credit replenishment.
User Capabilities
•	Admin Capabilities:
o	Meeting Room Configuration: Create and configure meeting rooms with specific capacities and amenities.
o	Room Management: Modify existing meeting room details through a user-friendly interface.
o	Batch User Import: Seamlessly upload and integrate user data using JSON files.
•	Manager Capabilities:
o	Meeting Scheduling: View and manage your meeting schedules and room availability.
o	Credit Management: Use allocated credits to book rooms based on requirements, with automatic credit reset every Monday.
o	Room Booking: Book rooms based on specific amenities and seating capacities.
•	Member Capabilities:
o	Meeting Room Overview: Access details of room availability and scheduled meetings.
o	View Booked Rooms: Monitor booked room statuses and upcoming meetings.
Credit Allocation System
•	Room Booking Costs: Costs are calculated based on room capacity and selected amenities:
o	Seating Capacity:
	<=5: 0 Credits
	>5 <=10: 10 Credits
	>10: 20 Credits
o	Amenity Charges:
	Projector: 5 Credits
	WiFi connection: 10 Credits
	Conference Call Facility: 15 Credits
	Whiteboard: 5 Credits
	Water Dispenser: 5 Credits
	TV: 10 Credits
	Coffee Machine: 10 Credits
•	Credit Reset Mechanism: Manager credits are automatically reset to 2000 every Monday at 6 AM.
Mandatory Amenities by Meeting Type
•	Classroom Training: Requires Whiteboard and Projector
•	Online Training: Requires WiFi and Projector
•	Conference Calls: Requires Conference Call Facility
•	Business Meetings: Requires Projector
User Interface Blueprint
•	Landing Page: Entry point for users to navigate room details and login options.
•	Authentication Portal: Secure login based on user roles (Admin, Manager, Member).

•	Admin Interface:
o	User Data Import: Interface to import user data via JSON files.
o	Room Creation Module: Form-based UI for creating new meeting rooms.
o	Room Editing Module: Interface to modify and update room configurations.
•	Manager Dashboard:
o	Meeting Overview: Displays all scheduled meetings and room details.
o	Room Booking Interface: Intuitive UI for booking rooms using credits.
o	Credit Status Panel: Real-time display of remaining credits.
Deployment & Installation
1. Cloning and Running the Project Locally-:
i)	Repository Cloning: Obtain the latest version of the project via Git.
ii)	Dependency Installation: Install necessary libraries and dependencies.
iii)	Server Setup: Configure the server to point to the JSON file directory for user data import.
iv)	Deployment: Deploy the application on the desired server and initiate room management.
Usage Guidelines
•	Admins: Configure rooms, manage amenities, and import users via JSON.
•	Managers: Schedule meetings, book rooms, and monitor credit usage.
•	Members: Access meeting schedules and view room availability.
License
This project is licensed under the MIT License. See the LICENSE file for more details.

