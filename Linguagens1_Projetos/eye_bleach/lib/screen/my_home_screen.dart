import 'package:eye_bleach/screen/random_image_screen.dart';
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
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (BuildContext context) => RandomImageScreen(url: "https://www.google.com/url?sa=i&url=https%3A%2F%2Fcommons.wikimedia.org%2Fwiki%2FFile%3ATest-Logo.svg&psig=AOvVaw0oIrlD3rvYAvmkWXXVJ6tc&ust=1607039218673000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCSrem9sO0CFQAAAAAdAAAAABAD"),
                  ),
                );
              },
              icon: Icon(Icons.remove_red_eye),
              label: Text("Limpe seus olhos"))
          ],
        ),
      ),
      
    );
  }

  void searchNewPicture() {
    print("Indo para outra tela");
  }
}