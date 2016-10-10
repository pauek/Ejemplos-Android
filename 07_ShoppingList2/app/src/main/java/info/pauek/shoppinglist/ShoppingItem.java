package info.pauek.shoppinglist;

/**
 * Created by pauek on 10/10/16.
 */

public class ShoppingItem {
    private String text;
    private boolean checked;

    public ShoppingItem(String text) {
        this.text = text;
        this.checked = false;
    }

    public ShoppingItem(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void toggleChecked() {
        this.checked = !this.checked;
    }
}
