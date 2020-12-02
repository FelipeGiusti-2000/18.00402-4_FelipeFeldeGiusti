import 'package:flutter/material.dart';

class MyHomeScreen extends StatelessWidget {

  String _homeScreenImage = "assets/images/homerEyebleach.png";

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(title: Text("Eye Bleach"),),
        body: Column(
          children: [
            Expanded(child: new Image.asset(_homeScreenImage)),
            ElevatedButton.icon(
              onPressed:(){
                searchNewPicture();
              },
              icon: Icon(Icons.remove_red_eye),
              label: Text("Limpe seus olhos"))
          ],
        ),
      ),
      
    );
  }

  void searchNewPicture() {
    print("Testing Button");
  }
}