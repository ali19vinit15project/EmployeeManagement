# EmployeeManagement
Employee Management module


# **How to run?**

1. Download and extract the project.
2. Run the following command in the root folder
```java -jar EmployeeManagement-0.0.1-SNAPSHOT.jar```



# **API Docs**

1. GET all employees

```http://localhost:8080/api/employees```


2. POST all employees

```http://localhost:8080/api/employees```

{
    "firstName": "John",
    "lastName": "Snow",
    "middleName": "R",
    "dob": "11-11-2019",
    "gender": "M",
    "martialStatus": "Single",
    "email": "john@example.com",
    "phoneNum": 9876543210,
    "emrgncyPhoneNum": 9999999999,
    "aadhar": 999988887777,
    "pan": "YHYUI7897Y",
    "bloodGroup": "O+",
    "qualification": "BE",
    "photo": null,
    "address": {
        "area": "mumbai",
        "pincode": 10,
        "city": "Mumbai",
        "state": "Maharashtra"
    }
}
