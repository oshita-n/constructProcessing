constructProcessing  
====

Writable Constract HTTP client for Android.   
## Description
Normal network processing is used try catch sentence.
But it is difficult to understand and complex.  
constructProcessing is construct network processing.  
2 pattern attribute.onSuccess is network process,When success.onError is network process,When failure.  
## How to use  
```gradle
//add gradle(app)
repositories {
    maven { url 'http://raw.github.com/Ooshita/constructProcessing/master/repository/' }
}
dependencies {
    compile 'com.whispon:constructprocessing:1.0.0'
}
```

```java
@Override  
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);
    CPHttp cpHttp = new CPHttp();
    cpHttp.get("http://whispon.com", new OnSuccess() {
        @Override
        public void onSuccess(String response) {
            Log.d("success", response);
        }
    }, new OnFailure() {
        @Override
        public void onFailure(NetworkException e) {
            Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }, progressBar);
}
```

##Lamda version.  
```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  
    ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);
    CPHttp cpHttp = new CPHttp();
    cpHttp.get("http://whispon.com", (String response) -> Log.d("success", response)
    , (NetworkException e) -> Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_LONG).show(), progressBar);
}
```

## Licence
[![License](https://img.shields.io/badge/license-Apache%202-blue.svg)]  
(https://www.apache.org/licenses/LICENSE-2.0)  

## Author

[Ooshita](https://github.com/Ooshita)
