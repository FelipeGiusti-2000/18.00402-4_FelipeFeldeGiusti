//Felipe Felde Giusti, RA: 18.00402-4
package giusti.felipe;

import giusti.felipe.tests.TestDAO;

public class Main {

    public static void main(String[] args) {

        RunApplication runApplication = new RunApplication();
        runApplication.run();

        TestDAO testDAO = new TestDAO();
        testDAO.run();
    }
}
