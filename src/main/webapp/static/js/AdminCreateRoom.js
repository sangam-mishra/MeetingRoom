document.addEventListener("DOMContentLoaded", function () {
  const amenitiesGroups = document.querySelectorAll(".amenities-group");

  amenitiesGroups.forEach((group) => {
    const checkbox = group.querySelector('input[type="checkbox"]');
    const textInput = group.querySelector('input[type="text"]');

    // Initially disable the text input
    textInput.disabled = true;

    // Add event listener to enable/disable the text input based on checkbox
    checkbox.addEventListener("change", function () {
      if (checkbox.checked) {
        textInput.disabled = false;
        textInput.placeholder = "Enter Credits";
      } else {
        textInput.disabled = true;
        textInput.placeholder = "";
        textInput.value = ""; // Clear the value if unchecked
      }
    });
  });

  // Example of showing notification when room is created
  document
    .querySelector(".create-room-btn")
    .addEventListener("click", function () {
      const notification = document.querySelector(".notification");
      notification.style.display = "block";

      setTimeout(() => {
        notification.style.display = "none";
      }, 3000); // Hide the notification after 3 seconds
    });
});
