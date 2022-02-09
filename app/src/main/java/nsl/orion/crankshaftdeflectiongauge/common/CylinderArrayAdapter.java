package nsl.orion.crankshaftdeflectiongauge.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

import nsl.orion.crankshaftdeflectiongauge.R;

/**
 * Created by Hai on 9/28/2015.
 */
public class CylinderArrayAdapter extends ArrayAdapter {

    private static DecimalFormat decimalFormat = new DecimalFormat();

    public CylinderArrayAdapter(Context context, List<Cylinder> cylinderList) {
        super(context, 0, cylinderList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setRoundingMode(RoundingMode.CEILING);

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listviewtable, parent, false);
        }

        TextView cylName = (TextView) convertView.findViewById(R.id.cylinderorder);
        TextView cylBP = (TextView) convertView.findViewById(R.id.crankBP);
        TextView cylP = (TextView) convertView.findViewById(R.id.crankP);
        TextView cylT = (TextView) convertView.findViewById(R.id.crankT);
        TextView cylE = (TextView) convertView.findViewById(R.id.crankE);
        TextView cylBE = (TextView) convertView.findViewById(R.id.crankBE);
        TextView cylH = (TextView) convertView.findViewById(R.id.crankH);
        TextView cylV = (TextView) convertView.findViewById(R.id.crankV);

        Cylinder cylinder = (Cylinder) getItem(position);

        cylName.setText("Cylinder " + cylinder.getOrder());
        cylBP.setText(cylinder.getBp().toString());
        cylP.setText(cylinder.getP().toString());
        cylT.setText(cylinder.getT().toString());
        cylE.setText(cylinder.getE().toString());
        cylBE.setText(cylinder.getBe().toString());

        float h = cylinder.getE() - cylinder.getP();
        float v = cylinder.getT() - ((cylinder.getBp() + cylinder.getBe()) / 2);

        cylH.setText(decimalFormat.format(h));
        cylV.setText(decimalFormat.format(v));

        return convertView;
    }
}
