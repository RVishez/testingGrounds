public class musicInstruments {
    public String brandName;
    private String color;
    public boolean hasStrings;

    public musicInstruments() {

    }

    public musicInstruments (String brandName, String color, boolean hasStrings) {
        this.brandName = brandName;
        this.color = color;
        this.hasStrings = hasStrings;
    }

    public String getBrandName () {
        return brandName;
    }

    public String setColor (String color) {
        return this.color = color;
    }

    @Override
    public String toString() {
        if (this.getClass().getSimpleName().equals("guitar")) {
            return "Гитара, " + "Бренд инструмента: " + this.brandName + " " + "Цвет инструмента: " + this.color + " " + "Есть струны?" + (this.hasStrings ? " да" : " нет");
        } else if (this.getClass().getSimpleName().equals("dudka")) {
            return "Дудка, " + "Бренд инструмента: " + this.brandName + " " + "Цвет инструмента: " + this.color + " " + "Есть струны?" + (this.hasStrings ? " да" : " нет");
        } else {
            return "Неизвестный инструмент";
        }
    }

}
