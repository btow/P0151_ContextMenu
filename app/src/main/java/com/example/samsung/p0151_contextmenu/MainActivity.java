package com.example.samsung.p0151_contextmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOutColor, tvOutSize;

    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;

    final int MENU_SIZE_22 = 4;
    final int MENU_SIZE_26 = 5;
    final int MENU_SIZE_30 = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutColor = (TextView) findViewById(R.id.tvOutColor);
        tvOutSize = (TextView) findViewById(R.id.tvOutSize);

        registerForContextMenu(tvOutColor);
        registerForContextMenu(tvOutSize);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        switch (v.getId()) {
            case R.id.tvOutColor :
                menu.add(0, MENU_COLOR_RED, 0, getString(R.string.red));
                menu.add(0, MENU_COLOR_GREEN, 0, getString(R.string.green));
                menu.add(0, MENU_COLOR_BLUE, 0, getString(R.string.blue));
                break;
            case R.id.tvOutSize :
                menu.add(0, MENU_SIZE_22, 0, R.string.size_22);
                menu.add(0, MENU_SIZE_26, 0, R.string.size_26);
                menu.add(0, MENU_SIZE_30, 0, R.string.size_30);
                break;
        }

        super.onCreateContextMenu(menu, v, menuInfo);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case MENU_COLOR_RED :
                tvOutColor.setTextColor(Color.RED);
                tvOutColor.setText(R.string.text_color_red);
                break;
            case MENU_COLOR_GREEN :
                tvOutColor.setTextColor(Color.GREEN);
                tvOutColor.setText(R.string.text_color_green);
                break;
            case MENU_COLOR_BLUE :
                tvOutColor.setTextColor(Color.BLUE);
                tvOutColor.setText(R.string.text_color_blue);
                break;
            case MENU_SIZE_22 :
                tvOutSize.setTextSize(22);
                tvOutSize.setText(R.string.text_size_22);
                break;
            case MENU_SIZE_26 :
                tvOutSize.setTextSize(26);
                tvOutSize.setText(R.string.text_size_26);
                break;
            case MENU_SIZE_30 :
                tvOutSize.setTextSize(30);
                tvOutSize.setText(R.string.text_size_30);
                break;
        }

        return super.onContextItemSelected(item);

    }
}
