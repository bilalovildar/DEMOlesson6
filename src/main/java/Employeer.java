import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

public class Employeer {
    private String FIO;
    private String quality;
    private String email;
    private int tel;
    private int salary;
    private int year;

    public String getFIO() {
        return FIO;
    }
    public void qualiry(String quality) {
        this.quality=quality;
    }

    public Employeer(String FIO, String quality, String email, int tel, int salary, int year) {
        this.FIO = FIO;
        this.quality=quality;
        this.email=email;
        this.tel=tel;
        this.salary=salary;
        this.year=year;
    }

        // это метод вывода в консоль (как по заданию)
    public void print(){
        System.out.println(FIO+" "+quality+" "+email+" "+tel+" "+salary+" "+year);
    }

    public static void main(String[] args) {
        Employeer[] empArray = new Employeer[5]; // Вначале объявляем массив объектов
        empArray[0] = new Employeer("Ivanov Ivan", "Engineer1", "i@mailbox.com", 312312, 30000, 30); // потом для каждой ячейки массива задаем объект
        empArray[1] = new Employeer("Sidorov Gena", "Engineer2", "ivan@mailbox.com", 892312312, 10000, 33); // потом для каждой ячейки массива задаем объект
        empArray[2] = new Employeer("Ivan Ivanqqq", "Engineer3", "ivi@mailbx.com", 8312312, 80000, 45); // потом для каждой ячейки массива задаем объект
        empArray[3] = new Employeer("Gosha Ivan", "Engineer4", "an@mailbox.com", 89231212, 40000, 69); // потом для каждой ячейки массива задаем объект
        empArray[4] = new Employeer("Roran Dylan", "Engineer5", "n@mail.com", 8923112, 50000, 40); // потом для каждой ячейки массива задаем объект

        // если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].year > 40) {empArray[i].print();}
        }
    }
}

