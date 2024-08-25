# Automated Meeting Room Booking System

## Project Overview
The Automated Meeting Room Booking System is a web application designed to facilitate the booking of meeting rooms within a company. It caters to three types of users: Admins, Managers, and Members. Each user type has specific privileges and functionalities, such as creating and configuring meeting rooms, booking rooms based on seating capacity and available amenities, and managing credits required for bookings.

## System Features
### Core Functionalities
1.	Role-Based Authentication: Secure access control tailored for Admin, Manager, and Member roles.
2.	Bulk User Import: Admins can import user data directly from JSON files stored on the server.
3.	Credit-Based Room Booking: Managers can reserve rooms using a dynamic credit system, with weekly credit replenishment.
   
## User Capabilities
### Admin Capabilities:
1.  Meeting Room Configuration: Create and configure meeting rooms with specific capacities and amenities.
2.    Room Management: Modify existing meeting room details through a user-friendly interface.
3.Batch User Import: Seamlessly upload and integrate user data using JSON files.
### Manager Capabilities:
1.  Meeting Scheduling: View and manage your meeting schedules and room availability.
2.  Credit Management: Use allocated credits to book rooms based on requirements, with automatic credit reset every Monday.
3.  Room Booking: Book rooms based on specific amenities and seating capacities.
### Member Capabilities:
1.  Meeting Room Overview: Access details of room availability and scheduled meetings.
2.  View Booked Rooms: Monitor booked room statuses and upcoming meetings.
## Credit Allocation System
1.  Room Booking Costs: Costs are calculated based on room capacity and selected amenities:
2.  Credit Reset Mechanism: Manager credits are automatically reset to 2000 every Monday at 6 AM.
## Mandatory Amenities by Meeting Type
1.  Classroom Training: Requires Whiteboard and Projector
2.	Online Training: Requires WiFi and Projector
3.	Conference Calls: Requires Conference Call Facility
4.	Business Meetings: Requires Projector
## User Interface Blueprint
1.	Landing Page: Entry point for users to navigate room details and login options.
2.	Authentication Portal: Secure login based on user roles (Admin, Manager, Member).

## 	Admin Interface:
1.	User Data Import: Interface to import user data via JSON files.
2.	Room Creation Module: Form-based UI for creating new meeting rooms.
3.	Room Editing Module: Interface to modify and update room configurations.
### Manager Dashboard:
1.	Meeting Overview: Displays all scheduled meetings and room details.
2.	Room Booking Interface: Intuitive UI for booking rooms using credits.
3.	Credit Status Panel: Real-time display of remaining credits.
### Member's Page
1.  View Meetings: Members can view meetings they are part of and details of available meeting rooms.
2.  Restricted Booking: Unlike managers, members can’t book rooms but have access to detailed information about room availability and features.
   
## Deployment & Installation
### Cloning and Running the Project Locally-:
1.	Repository Cloning: Obtain the latest version of the project via Git.
2.	Dependency Installation: Install necessary libraries and dependencies.
3.	Server Setup: Configure the server to point to the JSON file directory for user data import.
4.	Deployment: Deploy the application on the desired server and initiate room management.
   
## Usage Guidelines
1.	Admins: Configure rooms, manage amenities, and import users via JSON.
2.	Managers: Schedule meetings, book rooms, and monitor credit usage.
3.	Members: Access meeting schedules and view room availability.
   
### License
This project is licensed under the MIT License. See the LICENSE file for more details.


