/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;


public class MotorPH {

    public static void main(String[] args){

        System.out.println("Welcome to MotorPH Payroll System!");
        Scanner s = new Scanner(System.in);

        // Employee arrays
        String[] employeeNames = {
                "Manuel III Garcia", "Antonio Lim", "Bianca Sofia Aquino", "Isabella Reyes",
                "Eduard Hernandez", "Andrea Mae Villanueva", "Brad San Jose", "Alice Romualdez",
                "Rosie Atienza", "Roderick Alvaro", "Anthony Salcedo", "Josie Lopez", "Martha Farala",
                "Leila Martinez", "Fredrick Romualdez", "Christian Mata", "Selena De Leon", "Allison San Jose",
                "Cydney Rosario", "Mark Bautista", "Darlene Lazaro", "Kolby Delos Santos", "Vella Santos",
                "Tomas Del Rosario", "Jacklyn Tolentino", "Percival Gutierrez", "Garfield Manalaysay",
                "Lizeth Villegas", "Carol Ramos", "Emelia Maceda", "Delia Aguilar", "John Rafael Castro",
                "Carlos Ian Martinez", "Beatriz Santos"
        };

        String[] employeeBirthdays = {
                "10/11/1983", "06/19/1988", "08/04/1989", "06/16/1994", "09/23/1989", "02/14/1988", "03/15/1996",
                "05/14/1992", "09/24/1948", "03/30/1988", "09/14/1993", "01/14/1987", "01/11/1942", "07/11/1970",
                "03/10/1985", "10/21/1987", "02/20/1975", "06/24/1986", "10/06/1996", "02/12/1991", "11/25/1985",
                "02/26/1980", "12/31/1983", "12/18/1978", "05/19/1984", "12/18/1970", "08/28/1986", "12/12/1981",
                "08/20/1978", "04/14/1973", "01/27/1989", "02/09/1992", "11/16/1990", "08/07/1990"
        };
        
                String[] employeecontactNumber = {
                    "966-860-270", "171-867-411", "966-889-370", "786-868-477", "088-861-012", "918-621-603", "797-009-261",
                    "983-606-799", "266-036-427", "053-381-386", "070-766-300","478-355-427", "329-034-366", "877-110-749", 
                    "023-079-009", "783-776-744", "975-432-139", "179-075-129", "868-819-912", "683-725-348", "740-721-558", 
                    "739-443-033", "955-879-269", "882-550-989", "675-757-366", "512-899-876","948-628-136", "332-372-215", 
                    "250-700-389", "973-358-041", "529-705-439", "332-424-955", "078-854-208", "526-639-511"
        };
                
                String[] employeeAddress = {
                    "Makati City", "Dasmarinas, Cavite", "Quezon City", "Intramuros, Manila", "Misamis Occidental", "Las Pinas City", 
                    "Tawi-Tawi", "Surigao Del Norte", "Davao Del Norte", "Quezon City", "Santo Tomas, Masbate", "Occidental Mindoro", 
                    "Zamboanga Del Norte", "Maragondon, Quirino", "Pililla, Zambales", "Catigbian, Sulu", "Compostela, Maguindanao", 
                    "IloIlo City", "Tapaz, Quezon", "Palayan, Quirino", "Caloocan City", "Zamboanga Del Sur", "Lanao Del Sur", "Kabankalan, Marinduque",
                    "Malolos, Ifugao", "Davao Del Sur", "Lanao Del Sur", "Dinagat Islands", "IloIlo City", "Nueva Ecija", "Surallah, Cotabato", 
                    "Liloan, Cebu", "Bulala, Camalaniugan", "Metro Manila"
                };

        String[] employeeNumbers = {
                "10001", "10002", "10003", "10004", "10005", "10006", "10007", "10008", "10009", "10010",
                "10011", "10012", "10013", "10014", "10015", "10016", "10017", "10018", "10019", "10020",
                "10021", "10022", "10023", "10024", "10025", "10026", "10027", "10028", "10029", "10030",
                "10031", "10032", "10033", "10034"
        };

        String[] employeePosition = {
                "Chief Executive Officer", "Chief Operating Officer", "Chief Finance Officer", "Chief Marketing Officer",
                "IT Operations and Systems", "HR Manager", "HR Team Leader", "HR Rank and File", "HR Rank and File",
                "Accounting Head", "Payroll Manager", "Payroll Team Leader", "Payroll Rank and File",
                "Payroll Rank and File", "Account Manager", "Account Team Leader", "Account Team Leader",
                "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File",
                "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File",
                "Account Rank and File", "Account Rank and File", "Account Rank and File", "Account Rank and File",
                "Account Rank and File", "Sales & Marketing", "Supply Chain and Logistics", "Customer Service and Relations"
        };

        Integer[] employeeSalary = {
                90000, 60000, 60000, 60000, 52670, 52670, 42975, 22500, 22500, 52670, 50825, 38475, 24000, 24000,
                53500, 42975, 41850, 22500, 22500, 23250, 23250, 24000, 22500, 22500, 24000, 24750, 24750, 24000,
                22500, 22500, 22500, 52670, 52670, 52670
        };

        String enteredCode;
        boolean found = false;

        // This will repeatedly ask the user for the employee code until found
        while (!found) {
            System.out.print("Please enter the employee code: ");
            enteredCode = s.nextLine();

            for (int i = 0; i < employeeNumbers.length; i++) {
                if (employeeNumbers[i].equals(enteredCode)) {
                    // When found, display the employee's information
                    System.out.println("====Employee Information====\n");
                    System.out.println("Employee Number: " + employeeNumbers[i]);
                    System.out.println("Employee Name: " + employeeNames[i]);
                    System.out.println("Birthday: " + employeeBirthdays[i]);
                    System.out.println("Contact Number: " + employeecontactNumber[i]);
                    System.out.println("Address: " + employeeAddress[i]);
                    System.out.println("\n====Salary Information====");
                    System.out.println("Position: " + employeePosition[i]);
                    System.out.println("Basic Salary: " + employeeSalary[i]);
                    // Set found to true to exit the loop
                    found = true;
                    break;
                }
            }

            // If the employee code is not found, prompt the user again
            if (!found) {
                System.out.println("Employee code not found. Please try again.");
            }
        }

        s.close();
    }
}

