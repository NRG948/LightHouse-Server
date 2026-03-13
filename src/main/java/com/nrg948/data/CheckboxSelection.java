package com.nrg948.data;

public class CheckboxSelection {
    private boolean isChecked;
    private String selection;

    public CheckboxSelection() {}

    public CheckboxSelection(boolean isChecked, String selection) {
        this.isChecked = isChecked;
        this.selection = selection;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
}
