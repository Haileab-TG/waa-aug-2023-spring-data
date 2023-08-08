
# Spring Data I

In this lab you will develop a Product Review Application.

###  Requirements
---
* Make domain models for
	* `Category` with `id` and `name`.
		* A `Category` can have many `Products`.
	* `Product` with `id, name, price` and `rating`.
		* A `Product` can belong to only one `Category`.
		* A `Product` can have many `Reviews`.
	* `User` with `id, email, password, firstName, lastname`.
		* `User` can create many `Reviews`.
		* `User` can have only one `Address`.
	* `Address` with `id, street, zip` and `city`.
		* An `Address` can belong to only one `User`. 
	* `Review` with `id, comment`.
		* A `Review` can only belong to one `User` and `Product`.

* Implement CRUD operations and build REST API for all domain models.

* Implement the following queries by using `Naming Convention`. Create REST endpoints for them.
	* Find all products that cost more than `minPrice`.
	* Find all products in `cat` category and cost less than `maxPrice`.
	* Find all products that contain `keyword` in the name.
	* Find reviews of the product whose id is `id`. 

### Technical Details
---
* Use n-tier software architecture model.
* Populate your database with dummy data using `data.sql`.


## Submission

* Create a postman collection that includes sample requests for all of your endpoints.
* Fork the repository and push your changes.
* Once you finished your project, send a Pull Request. (Send only one Pull Request once you finish the assignment.)

### Important Notes
---

 * You are not allowed to share codes with your classmates. If detected, you will get NC.
 * **For pairs:**
	 * Individual's work will be checked from the commits.
	 *  Share tasks evenly and fairly.
	 *  To have a clearer understanding of pair programming:
		 *  > **Pair programming** is an agile software development technique in which two programmers work together at one workstation. One, the _driver_, writes code while the other, the _observer_ or _navigator_ reviews each line of code as it is typed in. The two programmers switch roles frequently. 
		 * [Wikipedia](https://en.wikipedia.org/wiki/Pair_programming#:~:text=Pair%20programming%20is%20an%20agile,two%20programmers%20switch%20roles%20frequently.)

-   Remember to respect the code honor submission policy. All written code must be original. Presenting something as one’s own work when it came from another source is plagiarism and is forbidden.
    
-   Plagiarism is a very serious thing in all American academic institutions and is guarded against vigilantly by every professor.

