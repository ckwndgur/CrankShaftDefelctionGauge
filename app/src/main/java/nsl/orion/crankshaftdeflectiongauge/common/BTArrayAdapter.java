package nsl.orion.crankshaftdeflectiongauge.common;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import nsl.orion.crankshaftdeflectiongauge.R;

/**
 * Created by TienNT on 9/24/2015.
 */
public class BTArrayAdapter extends ArrayAdapter {
    public BTArrayAdapter(Context context, List bluetoothDevices) {
        super(context, 0, bluetoothDevices);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        BluetoothDevice device = (BluetoothDevice) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listviewitem, parent, false);
        }
        // Lookup view for data population
        TextView itemTitle = (TextView) convertView.findViewById(R.id.itemTitle);
        TextView itemsubTitle = (TextView) convertView.findViewById(R.id.itemsubTitle);
        // Populate the data into the template view using the data object
        itemTitle.setText(device.getName());
        itemsubTitle.setText(device.getAddress());
        return convertView;
    }

}
