This is a spring boot based web application for Mobile prepaid recharges.Here there are 2 roles i.e...User and Admin.It allows users to view recharge plans,select one & complete the recharge.Admins can manage the recharge plans.After a successful recharge,system can send a confirmation message to the users email.
User Flow : Can view and Recharge plans only.
Step 1: Display Available Recharge Plans - Using GET Method
When a user logs in or visits recharge plans, application fetches all available plans from database and shows them.
Step 2: User Selects a Plan - Using POST Method
The user selects a plan by submitting a form with the planID. This sends the selected plan details and userID to backend.
Step 3: Recharge Processing
Backend checks if the plan exists and is valid.If so,it saves the recharge information in the RechargeHistory table.
Step 4: Mail Confirmation
After recharge is successful,a confirmation email is sent to user saying "Recharge Successful".
Admin Flow: Manages plans and has full control.
Admin logs in and manages recharge plans-adding new ones,deleting expired plans & updating existing ones.
Admin controller does:
Post- add plan
Delete- delete planID
Put -update planID
