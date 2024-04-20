# Exercise no.2
### Speed Converter

Write a method called **toMilesPerHour** that has **1 parameter** of **type double** with the name **kilometersPerHour**. 
This method needs to return the rounded value of the calculation of type **long**.

If the parameter **kilometersPerHour** is **less than 0**, the method **toMilesPerHour** needs to **return -1** to indicate an **invalid value**.

Otherwise, if its positive, **calculate the value of miles per hour, round it and return it**. For conversion and rounding, **check the notes in the text below**.

**Examples of input/output:**
- toMilesPerHour(1.5); ---> should **return** value **1** 
- toMilesPerHour(10.25); ---> should **return** value **6**
- toMilesPerHour(-5.6); ---> should **return** value **-1**
- toMilesPerHour(25.42); ---> should **return** value **16**
- toMilesPerHour(75.114); ---> should **return** value **47**

Write another method called **printConversion** with **1 parameter** of **type double** with the name **kilometersPerHour**.

This method should **not return anything (void)** and it needs to **calculate milesPerHour** from the **kilometersPerHour** parameter.

Then it needs to print a message in the format **"XX km/h = YY mph"**. 

**XX** represents the original value **kilometersPerHour**.  
**YY** represents the rounded **milesPerHour** from the **kilometersPerHour** parameter.

If the parameter **kilometersPerHour** is **< 0** the print text **"Invalid Value"**.

Examples of input/output:
- printConversion(1.5); ---> should **print** the following text into the console - **1.5 km/h = 1 mph**
- printConversion(10.25); ---> should **print** the following text into the console - **10.25 km/h = 6 mph**
- printConversion(-5.6); ---> should **print** the following text into the console - **Invalid Value**
- printConversion(25.42); ---> should **print** the following text into the console - **25.42 km/h = 16 mph**
- printConversion(75.114); ---> should **print** the following text into the console - **75.114 km/h = 47 mph**