package lessons.lesson_001.Ex004;

public class Program {
    public static void main(String[] args) {
//         #region Robot1 demo

        Robot1 robot1 = new Robot1("name_1", 1);


        robot1.level = 100500;
        System.out.printf("%s %d\n", robot1.name, robot1.level);

        System.out.println("_____________________________");

//        #endregion

//        #region processing

        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBIOS();

        System.out.println("_____________________________");

//         #endregion


//        #region Robot2 demo

        Robot2 robot2 = new Robot2("name_2", 1);

        System.out.printf("%s %d\n",
                robot2.getName(), robot2.getLevel());

        robot2.work();
        robot2.work();
        robot2.work();
        robot2.powerOff();

        System.out.println("_____________________________");
//        #endregion

//        #region Robot3 demo

        Robot3 robot3 = new Robot3("name_3");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();

//        #endregion
    }

}
