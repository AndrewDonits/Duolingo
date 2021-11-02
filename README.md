# Duolingo
Automation Self-Project By - Andrey Donits

# Instructions for executing the tests cases:
The class where the test are is called "Sanity" and its path is: src/test/java/Sanity.java <br />
To execute on your computer you need to make sure you've prepared the following things: <br /><br />

First of all you would like to get the capabilities of your device. You can use an emulator or a real device. <br />
If you are going to use a real device make sure it is an Android device, because the project is suitable currently for Android devices only. <br />
If your case is a real device, connect it to your computer and accept bug debugging and all required authorizations in developer options on phone settings.

You will need the following details:
1. UDID - You can run the following command in the cmd: "adb devices", and copy it from there. (The left value of your desired device). <br />
After that paste it in src/main/Configuration/properties.properties file under the following key: "EmulatorUUID"

2. Install Duolingo app on your device. You can drag the apk file to your emulator or just install it on the real device you are going to use. <br />
Link to download the app: https://drive.google.com/drive/folders/1ueeKTOgXRItQAu3FrxdNHNSZG0cDsnIr?usp=sharing. <br />
Don't worry the app won't harm your device.

3. Install appium client or appium server and make sure it is running on port number: 4723 (it is the default one, so you don't need to change anything)

4. Choose a test or run all tests together

# Enjoy!
