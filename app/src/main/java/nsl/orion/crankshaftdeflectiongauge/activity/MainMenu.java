package nsl.orion.crankshaftdeflectiongauge.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import nsl.orion.crankshaftdeflectiongauge.R;


public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_screen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    public void engineList(View view) {
        Intent intent = new Intent(view.getContext(), EngineList.class);
        startActivity(intent);
    }

    public void setting(View view) {
        Intent intent = new Intent(view.getContext(), Setting.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(view.getContext(), About.class);
        startActivity(intent);
    }

    public void result(View view) {
        Intent intent = new Intent(view.getContext(), Result.class);
        startActivity(intent);
    }
}
