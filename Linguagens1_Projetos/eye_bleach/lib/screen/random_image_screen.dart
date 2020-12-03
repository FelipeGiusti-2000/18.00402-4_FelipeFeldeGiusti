import 'package:flutter/material.dart';

class RandomImageScreen extends StatelessWidget {

  final String url;

// Alternativa para transportar dados entre telas de: Suragch 
// https://stackoverflow.com/questions/53861302/passing-data-between-screens-in-flutter
  RandomImageScreen({Key key, @required this.url}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(),
        body: Column(
          children: [
            Expanded(child: new Image.network(url)),
            ElevatedButton.icon(
              onPressed:(){
                print(url);
              },
              icon: Icon(Icons.account_box_rounded),
              label: Text("Debug"))
          ],
        ),
      ),
      
    );
  }
}