package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {
        initializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();

        initializeCompetitors();


    }

    private Track getSelectedTrackFromUser() {
        System.out.println("Please select a track.");
        Scanner scanner = new Scanner(System.in);

        int userChoice;

        try {
            userChoice = scanner.nextInt();
            return tracks[userChoice - 1];
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You have entred an invalid number.");
            // recursion - a method calling itself
            return getSelectedTrackFromUser();
        }
    }







    private void initializeCompetitors() throws Exception {
        int competitorCount = getCompetitorCountFromUser();


        System.out.println("Today competitors are:");


        for (int i = 0; i < competitorCount; i++) {
            Vehicle competitor = new Vehicle();
            competitor.setName("Competitor " + i );
            competitor.setMaxSpeed(300);
            competitor.setMileage(ThreadLocalRandom.current().nextDouble(6,12));
            competitor.setFuelLevel(80);

            System.out.println(competitor);

            competitors.add(competitor);



        }
    }
    private int getCompetitorCountFromUser() throws Exception {
        System.out.println("Please enter number of players.");
        Scanner scanner = new Scanner(System.in);
        try {
             return scanner.nextInt();
    } catch (IndexOutOfBoundsException e) {
            throw new Exception("You have entred an invalid number.");
        }finally {
                System.out.println("Finally block is always executed");
            }
        }



    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Monte Carlo");
        track1.setLength(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Monza");
        track2.setLength(400);

        tracks[1] = track2;
    }

    private void displayTracks() {
        System.out.println("Available tracks:");

        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println(tracks[i].getName() + " - Length: " + tracks[i].getLength() + " km.");

            }


        }
    }
}