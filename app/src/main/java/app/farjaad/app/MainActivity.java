package app.farjaad.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity  {

private Spinner spinner;
private static final String[]buildings = {
        "Choose Building",
        "Arts Lecture Hall (AL)",
        "B.C. Matthews Hall (BMH)",
        "Biology 1 (B1)",
        "Biology 2 (B2)",
        "Carl A. Pollock: Hall (CPH)",
        "EIT",
        "Chemistry 2 (C2)",
        "Columbia Icefield (CIF)",
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
        "Laurier",
        "Lyle Hallman Institute for Health Promotion",
        "Mathematics and Computer (MC)",
        "Mathematics 3",
        "Mackenzie King Village (MKV)",
        "Modern Languages (ML)",
        "Needles Hall (NH)",
        "Optometry (OPT)",
        "Physical Activities Complex (PAC)",
        "Physics (PHY)",
        "Psychology,Anthropology,Sociology (PAS)",
        "Quantum Nano Centre (QNC)",
        "Renison University College",
        "Ron Eydt Village (REV)",
        "St. Jerome's University (SJU)",
        "St. Jerome's Sweeney Hall",
        "St. Paul's University College",
        "South Campus Hall (SCH)",
        "Student Life Centre (SLC)",
        "Student Village 1 (V1)",
        "University Club (UC)",
        "William M. Tatham Centre"
};
        private static final String [] stops = {
                "UW BC Matthews Hall- 1122",
                "UW BC Matthews Hall- 2519",
                "University Club- 2518",
                "UW- Biology - 2530",
                "UW- Needles Hall- 2517",
                "UW- Environment 3- 2516",
                "UW- South Campus Hall 2515",
                "University-Seagram - 2676",
                "University-Seagram - 2781",
                "University-Seagram - 3683",
                "UW- Engineering 1124",
                "UW - Davis Centre 1123",
                "Columbia/ UW 3899",
                "Columbia- Village 1 1120",
                "Columbia- Village 1 1096",
                "Columbia- REV 1097",
                "Columbia-REV 1119",
                "Columbia- UW Optometry 1094",
                "University/Phillip 2675",
                "University/Philip 3943",
                "Laurier- 3620",
                "Laurier- 3619",
                "Laurier- 1167"
        };
        private Button getStop;
        private TextView stopInfo;


@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getStop = (Button)findViewById(R.id.getStop);
        spinner = (Spinner)findViewById(R.id.spinner);
        stopInfo = (TextView)findViewById(R.id.stopInfo);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item, buildings);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                        switch (position) {
                                case 0:
                                        stopInfo.setText("Choose Building Please!");
                                        break;
                                case 1:
                                        // Whatever you want to happen when the first item gets selected
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[6]);
                                        break;
                                case 2:
                                        // Whatever you want to happen when the second item gets selected
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[0] + "\n" + stops[1]);
                                        break;
                                case 3:
                                        // Whatever you want to happen when the thrid item gets selected
                                        break;
                                case 4:

                                        break;
                                case 5:

                                        break;
                                case 6:

                                        break;
                                case 7:

                                        break;
                                case 8:

                                        break;
                                case 9:

                                        break;
                                case 10:

                                        break;
                                case 11:

                                        break;
                                case 12:

                                        break;
                                case 13:

                                        break;
                                case 14:

                                        break;
                                case 15:

                                        break;
                                case 16:

                                        break;
                                case 17:

                                        break;
                                case 18:

                                        break;
                                case 19:

                                        break;
                                case 20:

                                        break;
                                case 21:

                                        break;
                                case 22:

                                        break;
                                case 23:

                                        break;
                                case 24:

                                        break;
                                case 25:

                                        break;
                                case 26:

                                        break;
                                case 27:

                                        break;
                                case 28:

                                        break;
                                case 29:

                                        break;
                                case 30:

                                        break;
                                case 31:

                                        break;
                                case 32:

                                        break;
                                case 33:

                                        break;
                                case 34:

                                        break;
                                case 35:

                                        break;
                                case 36:

                                        break;
                                case 37:

                                        break;
                                case 38:

                                        break;
                                case 39:

                                        break;
                                case 40:

                                        break;
                                case 41:

                                        break;
                                case 42:

                                        break;
                                case 43:

                                        break;
                                case 44:

                                        break;
                                case 45:

                                        break;
                                case 46:

                                        break;
                                case 47:

                                        break;
                                case 48:

                                        break;



                        }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                        // your code here
                }

        });

        }

//public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
//
//        switch (position) {
//        case 0:
//        // Whatever you want to happen when the first item gets selected
//                stopInfo.setText("UW BC Matthews Hall- 1122\n");
//        break;
//        case 1:
//        // Whatever you want to happen when the second item gets selected
//        break;
//        case 2:
//        // Whatever you want to happen when the thrid item gets selected
//        break;
//
//        }
//        }


}