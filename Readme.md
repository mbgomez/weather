## How to run / build / test project

1.- Open android studio
2.- In the main menu click on VCS>Checkout from version control>Git
3.- Fill the following input text with the next information:
3.1.- Git repository URL -->  https://github.com/mbgomez/weather.git
3.2.- Parent directory --> 'Where your workspace is, example C:\workspace'
3.3.- Directory name --> 'Name of the directory where you want to download the project, example: Weather'
4.- Built project with gradle file
5.- Create an android emulator with API 21 or higher (I use genymotion 'Custom phone - 5.0.0 - Api 21 - 768x1280)
6.- Run weather project
7.- For testing run TestApp inside AndroidTest folder

## Improvements

- Add all the info returned for the API into details screen
- Create tabs to divide shown info by days
- Create settings to configure format of data
- Create charts in detail screen
- Create option to see other cities weather forecast
- Use gps to show user position forecast
- Check Api options to impruve app
- refactor
- document
- Run how to use app first time user run the app