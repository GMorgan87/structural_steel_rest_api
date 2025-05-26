This API allows you to query Section objects from a database based on different criteria, such as description and beam properties (Ixx, Iyy, Zxx, Zyy).

Endpoints

1. Get All Sections
GET /api/sections/all

Retrieves all Section objects.
Response: A list of all sections.

2. Get Sections by Description
GET /api/sections/{desc}

Retrieves sections where the description contains the provided string (case-insensitive).

Path Variable:
desc: The search term for the description.


3. Get Beams with Y-Axis Properties Greater Than Minimum
GET /api/sections/{desc}/y/{minIyy}/{minZyy}/all

Retrieves all sections where:

Iyy is greater than minIyy.
Zyy is greater than minZyy.
Description contains the provided desc.

Path Variables:
desc: The search term for the description.
minIyy: Minimum value for Iyy.
minZyy: Minimum value for Zyy.


4. Get Beams with X-Axis Properties Greater Than Minimum
GET /api/sections/{desc}/x/{minIxx}/{minZxx}/all

Retrieves all sections where:
Ixx is greater than minIxx.
Zxx is greater than minZxx.
Description contains the provided desc.

Path Variables:
desc: The search term for the description.
minIxx: Minimum value for Ixx.
minZxx: Minimum value for Zxx.


5. Get First Beam with Y-Axis Properties Greater Than Minimum
GET /api/sections/{desc}/y/{minIyy}/{minZyy}

Retrieves the first section where:
Iyy is greater than minIyy.
Zyy is greater than minZyy.
Description contains the provided desc.

Path Variables:
desc: The search term for the description.
minIyy: Minimum value for Iyy.
minZyy: Minimum value for Zyy.


6. Get First Beam with X-Axis Properties Greater Than Minimum
GET /api/sections/{desc}/x/{minIxx}/{minZxx}

Retrieves the first section where:
Ixx is greater than minIxx.
Zxx is greater than minZxx.
Description contains the provided desc.

Path Variables:
desc: The search term for the description.
minIxx: Minimum value for Ixx.
minZxx: Minimum value for Zxx.
