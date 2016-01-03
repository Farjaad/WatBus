package app.farjaad.app;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity  {

private Spinner spinner;
private static final String[]buildings = {
        "Choose Building",//0
        "Arts Lecture Hall (AL)",//1
        "B.C. Matthews Hall (BMH)",//2
        "Biology 1 (B1)",//3
        "Biology 2 (B2)",//4
        "Carl A. Pollock: Hall (CPH)",//5
        "EIT",//6
        "Chemistry 2 (C2)",//7
        "Columbia Icefield (CIF)",//8
        "Conrad Grebel University College",//9
        "Dana Porter Arts Library (LIB)",//10
        "Doug Wright Engineering Building",//11
        "W.G. Davis Computer Research Centre (DC)",//12
        "J.R. Coutts Engineering Lecture Hall (RCH)",//13
        "Earth Sciences & Chemistry 1 (ESC)",//14
        "East Campus Hall (ECH)",//15
        "Engineering 2 (E2)",//16
        "Engineering 3 (E3)",//17
        "Engineering 5 (E5)",//18
        "Engineering 6 (E6)",//19
        "Environment 1 (EV1)",//20
        "Environment 2 (EV2)",//21
        "Environment 3 (EV3)",//22
        "Federation Hall (FED)",//23
        "Graduate House (GH)",//24
        "Hagey Hall of the Humanities (HH)",//25
        "Health Services (HS)",//26
        "Laurier",//27
        "Lyle Hallman Institute for Health Promotion",//28
        "Mathematics and Computer (MC)",//29
        "Mathematics 3",//30
        "Mackenzie King Village (MKV)",//31
        "Modern Languages (ML)",//32
        "Needles Hall (NH)",//33
        "Optometry (OPT)",//34
        "Physical Activities Complex (PAC)",//35
        "Physics (PHY)",//36
        "Psychology,Anthropology,Sociology (PAS)",//37
        "Quantum Nano Centre (QNC)",//38
        "Renison University College",//39
        "Ron Eydt Village (REV)",//40
        "St. Jerome's University (SJU)",//41
        "St. Paul's University College",//42
        "South Campus Hall (SCH)",//43
        "Student Life Centre (SLC)",//44
        "Student Village 1 (V1)",//45
        "University Club (UC)",//46
        "UWP",//47
        "William M. Tatham Centre"//48
};
        private static final String [] stops = {
                "UW BC Matthews Hall- 1122",//0
                "UW BC Matthews Hall- 2519",//1
                "University Club- 2518",//2
                "UW- Biology - 2530",//3
                "UW- Needles Hall- 2517",//4
                "UW- Environment 3- 2516",//5
                "UW- South Campus Hall 2515",//6
                "University-Seagram - 2676",//7
                "University-Seagram - 2781",//8
                "University-Seagram - 3683",//9
                "UW- Engineering 1124",//10
                "UW - Davis Centre 1123",//11
                "Columbia/ UW 3899",//12
                "Columbia/Village 1 1120",//13
                "Columbia/Village 1 1096",//14
                "Columbia/REV 1097",//15
                "Columbia/REV 1119",//16
                "Columbia/UW Optometry 1094",//17
                "University/Phillip 2675",//18
                "University/Philip 3943",//19
                "Laurier- 3620",//20
                "Laurier- 3619",//21
                "Laurier- 1167",//22
                "Columbia/ UW 3898",//23
                "UW/Phillip- 3947"//24
        };
        private Button getStop;
        private TextView stopInfo;
        private TextView userInfo;
        private ImageView grt;
        private LinearLayout layout;


@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);

        //getStop = (Button)findViewById(R.id.getStop);
        layout = (LinearLayout)findViewById(R.id.linearLayout);
        spinner = (Spinner)findViewById(R.id.spinner);
        stopInfo = (TextView)findViewById(R.id.stopInfo);
        grt = (ImageView)findViewById(R.id.phone_icon);
        userInfo = (TextView)findViewById(R.id.text);
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
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[6]);
                                        break;
                                case 2:

                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[0] + "\n" + stops[1]);
                                        break;
                                case 3:

                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[4]);
                                        break;
                                case 4:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[4]);
                                        break;
                                case 5:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[10]);
                                        break;
                                case 6:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[11]);
                                        break;
                                case 7:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[11]);
                                        break;
                                case 8:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[12] + "\n" + stops[23]);
                                        break;
                                case 9:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        //
                                        break;
                                case 10:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[6]);
                                        break;
                                case 11:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[10]);
                                        break;
                                case 12:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[11]);
                                        break;
                                case 13:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[10]);
                                        break;
                                case 14:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[11]);
                                        //
                                        break;
                                case 15:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[24]);
                                        break;
                                case 16:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[10]);
                                        break;
                                case 17:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[10]);
                                        break;
                                case 18:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[11]);
                                        break;
                                case 19:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[11] + "\n" + stops[24]);
                                        break;
                                case 20:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        break;
                                case 21:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        break;
                                case 22:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        break;
                                case 23:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[2]);
                                        break;
                                case 24:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[10]);
                                        break;
                                case 25:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[6] + "\n" + stops[10]);
                                        break;
                                case 26:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[4]);
                                        //
                                        break;
                                case 27:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[22] + "\n" + stops[21] + "\n" + stops[20]);
                                        break;
                                case 28:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[0] + "\n" + stops[1]);
                                        break;
                                case 29:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[11]);
                                        break;
                                case 30:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[11]);
                                        break;
                                case 31:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[15] + "\n" + stops[16]);
                                        break;
                                case 32:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        break;
                                case 33:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[4]);
                                        break;
                                case 34:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[17] + "\n" + stops[23]);
                                        break;
                                case 35:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[2]);
                                        break;
                                case 36:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[10]);
                                        break;
                                case 37:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        break;
                                case 38:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[4]);
                                        break;
                                case 39:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        break;
                                case 40:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[15] + "\n" + stops[16]);
                                        break;
                                case 41:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        break;
                                case 42:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[5]);
                                        //
                                        break;
                                case 43:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[6] + "\n" + stops[10]);
                                        break;
                                case 44:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[4]);
                                        break;
                                case 45:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[4]);
                                        break;
                                case 46:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[2]);
                                        break;
                                case 47:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[18] + "\n" + stops[19]);
                                        break;
                                case 48:
                                        stopInfo.setText("Bus Stop Building and Number:\n"
                                                + "\n " + stops[6]);
                                        break;


                        }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                        // your code here
                }


        });

        grt.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        // Perform action on click
                }
        });

        stopInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        // Perform action on click
                }
        });

        userInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        // Perform action on click
                }
        });

        layout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        // Perform action on click
                }
        });

        }
}