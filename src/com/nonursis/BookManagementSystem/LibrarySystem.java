package com.nonursis.BookManagementSystem;

public class LibrarySystem {


    /**
     * 1.display all catalogItems
     */
    public void displayCatalogItems() {
    }

    /**
     * 2.display detail info of one item by little user input
     * @param fileName
     */
    public void loadCatalogFromFile(String fileName) {

    }

    /**
     * 5.save all catalogItems to file with the file name user input
     * @param fileName
     */
    public void saveCatalogToFile(String fileName) {

    }

    private void mainMenu() {
        char key = '0';
        boolean loop = true;
        while(loop) {
            /*
                menu
             */
            System.out.println("1.display all catalogItems");
            System.out.println("2.display detail info of one item by little user input");
            System.out.println("3.add a new Book/Record");
            System.out.println("4.delete a Book/Record by title or index number user input");
            System.out.println("5.save all catalogItems to file with the file name user input");
            System.out.print("please enter a number:");
            key = Utility.readMenuSelection();

            switch(key) {
                case '1':
                    displayCatalogItems();
                    break;
                case '2':
                    System.out.print("please input one item:");
                    String item = Utility.readString(60);
                    loadCatalogFromFile(item);
                case '3':
                    System.out.println("add a new Book/Record");
                case '0':
                    System.out.println("exit system!");
                    loop = false;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new LibrarySystem().mainMenu();
    }
}
