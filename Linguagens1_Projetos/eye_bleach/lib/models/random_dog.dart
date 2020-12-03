class RandomDog {
  int _fileSizeBytes;
  String _url;

  RandomDog({int fileSizeBytes, String url}) {
    this._fileSizeBytes = fileSizeBytes;
    this._url = url;
  }

  int get fileSizeBytes => _fileSizeBytes;
  set fileSizeBytes(int fileSizeBytes) => _fileSizeBytes = fileSizeBytes;
  String get url => _url;
  set url(String url) => _url = url;

  RandomDog.fromJson(Map<String, dynamic> json) {
    _fileSizeBytes = json['fileSizeBytes'];
    _url = json['url'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['fileSizeBytes'] = this._fileSizeBytes;
    data['url'] = this._url;
    return data;
  }
}