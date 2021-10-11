import 'dart:convert';

String employeeToJson(Employee employee) {
  return json.encode(employee);
}

Employee employeeFromJson(String str) {
  return Employee.fromJson(json.decode(str));
}

class Employee {
  int id;
  String fullName;
  String gender;
  String mobileNumber;
  String address;
  String birthdate;

  Employee(
      {required this.id,
      required this.fullName,
      required this.gender,
      required this.mobileNumber,
      required this.address,
      required this.birthdate});

  factory Employee.fromJson(Map<String, dynamic> json) {
    return Employee(
      id: json['id'],
      fullName: json['fullName'],
      gender: json['gender'],
      mobileNumber: json['mobileNumber'],
      address: json['address'],
      birthdate: json['birthdate'],
    );
  }
}
