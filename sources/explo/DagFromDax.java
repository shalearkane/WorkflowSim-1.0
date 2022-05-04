package explo;

import org.cloudbus.cloudsim.Log;
import org.workflowsim.WorkflowParser;

import java.io.File;

public class DagFromDax {
    static String daxPath = "/home/sm/Public/Exploratory/WorkflowSim-1.0/config/dax/Montage_100.xml";
    public static void main(String[] args) {
        File daxFile = new File(daxPath);
        if (!daxFile.exists()) {
            Log.printLine("Warning: Please replace daxPath with the physical path in your working environment!");
            return;
        }
        System.out.println();
    }
}
