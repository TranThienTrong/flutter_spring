import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

import 'employee.dart';

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;

    List<String> employeesList = [];

    return Scaffold(
      appBar: AppBar(
        title: Text("Flutter with Spring"),
      ),
      body: FutureBuilder(
          future: getAllEmployees(),
          builder: (context, AsyncSnapshot<dynamic> snapshot) {
            if (snapshot.hasData) {
              List<Employee> employeesList = snapshot.data;
              return Center(
                child: Container(
                  height: size.height,
                  width: size.width,
                  child: ListView.builder(
                    itemCount: employeesList.length,
                    itemBuilder: (BuildContext context, int index) {
                      return ListTile(
                        leading: Text(employeesList[index].id.toString()),
                        title: Text(employeesList[index].fullName),
                        subtitle: Row(
                          mainAxisSize: MainAxisSize.min,
                          crossAxisAlignment: CrossAxisAlignment.start,
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: [
                            Text(
                              employeesList[index].gender,
                            ),
                            Text(
                              employeesList[index].mobileNumber,
                            ),
                            Text(
                              employeesList[index].address,
                            ),
                            Text(
                              employeesList[index].birthdate,
                            ),
                          ],
                        ),
                      );
                    },
                  ),
                ),
              );
            } else {
              return Center(child: Text("waiting..."));
            }
          }),
    );
  }

  Future<List<Employee>?> getAllEmployees() async {
    http.Response response =
        await http.get(Uri.parse('http://192.168.0.5:8080/employees'));

    if (response.statusCode == 200) {
      List<Employee> employeesList = [];
      var result = json.decode(response.body);

      result.forEach((e) {
        Employee employee = Employee.fromJson(e);
        employeesList.add(employee);
      });

      return employeesList;
    } else {
      return null;
    }
  }
}
