import 'package:eye_bleach/models/random_dog.dart';
import 'package:eye_bleach/screen/random_image_screen.dart';
import 'package:eye_bleach/utilities/network_helper.dart';
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
              onPressed:() async{
                var requisicao = NetworkHelper(url:"https://dog.ceo/api/breeds/image/random");
                var dados = RandomDog.fromJson(await requisicao.getData());
                String imageUrl = dados.message;

                changeScreen(imageUrl, context);

              },
              icon: Icon(Icons.remove_red_eye),
              label: Text("Limpe seus olhos"))
          ],
        ),
      ),
      
    );
  }

  void changeScreen(String imageUrl, BuildContext context) {
    Navigator.push(
     context,
      MaterialPageRoute(    // Para numero maior de telas dá para melhorar isso
        builder: (context) => RandomImageScreen(url: imageUrl),
      ),
    );
  }

}