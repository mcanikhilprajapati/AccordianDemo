package canvas.com.accordiandemo.model;


public class Category {

    private String id;
    private String name;
    private boolean open=false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Category() {

    }

    public Category(String id, String name, boolean open) {

        this.id = id;
        this.name = name;
        this.open = open;
    }
}
