package com.nonursis.BookManagementSystem;

public class LibrarySystem {

    private void mainMenu() {
        char key = '0';
        boolean loop = true;
        while(loop) {
            /*
                menu
             */
            System.out.print("please enter a number:");
            key = Utility.readMenuSelection();

            switch(key) {
                case '1':
                    break;
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
