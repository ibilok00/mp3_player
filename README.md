# MP3 Player App

Welcome to the MP3 Player App, a simple and efficient Java-based application for playing your favorite music files.

![MP3 Player Photo](/AppPhoto.png)

## Features

- **User-Friendly Interface**: The application boasts a clean and intuitive user interface, making it easy for users to navigate and enjoy their music effortlessly.

- **MP3 File Support**: The MP3 Player App supports the playback of standard MP3 audio files, ensuring compatibility with a wide range of music collections.

- **Song Progress Bar**: Keep track of your song's progress with the interactive progress bar, allowing you to skip to specific parts of a track.

- **Play, Pause, and Reset Controls**: Enjoy full control over your music playback with easy-to-use play, pause, and stop buttons.

- **Next & Previous**: Select next or previous song from your folder.

- **Speed**: Drop down menu for speed, where you can select it from 0.25x up to 2.0x.

- **Volume Control**: Adjust the volume to your liking using the built-in volume control slider.


## Installation

```bash
git clone https://github.com/ibilok00/mp3_player.git
```

- After clone, you need to setup JavaFX\
**Help --> Eclipse Marketplace..**\
Once it loads up, search for **e(fx)clipse 3.6.0** and install it.
Now, we have our eclipse set up and the plugins we need.

- Open this page: **https://gluonhq.com/products/javafx/** \
Find the latest version  and click download, once it has downloaded you want to extract it to a folder, it can be any folder, and remember its location.

- Next thing we’ll be doing is creating an user library.\
**Window -- Preferences -- User Libraries -- New -- Call it JavaFX**

- Also, we need to set up the run configuration:\
**Right click on Main class --> Run As --> Run Configurations..**\
Add below part in VM arguments for our application:

- --module-path "YOUR\PATH\lib" --add-modules javafx.controls,javafx.graphics,javafx.fxml,javafx.media\
**"YOUR\PATH\lib"** --> path to extracted folder

---
- **NOTE:** To edit Display.fxml file in GUI option, SceneBuilder must be installed! 

## Dependencies
- This MP3 Player App is built using Java, and it requires Java Runtime Environment (JRE) to run.

## Usage

**Add MP3 Files:**\
Place your MP3 files which you want to play in the "music" folder.

**Play Music:**\
Click on the play button to start enjoying your music.

**Pause:**\
Use the pause button to stop the song.

**Reset:**\
Use this button to reset playing song.

**Navigate Through Songs:**\
Utilize the Next & Previous buttons to skip specific song.

**Adjust Volume:**\
Slide the volume control to set the desired volume level.