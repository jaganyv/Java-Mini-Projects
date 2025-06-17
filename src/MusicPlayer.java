import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class MusicPlayer {

            private Clip clip;
            private AudioInputStream audioStream;
            private long pausePosition = 0;

            public MusicPlayer(String filePath) {
                try {
                    File audioFile = new File(filePath);
                    audioStream = AudioSystem.getAudioInputStream(audioFile);
                    clip = AudioSystem.getClip();
                    clip.open(audioStream);
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            public void play() {
                clip.setMicrosecondPosition(pausePosition);
                clip.start();
                System.out.println("Playing...");
            }

            public void pause() {
                pausePosition = clip.getMicrosecondPosition();
                clip.stop();
                System.out.println("Paused...");
            }

            public void stop() {
                clip.stop();
                clip.setMicrosecondPosition(0);
                pausePosition = 0;
                System.out.println("Stopped...");
            }

            public void close() {
                clip.close();
                try {
                    audioStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing stream: " + e.getMessage());
                }
            }
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter WAV file path: ");
                String filePath = scanner.nextLine();

                MusicPlayer player = new MusicPlayer(filePath);

                while (true) {
                    System.out.println("\nCommands: (1) Play (2) Pause (3) Stop (4) Exit");
                    int command = scanner.nextInt();

                    switch (command) {
                        case 1: player.play(); break;
                        case 2: player.pause(); break;
                        case 3: player.stop(); break;
                        case 4:
                            player.close();
                            System.out.println("Exiting...");
                            return;
                        default:
                            System.out.println("Invalid command.");
                    }
                }
            }
        }


