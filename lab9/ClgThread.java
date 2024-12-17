class NameThread extends Thread {
public void run() {
try {
for(int i=0; i<5; i++) {
System.out.println("BMS college of engineering");
Thread.sleep(10000);
}
}
catch (InterruptedException e) {
System.out.println("Interrupted");
}
}
}

class DeptThread extends Thread {
public void run() {

try {
for(int i=0; i<5; i++) {
System.out.println("CSE");
Thread.sleep(2000);
}
}
catch (InterruptedException e) {
System.out.println("Interrupted");
}
}
}



public class ClgThread {
public static void main(String args[]) {
NameThread n1 = new NameThread();
DeptThread d1 = new DeptThread();

n1.start();
d1.start();

System.out.println(n1.isAlive());
System.out.println(d1.isAlive());
}
}
