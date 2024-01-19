package com.alejandro.ejercicio2.models;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.alejandro.ejercicio2.R;

class ActionModeCallback implements ActionMode.Callback {
    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        mode.getMenuInflater().inflate(R.menu.contextmenu, menu);
        return true;
    }

    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return false;
    }

    @Override
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        // Handle menu item clicks here
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode mode) {
        // Handle Action Mode destruction here
    }
}