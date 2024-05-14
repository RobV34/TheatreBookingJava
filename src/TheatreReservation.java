// Theatre Reservation Program
// Two Sections A and B with 10 rows each containing 8 seats per row
// Rob Vatcher
// May 15th, 2024

import java.util.Arrays;

public class TheatreReservation {
    // 2D arrays representing the seating sections
    private String[][] sectionA;
    private String[][] sectionB;

    // Constructor to initialize the seating arrays
    public TheatreReservation() {
        sectionA = new String[10][8]; // Section A has 10 rows and 8 seats per row
        sectionB = new String[10][8]; // Section B has 10 rows and 8 seats per row
        // Initialize all seats as "Available"
        for (int i = 0; i < 10; i++) {
            Arrays.fill(sectionA[i], "Available");
            Arrays.fill(sectionB[i], "Available");
        }
    }

    // Method to reserve a seat in the specified section, row, and seat
    public void reserveSeat(char section, int row, int seat) {
        row--; // Adjust row to be 0-indexed
        seat--; // Adjust seat to be 0-indexed
        if (section == 'A') { // Check if the section is A
            // Check if the seat is available
            if (sectionA[row][seat].equals("Available")) {
                sectionA[row][seat] = "Reserved"; // Mark the seat as reserved
                System.out.println("Seat reserved in section A, row " + (row + 1) + ", seat " + (seat + 1));
            } else {
                // Notify if the seat is already reserved
                System.out.println("Seat already reserved in section A, row " + (row + 1) + ", seat " + (seat + 1));
            }
        } else if (section == 'B') { // Check if the section is B
            // Check if the seat is available
            if (sectionB[row][seat].equals("Available")) {
                sectionB[row][seat] = "Reserved"; // Mark the seat as reserved
                System.out.println("Seat reserved in section B, row " + (row + 1) + ", seat " + (seat + 1));
            } else {
                // Notify if the seat is already reserved
                System.out.println("Seat already reserved in section B, row " + (row + 1) + ", seat " + (seat + 1));
            }
        } else {
            // Notify if an invalid section is specified
            System.out.println("Invalid section");
        }
    }

    // Method to cancel a reservation in the specified section, row, and seat
    public void cancelReservation(char section, int row, int seat) {
        row--; // Adjust row to be 0-indexed
        seat--; // Adjust seat to be 0-indexed
        if (section == 'A') { // Check if the section is A
            // Check if the seat is reserved
            if (sectionA[row][seat].equals("Reserved")) {
                sectionA[row][seat] = "Available"; // Mark the seat as available
                System.out.println("Reservation cancelled in section A, row " + (row + 1) + ", seat " + (seat + 1));
            } else {
                // Notify if there is no reservation to cancel
                System.out.println("No reservation to cancel in section A, row " + (row + 1) + ", seat " + (seat + 1));
            }
        } else if (section == 'B') { // Check if the section is B
            // Check if the seat is reserved
            if (sectionB[row][seat].equals("Reserved")) {
                sectionB[row][seat] = "Available"; // Mark the seat as available
                System.out.println("Reservation cancelled in section B, row " + (row + 1) + ", seat " + (seat + 1));
            } else {
                // Notify if there is no reservation to cancel
                System.out.println("No reservation to cancel in section B, row " + (row + 1) + ", seat " + (seat + 1));
            }
        } else {
            // Notify if an invalid section is specified
            System.out.println("Invalid section");
        }
    }

    // Method to traverse and display the current status of seats in both sections
    public void traverse() {
        System.out.println("Section A:");
        for (int i = 0; i < 10; i++) { // Loop through each row
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < 8; j++) { // Loop through each seat in the row
                System.out.print("Seat " + (j + 1) + " - " + sectionA[i][j] + "; ");
            }
            System.out.println(); // New line for the next row
        }

        System.out.println("Section B:");
        for (int i = 0; i < 10; i++) { // Loop through each row
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < 8; j++) { // Loop through each seat in the row
                System.out.print("Seat " + (j + 1) + " - " + sectionB[i][j] + "; ");
            }
            System.out.println(); // New line for the next row
        }
    }

    public static void main(String[] args) {
        TheatreReservation theatre = new TheatreReservation();

        // Reserve some seats
        theatre.reserveSeat('A', 2, 3); // Reserve seat in section A, row 2, seat 3
        theatre.reserveSeat('B', 5, 6); // Reserve seat in section B, row 5, seat 6

        // Cancel a reservation
        theatre.cancelReservation('A', 2, 3); // Cancel reservation in section A, row 2, seat 3

        // Traverse and display seat status
        theatre.traverse(); // Display the current status of seats in both sections
    }
}


