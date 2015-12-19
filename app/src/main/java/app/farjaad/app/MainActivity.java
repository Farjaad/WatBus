package app.farjaad.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends Activity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

private Spinner spinner;
private static final String[]paths = {
        "Arts Lecture Hall (AL)",
        "B.C. Matthews Hall (BMH)",
        "Biology 1 (B1)",
        "Biology 2 (B2)",
        "Carl A. Pollock: Hall (CPH)",
        "Centre for Environmental & Information Technology (EIT)",
        "Chemistry 2 (C2)",
        "Columbia Icefield",
        "Conrad Grebel University College",
        "Dana Porter Arts Library (LIB)",
        "Doug Wright Engineering Building",
        "W.G. Davis Computer Research Centre (DC)",
        "J.R. Coutts Engineering Lecture Hall (RCH)",
        "Earth Sciences & Chemistry 1 (ESC)",
        "East Campus Hall (ECH)",
        "Engineering 2 (E2)",
        "Engineering 3 (E3)",
        "Engineering 5 (E5)",
        "Engineering 6 (E6)",
        "Environment 1 (EV1)",
        "Environment 2 (EV2)",
        "Environment 3 (EV3)",
        "Federation Hall (FED)",
        "Graduate House (GH)",
        "Hagey Hall of the Humanities (HH)",
        "Health Services (HS)",
        "Lyle Hallman Institute for Health Promotion",
        "Mathematics and Computer (MC)",
        "Mathematics 3",
        "Mackenzie King Village (MKV)",
        "Modern Languages (ML)",
        "Needles Hall (NH)",
        "Optometry (OPT)",
        "Physical Activities Complex (PAC)",
        "Physics (PHY)",
        "Psychology, Anthropology, and Sociology (PAS)",
        "Quantum Nano Centre (QNC)",
        "Renison University College",
        "Ron Eydt Village (REV)",
        "St. Jerome's University (SJU)",
        "St. Jerome's Sweeney Hall (Women's Residence)",
        "St. Paul's University College",
        "South Campus Hall (SCH)",
        "Student Life Centre (SLC)",
        "Student Village 1 (V1)",
        "University Club (UC)",
        "William M. Tatham Centre for Co-operative Education & Career Services"
};

@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item, paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        }

public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
        case 0:
        // Whatever you want to happen when the first item gets selected
        break;
        case 1:
        // Whatever you want to happen when the second item gets selected
        break;
        case 2:
        // Whatever you want to happen when the thrid item gets selected
        break;

        }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }

        @Override
        public void onClick(View v) {

        }
}