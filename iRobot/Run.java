package iRobot;

import iHand.SamsungHand;
import iHand.SonyHand;
import iHand.ToshibaHand;
import iHead.SamsungHead;
import iHead.SonyHead;
import iHead.ToshibaHead;
import iLeg.SamsungLeg;
import iLeg.SonyLeg;
import iLeg.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        int max = 0;
        IRobot pasha = new Robot(new SonyHead(12), new SamsungHand(10), new ToshibaLeg(19));
        IRobot vlad = new Robot(new SamsungHead(9), new ToshibaHand(22), new SonyLeg(3));
        IRobot madlin = new Robot(new ToshibaHead(21), new SonyHand(8), new SamsungLeg(11));

        IRobot [] robots = {pasha, vlad, madlin};

        for (IRobot s : robots) {
            s.action();
        }

        System.out.println("Самый дорогой робот с ценой: " + getMaximumPrice(robots, max));
    }

    public static int getMaximumPrice(IRobot [] robots, int max) {
        for (int i = 1; i < robots.length; i++) {

            if (robots[i - 1].getPrice() > robots[i].getPrice()) {
                max = robots[i - 1].getPrice();
                robots[i] = robots[i - 1];

            }
            else {
                max = robots[i].getPrice();
            }

        }

        return max;

    }
}
