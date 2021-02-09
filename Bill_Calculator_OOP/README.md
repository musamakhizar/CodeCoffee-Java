<h1>Program to calculate Electricity Bill</h1>

Given an integer U denoting the amount of KWh units of electricity consumed, 
the task is to calculate the electricity bill with the help of the below charges:
<ul>
  <li> 1 to 100 units – Rs. 10/unit</li>
  <li> 100 to 200 units – Rs. 15/unit</li>
  <li> 200 to 300 units – Rs. 20/unit</li>
  <li> above 300 units – Rs. 25/unit</li>
</ul>

<strong>Approach:</strong> The idea is to identify the charge bar in which it falls and then calculate the bill according to the charges mentioned above. Below is the illustration of the steps:

<ul>
  <li> Check units consumed is less than equal to the 100, If yes then the total electricity bill will be:
         &nbsp;&nbsp;<br>Total Electricity Bill = (units * 10) </li>
  <li> Else if, check that units consumed is less than equal to the 200, if yes then total electricity bill will be:
        &nbsp;&nbsp;<br>Total Electricity Bill = (100*10) + (units-100) * 15 </li>
  <li> Else if, check that units consumed is less than equal to the 300, if yes then total electricity bill will be:
        &nbsp;&nbsp;<br>Total Electricity Bill = (100*10) + (100*15) + (units-200) * 20 </li>
  <li> Else if, check that units consumed greater than 300, if yes then total electricity bill will be:
        &nbsp;&nbsp;<br>Total Electricity Bill = (100*10) + (100*15) + (100*20) + (units-300) * 25 </li>
</ul>

