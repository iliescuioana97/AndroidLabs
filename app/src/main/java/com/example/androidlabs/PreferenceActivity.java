//package com.example.androidlabs;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.preference.PreferenceManager;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Switch;
//import android.widget.TextView;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//import static android.app.PendingIntent.getActivity;
//
//public class PreferenceActivity extends AppCompatActivity {
////
////    public void writeFileOnInternalStorage(Context mcoContext,String sFileName, String sBody){
////        File file = new File(mcoContext.getFilesDir(),"my_app_dir");
////        if(!file.exists()){
////            file.mkdir();
////        }
////        try{
////            File gpxfile = new File(file, sFileName);
////            FileWriter writer = new FileWriter(gpxfile);
////            writer.append(sBody);
////            writer.flush();
////            writer.close();
////        }
////        catch (Exception e){
////            e.printStackTrace();
////        }
////    }
////
////    public void readFileFromInternalStorage(Context context, String sFileName){
////        String yourFilePath = context.getFilesDir() + "/my_app_dir/preferences.txt";
////        File yourFile = new File(yourFilePath);
////        try {
////            FileInputStream fis = new FileInputStream(yourFilePath);
////            BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
////            Log.d("Internal Storage", bfr.readLine());
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_preference);
//
//        Button save_data_btn = findViewById(R.id.preference_save_button);
//        Button apply_text_btn = findViewById(R.id.preference_apply_text_button);
//
//        String filename = "preferences.txt";
//        String fileContents = "";
//
////        writeFileOnInternalStorage(getApplicationContext(), "preferences.txt", "");
//
//        save_data_btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                TextView textViewMessage = findViewById(R.id.preference_text_view);
//                EditText editText = findViewById(R.id.preference_edit_text);
//                Switch switch1 = findViewById(R.id.preference_switch1);
//
//                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//
//                String message = String.valueOf(editText.getText());
//                Boolean switch_value = switch1.isChecked();
//
//                editor.putString("TEXT_ADDED", message);
//                editor.putBoolean("SWITCH_VALUE", switch_value);
//
//                editor.commit();
//
//                // write on internal storage - preferences.txt file
////                writeFileOnInternalStorage(getApplicationContext(), "preferences.txt", message);
//            }
//        });
//
//        apply_text_btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                TextView textViewMessage = findViewById(R.id.preference_text_view);
//                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//
//                String msg = sharedPreferences.getString(("TEXT_ADDED"), "Not found");
//                String new_msg;
//                Boolean switch_value = sharedPreferences.getBoolean(("SWITCH_VALUE"), true);
//
//                if (switch_value){
//                    new_msg = msg.concat(" - switch on");
//                }
//                else {
//                    new_msg = msg.concat(" - switch off");
//                }
//
//                textViewMessage.setText(new_msg);
//            }
//        });
//
//    }
//}
