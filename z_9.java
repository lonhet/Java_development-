class Furniture {

    private String material;
    public Furniture(String material) {
        this.material = material;}

    public String getMaterial() {
        return material;}

    public void setMaterial(String material) {
        this.material = material;}

    public void display() {
        System.out.println("Материал: " + material);}
}

class Chair extends Furniture {

    private boolean hasBackrest;

    public Chair(String material, boolean hasBackrest) {
        super(material);
        this.hasBackrest = hasBackrest;}

    public boolean isHasBackrest() {
        return hasBackrest;}

    public void setHasBackrest(boolean hasBackrest) {
        this.hasBackrest = hasBackrest;}

    @Override
    public void display() {
        System.out.println("Стул:");
        super.display();
        System.out.println("Наличие спинки: " + (hasBackrest ? "Да" : "Нет"));}
}

class Table extends Furniture {

    private int legsCount;
    public Table(String material, int legsCount) {
        super(material);
        this.legsCount = legsCount;}

    public int getLegsCount() {
        return legsCount;}

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;}

    @Override
    public void display() {
        System.out.println("Стол:");
        super.display();
        System.out.println("Количество ножек: " + legsCount);}
}

class Sofa extends Furniture {

    private int seats;
    public Sofa(String material, int seats) {
        super(material);
        this.seats = seats;}

    public int getSeats() {
        return seats;}

    public void setSeats(int seats) {
        this.seats = seats;}

    @Override
    public void display() {
        System.out.println("Диван:");
        super.display();
        System.out.println("Количество мест: " + seats);}
}

class FurnitureStore {

    private Furniture[] items;
    private int size;

    public FurnitureStore() {
        items = new Furniture[10];
        size = 0;
    }

    public boolean add(Furniture furniture) {
        if (size >= items.length || furniture == null) {
            return false;
        }
        items[size++] = furniture;
        return true;}

    public Furniture pop() {
        if (size == 0) {
            return null;
            }

        Furniture removed = items[--size];
        items[size] = null;
        return removed;}

    public void countByType() {
        int chairs = 0;
        int tables = 0;
        int sofas = 0;

        for (int i = 0; i < size; i++) {
            if (items[i] instanceof Chair) chairs++;
            else if (items[i] instanceof Table) tables++;
            else if (items[i] instanceof Sofa) sofas++;}

        System.out.println("Стулья: " + chairs);
        System.out.println("Столы: " + tables);
        System.out.println("Диваны: " + sofas);
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            items[i].display();
            System.out.println();}}
}

public class Main {

    public static void main(String[] args) {

        FurnitureStore store = new FurnitureStore();
        store.add(new Chair("Дерево", true));
        store.add(new Table("Металл", 4));
        store.add(new Sofa("Кожа", 3));
        store.add(new Chair("Пластик", false));
        System.out.println("Содержимое магазина:");
        store.displayAll();
        System.out.println("Подсчёт типов:");
        store.countByType();
        System.out.println("\nУдалён объект:");
        Furniture removed = store.pop();
        if (removed != null) {
            removed.display();}}
}
