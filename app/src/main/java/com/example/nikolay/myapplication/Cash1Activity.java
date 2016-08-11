package com.example.nikolay.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Cash1Activity extends Activity {

    final Context context2 = this;
    private TextView button,button2,button3, button4, button5, button6, button7, button8, button9,
            button10, button11, button12, button13, button14, button15, button16, button17,
            button18, button19,
            button20;

    private TextView final_text, final_text2,final_text3,final_text4,final_text5,final_text6,
            final_text7,final_text8,final_text9,final_text10,final_text11,final_text12,final_text13,final_text14,
            final_text15,final_text16,final_text17,final_text18,final_text19,final_text20;


     /*< color=0xffffff00 > yellow
            < color=0xffffafaf > pink
            < color=0xff00ff00 > green
            < color=0xff00ffff > cyan
            < color=0xff0000ff > blue
            < color=0xffffc800 > orange
            < color=0xffff0000 > red
            < color=0xff808080 > gray
            < color=0xff404040 > darkgray
            < color=0xff000000 > black
            < color=0xffff00ff > maganta*/



    TextView etText1;
    TextView etText2;
    TextView etText3;
    TextView etText4;
    TextView etText5;
    TextView etText6;
    TextView etText7;
    TextView etText8;
    TextView etText9;
    TextView etText10;
    TextView etText11;
    TextView etText12;
    TextView etText13;
    TextView etText14;
    TextView etText15;
    TextView etText16;
    TextView etText17;
    TextView etText18;
    TextView etText19;
    TextView etText20;
    TextView etText21;
    TextView etText22;

    TextView xetText1;
    TextView xetText2;
    TextView xetText3;
    TextView xetText4;
    TextView xetText5;
    TextView xetText6;
    TextView xetText7;
    TextView xetText8;
    TextView xetText9;
    TextView xetText10;
    TextView xetText11;
    TextView xetText12;
    TextView xetText13;
    TextView xetText14;
    TextView xetText15;
    TextView xetText16;
    TextView xetText17;
    TextView xetText18;
    TextView xetText19;
    TextView xetText20;

    EditText aetText1;
    EditText aetText2;
    EditText aetText3;
    EditText aetText4;
    EditText aetText5;
    EditText aetText6;
    EditText aetText7;
    EditText aetText8;
    EditText aetText9;
    EditText aetText10;
    EditText aetText11;
    EditText aetText12;
    EditText aetText13;
    EditText aetText14;
    EditText aetText15;
    EditText aetText16;
    EditText aetText17;
    EditText aetText18;
    EditText aetText19;
    EditText aetText20;

    SharedPreferences sPref;
    final String SAVED_TEXT1 = "saved_text1";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";
    final String SAVED_TEXT5 = "saved_text5";
    final String SAVED_TEXT6 = "saved_text6";
    final String SAVED_TEXT7 = "saved_text7";
    final String SAVED_TEXT8 = "saved_text8";
    final String SAVED_TEXT9 = "saved_text9";
    final String SAVED_TEXT10 = "saved_text10";
    final String SAVED_TEXT11 = "saved_text11";
    final String SAVED_TEXT12 = "saved_text12";
    final String SAVED_TEXT13 = "saved_text13";
    final String SAVED_TEXT14 = "saved_text14";
    final String SAVED_TEXT15 = "saved_text15";
    final String SAVED_TEXT16 = "saved_text16";
    final String SAVED_TEXT17 = "saved_text17";
    final String SAVED_TEXT18 = "saved_text18";
    final String SAVED_TEXT19 = "saved_text19";
    final String SAVED_TEXT20 = "saved_text20";
    final String SAVED_TEXT21 = "saved_text21";
    final String SAVED_TEXT22 = "saved_text22";

    final String SAVED_TEXT91 = "saved_text91";
    final String SAVED_TEXT92 = "saved_text92";
    final String SAVED_TEXT93 = "saved_text93";
    final String SAVED_TEXT94 = "saved_text94";
    final String SAVED_TEXT95 = "saved_text95";
    final String SAVED_TEXT96 = "saved_text96";
    final String SAVED_TEXT97 = "saved_text97";
    final String SAVED_TEXT98 = "saved_text98";
    final String SAVED_TEXT99 = "saved_text99";
    final String SAVED_TEXT910 = "saved_text910";
    final String SAVED_TEXT911 = "saved_text911";
    final String SAVED_TEXT912 = "saved_text912";
    final String SAVED_TEXT913 = "saved_text913";
    final String SAVED_TEXT914 = "saved_text914";
    final String SAVED_TEXT915 = "saved_text915";
    final String SAVED_TEXT916 = "saved_text916";
    final String SAVED_TEXT917 = "saved_text917";
    final String SAVED_TEXT918 = "saved_text918";
    final String SAVED_TEXT919 = "saved_text919";
    final String SAVED_TEXT920 = "saved_text920";

    final String MY_SETTINGS = "saved_text921";

    AlertDialog.Builder ad;
    Context context;

    public Cash1Activity(TextView button) {
        this.button = button;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_cash1);


        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("hasVisited", false);

        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            View promptsView = li.inflate(R.layout.prompt2, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);


            final TextView bill1 = (TextView) findViewById(R.id.editText6);
            final TextView bill2 = (TextView) findViewById(R.id.editText);
            final TextView bill3 = (TextView) findViewById(R.id.editText9);
            final TextView bill4 = (TextView) findViewById(R.id.editText13);
            final TextView bill5 = (TextView) findViewById(R.id.editText17);
            final TextView bill6 = (TextView) findViewById(R.id.editText21);
            final TextView bill7 = (TextView) findViewById(R.id.editText25);
            final TextView bill8 = (TextView) findViewById(R.id.editText29);
            final TextView bill9 = (TextView) findViewById(R.id.editText33);
            final TextView bill10 = (TextView) findViewById(R.id.editText37);
            final TextView bill11 = (TextView) findViewById(R.id.editText8);
            final TextView bill12 = (TextView) findViewById(R.id.editText4);
            final TextView bill13 = (TextView) findViewById(R.id.editText12);
            final TextView bill14 = (TextView) findViewById(R.id.editText16);
            final TextView bill15 = (TextView) findViewById(R.id.editText20);
            final TextView bill16 = (TextView) findViewById(R.id.editText24);
            final TextView bill17 = (TextView) findViewById(R.id.editText28);
            final TextView bill18 = (TextView) findViewById(R.id.editText32);
            final TextView bill19 = (TextView) findViewById(R.id.editText36);
            final TextView bill20 = (TextView) findViewById(R.id.editText40);
            final TextView bill21 = (TextView) findViewById(R.id.tvResult3);
            final TextView bill22 = (TextView) findViewById(R.id.editText41);
            final TextView bill23 = (TextView) findViewById(R.id.textView4);

            final TextView bill24 = (TextView) findViewById(R.id.data1);
            final TextView bill25 = (TextView) findViewById(R.id.data2);
            final TextView bill26 = (TextView) findViewById(R.id.data3);
            final TextView bill27 = (TextView) findViewById(R.id.data4);
            final TextView bill28 = (TextView) findViewById(R.id.data5);
            final TextView bill29 = (TextView) findViewById(R.id.data6);
            final TextView bill30 = (TextView) findViewById(R.id.data7);
            final TextView bill31 = (TextView) findViewById(R.id.data8);
            final TextView bill32 = (TextView) findViewById(R.id.data9);
            final TextView bill33 = (TextView) findViewById(R.id.data10);
            final TextView bill34 = (TextView) findViewById(R.id.data11);
            final TextView bill35 = (TextView) findViewById(R.id.data12);
            final TextView bill36 = (TextView) findViewById(R.id.data13);
            final TextView bill37 = (TextView) findViewById(R.id.data14);
            final TextView bill38 = (TextView) findViewById(R.id.data15);
            final TextView bill39 = (TextView) findViewById(R.id.data16);
            final TextView bill40 = (TextView) findViewById(R.id.data17);
            final TextView bill41 = (TextView) findViewById(R.id.data18);
            final TextView bill42 = (TextView) findViewById(R.id.data19);
            final TextView bill43 = (TextView) findViewById(R.id.data20);

            mDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {


                                    bill1.setText(0 + "");
                                    bill2.setText(0 + "");
                                    bill3.setText(0 + "");
                                    bill4.setText(0 + "");
                                    bill5.setText(0 + "");
                                    bill6.setText(0 + "");
                                    bill7.setText(0 + "");
                                    bill8.setText(0 + "");
                                    bill9.setText(0 + "");
                                    bill10.setText(0 + "");
                                    bill11.setText(0 + "");
                                    bill12.setText(0 + "");
                                    bill13.setText(0 + "");
                                    bill14.setText(0 + "");
                                    bill15.setText(0 + "");
                                    bill16.setText(0 + "");
                                    bill17.setText(0 + "");
                                    bill18.setText(0 + "");
                                    bill19.setText(0 + "");
                                    bill20.setText(0 + "");
                                    bill21.setText(0 + "");
                                    bill22.setText(0 + "");
                                    bill23.setText(0 + "");

                                    bill24.setText("");
                                    bill25.setText("");
                                    bill26.setText("");
                                    bill27.setText("");
                                    bill28.setText("");
                                    bill29.setText("");
                                    bill30.setText("");
                                    bill31.setText("");
                                    bill32.setText("");
                                    bill33.setText("");
                                    bill34.setText("");
                                    bill35.setText("");
                                    bill36.setText("");
                                    bill37.setText("");
                                    bill38.setText("");
                                    bill39.setText("");
                                    bill40.setText("");
                                    bill41.setText("");
                                    bill42.setText("");
                                    bill43.setText("");
                                }
                            });
            AlertDialog alertDialog = mDialogBuilder.create();
            alertDialog.show();


            long mills = 70L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            // выводим нужную активность
            // напр.
            //Intent intent = new Intent(this, Main2Activity.class);
           // startActivity(intent);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", true);
            e.commit(); // не забудьте подтвердить изменения
        }

        //Инициализируем элементы:
        button = (TextView) findViewById(R.id.data1);
        button2 = (TextView) findViewById(R.id.data2);
        button3 = (TextView) findViewById(R.id.data3);
        button4 = (TextView) findViewById(R.id.data4);
        button5 = (TextView) findViewById(R.id.data5);
        button6 = (TextView) findViewById(R.id.data6);
        button7 = (TextView) findViewById(R.id.data7);
        button8 = (TextView) findViewById(R.id.data8);
        button9 = (TextView) findViewById(R.id.data9);
        button10 = (TextView) findViewById(R.id.data10);
        button11 = (TextView) findViewById(R.id.data11);
        button12 = (TextView) findViewById(R.id.data12);
        button13 = (TextView) findViewById(R.id.data13);
        button14 = (TextView) findViewById(R.id.data14);
        button15 = (TextView) findViewById(R.id.data15);
        button16 = (TextView) findViewById(R.id.data16);
        button17 = (TextView) findViewById(R.id.data17);
        button18 = (TextView) findViewById(R.id.data18);
        button19 = (TextView) findViewById(R.id.data19);
        button20 = (TextView) findViewById(R.id.data20);

        final_text = (TextView) findViewById(R.id.data1);
        final_text2 = (TextView) findViewById(R.id.data2);
        final_text3 = (TextView) findViewById(R.id.data3);
        final_text4 = (TextView) findViewById(R.id.data4);
        final_text5 = (TextView) findViewById(R.id.data5);
        final_text6 = (TextView) findViewById(R.id.data6);
        final_text7 = (TextView) findViewById(R.id.data7);
        final_text8 = (TextView) findViewById(R.id.data8);
        final_text9 = (TextView) findViewById(R.id.data9);
        final_text10 = (TextView) findViewById(R.id.data10);
        final_text11 = (TextView) findViewById(R.id.data11);
        final_text12 = (TextView) findViewById(R.id.data12);
        final_text13 = (TextView) findViewById(R.id.data13);
        final_text14 = (TextView) findViewById(R.id.data14);
        final_text15 = (TextView) findViewById(R.id.data15);
        final_text16 = (TextView) findViewById(R.id.data16);
        final_text17 = (TextView) findViewById(R.id.data17);
        final_text18 = (TextView) findViewById(R.id.data18);
        final_text19 = (TextView) findViewById(R.id.data19);
        final_text20 = (TextView) findViewById(R.id.data20);



        //Добавляем слушателя нажатий по кнопке Button:
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }

        }

        );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text2.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text3.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text4.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text5.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text6.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text7.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text8.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text9.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text10.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text11.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text12.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text13.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text14.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text15.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text16.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text17.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text18.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text19.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LayoutInflater li = LayoutInflater.from(context2);
                View promptsView = li.inflate(R.layout.prompt, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                mDialogBuilder.setView(promptsView);
                final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        final_text20.setText(userInput.getText());
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = mDialogBuilder.create();
                alertDialog.show();
            }
        });

        context = Cash1Activity.this;
        String title = "Обнулить все?";
        //String message = "(кроме средств на счету)";
        String button1String = "Да, обнулить";
        String button2String = "Нет";



        ad = new AlertDialog.Builder(context);
        ad.setIcon(R.drawable.ico);
        ad.setTitle(title);  // заголовок
      //  ad.setMessage(message); // сообщение
        //ad.setMessage(message2); // сообщение


        ad.setPositiveButton(button1String, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int arg1) {

                //dialog.cancel();
                TextView bill1 = (TextView) findViewById(R.id.editText6);
                TextView bill2 = (TextView) findViewById(R.id.editText);
                TextView bill3 = (TextView) findViewById(R.id.editText9);
                TextView bill4 = (TextView) findViewById(R.id.editText13);
                TextView bill5 = (TextView) findViewById(R.id.editText17);
                TextView bill6 = (TextView) findViewById(R.id.editText21);
                TextView bill7 = (TextView) findViewById(R.id.editText25);
                TextView bill8 = (TextView) findViewById(R.id.editText29);
                TextView bill9 = (TextView) findViewById(R.id.editText33);
                TextView bill10 = (TextView) findViewById(R.id.editText37);
                TextView bill11 = (TextView) findViewById(R.id.editText8);
                TextView bill12 = (TextView) findViewById(R.id.editText4);
                TextView bill13 = (TextView) findViewById(R.id.editText12);
                TextView bill14 = (TextView) findViewById(R.id.editText16);
                TextView bill15 = (TextView) findViewById(R.id.editText20);
                TextView bill16 = (TextView) findViewById(R.id.editText24);
                TextView bill17 = (TextView) findViewById(R.id.editText28);
                TextView bill18 = (TextView) findViewById(R.id.editText32);
                TextView bill19 = (TextView) findViewById(R.id.editText36);
                TextView bill20 = (TextView) findViewById(R.id.editText40);
                TextView bill21 = (TextView) findViewById(R.id.tvResult3);
                TextView bill22 = (TextView) findViewById(R.id.editText41);
                TextView bill23 = (TextView) findViewById(R.id.textView4);

                TextView bill24 = (TextView) findViewById(R.id.data1);
                TextView bill25 = (TextView) findViewById(R.id.data2);
                TextView bill26 = (TextView) findViewById(R.id.data3);
                TextView bill27 = (TextView) findViewById(R.id.data4);
                TextView bill28 = (TextView) findViewById(R.id.data5);
                TextView bill29 = (TextView) findViewById(R.id.data6);
                TextView bill30 = (TextView) findViewById(R.id.data7);
                TextView bill31 = (TextView) findViewById(R.id.data8);
                TextView bill32 = (TextView) findViewById(R.id.data9);
                TextView bill33 = (TextView) findViewById(R.id.data10);
                TextView bill34 = (TextView) findViewById(R.id.data11);
                TextView bill35 = (TextView) findViewById(R.id.data12);
                TextView bill36 = (TextView) findViewById(R.id.data13);
                TextView bill37 = (TextView) findViewById(R.id.data14);
                TextView bill38 = (TextView) findViewById(R.id.data15);
                TextView bill39 = (TextView) findViewById(R.id.data16);
                TextView bill40 = (TextView) findViewById(R.id.data17);
                TextView bill41 = (TextView) findViewById(R.id.data18);
                TextView bill42 = (TextView) findViewById(R.id.data19);
                TextView bill43 = (TextView) findViewById(R.id.data20);


                bill1.setText(0 + "");
                bill2.setText(0 + "");
                bill3.setText(0 + "");
                bill4.setText(0 + "");
                bill5.setText(0 + "");
                bill6.setText(0 + "");
                bill7.setText(0 + "");
                bill8.setText(0 + "");
                bill9.setText(0 + "");
                bill10.setText(0 + "");
                bill11.setText(0 + "");
                bill12.setText(0 + "");
                bill13.setText(0 + "");
                bill14.setText(0 + "");
                bill15.setText(0 + "");
                bill16.setText(0 + "");
                bill17.setText(0 + "");
                bill18.setText(0 + "");
                bill19.setText(0 + "");
                bill20.setText(0 + "");
                bill21.setText(0 + "");
                bill22.setText(0 + "");
                bill23.setText(0 + "");

                bill24.setText("");
                bill25.setText("");
                bill26.setText("");
                bill27.setText("");
                bill28.setText("");
                bill29.setText("");
                bill30.setText("");
                bill31.setText("");
                bill32.setText("");
                bill33.setText("");
                bill34.setText("");
                bill35.setText("");
                bill36.setText("");
                bill37.setText("");
                bill38.setText("");
                bill39.setText("");
                bill40.setText("");
                bill41.setText("");
                bill42.setText("");
                bill43.setText("");

                long mills = 70L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(mills);



                Toast.makeText(context, "Данные обнулены",
                        Toast.LENGTH_LONG).show();
            }
        });
        ad.setNegativeButton(button2String, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int arg1) {



                Toast.makeText(context, "Изменений не произошло", Toast.LENGTH_LONG)
                        .show();
                long mills = 70L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(mills);
            }
        });
        ad.setCancelable(true);
        ad.setOnCancelListener(new DialogInterface.OnCancelListener() {

            public void onCancel(DialogInterface dialog) {
                Toast.makeText(context, "Изменений не произошло",
                        Toast.LENGTH_LONG).show();

            }
        });



        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        etText1 = (TextView) findViewById(R.id.editText6);
        etText2 = (TextView) findViewById(R.id.editText);
        etText3 = (TextView) findViewById(R.id.editText9);
        etText4 = (TextView) findViewById(R.id.editText13);
        etText5 = (TextView) findViewById(R.id.editText17);
        etText6 = (TextView) findViewById(R.id.editText21);
        etText7 = (TextView) findViewById(R.id.editText25);
        etText8 = (TextView) findViewById(R.id.editText29);
        etText9 = (TextView) findViewById(R.id.editText33);
        etText10 = (TextView) findViewById(R.id.editText37);
        etText11 = (TextView) findViewById(R.id.editText8);
        etText12 = (TextView) findViewById(R.id.editText4);
        etText13 = (TextView) findViewById(R.id.editText12);
        etText14 = (TextView) findViewById(R.id.editText16);
        etText15 = (TextView) findViewById(R.id.editText20);
        etText16 = (TextView) findViewById(R.id.editText24);
        etText17 = (TextView) findViewById(R.id.editText28);
        etText18 = (TextView) findViewById(R.id.editText32);
        etText19 = (TextView) findViewById(R.id.editText36);
        etText20 = (TextView) findViewById(R.id.editText40);
        etText21 = (TextView) findViewById(R.id.tvResult3);
        etText22 = (TextView) findViewById(R.id.textView4);

        xetText1 = (TextView) findViewById(R.id.data1);
        xetText2 = (TextView) findViewById(R.id.data2);
        xetText3 = (TextView) findViewById(R.id.data3);
        xetText4 = (TextView) findViewById(R.id.data4);
        xetText5 = (TextView) findViewById(R.id.data5);
        xetText6 = (TextView) findViewById(R.id.data6);
        xetText7 = (TextView) findViewById(R.id.data7);
        xetText8 = (TextView) findViewById(R.id.data8);
        xetText9 = (TextView) findViewById(R.id.data9);
        xetText10 = (TextView) findViewById(R.id.data10);
        xetText11 = (TextView) findViewById(R.id.data11);
        xetText12 = (TextView) findViewById(R.id.data12);
        xetText13 = (TextView) findViewById(R.id.data13);
        xetText14 = (TextView) findViewById(R.id.data14);
        xetText15 = (TextView) findViewById(R.id.data15);
        xetText16 = (TextView) findViewById(R.id.data16);
        xetText17 = (TextView) findViewById(R.id.data17);
        xetText18 = (TextView) findViewById(R.id.data18);
        xetText19 = (TextView) findViewById(R.id.data19);
        xetText20 = (TextView) findViewById(R.id.data20);

        loadText1();
        loadText2();
        loadText3();
        loadText4();
        loadText5();
        loadText6();
        loadText7();
        loadText8();
        loadText9();
        loadText10();
        loadText11();
        loadText12();
        loadText13();
        loadText14();
        loadText15();
        loadText16();
        loadText17();
        loadText18();
        loadText19();
        loadText20();
        loadText21();
        loadText22();

        loadText01();
        loadText02();
        loadText03();
        loadText04();
        loadText05();
        loadText06();
        loadText07();
        loadText08();
        loadText09();
        loadText010();
        loadText011();
        loadText012();
        loadText013();
        loadText014();
        loadText015();
        loadText016();
        loadText017();
        loadText018();
        loadText019();
        loadText020();

    }

    public void onClickPaya(View v) {
        ad.show();
        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }


    public void onClickToPay(View view) {


        TextView textView142 = (TextView) findViewById(R.id.textView4);

        aetText1 = (EditText) findViewById(R.id.editText6);
        aetText2 = (EditText) findViewById(R.id.editText);
        aetText3 = (EditText) findViewById(R.id.editText9);
        aetText4 = (EditText) findViewById(R.id.editText13);
        aetText5 = (EditText) findViewById(R.id.editText17);
        aetText6 = (EditText) findViewById(R.id.editText21);
        aetText7 = (EditText) findViewById(R.id.editText25);
        aetText8 = (EditText) findViewById(R.id.editText29);
        aetText9 = (EditText) findViewById(R.id.editText33);
        aetText10 = (EditText) findViewById(R.id.editText37);
        aetText11 = (EditText) findViewById(R.id.editText8);
        aetText12 = (EditText) findViewById(R.id.editText4);
        aetText13 = (EditText) findViewById(R.id.editText12);
        aetText14 = (EditText) findViewById(R.id.editText16);
        aetText15 = (EditText) findViewById(R.id.editText20);
        aetText16 = (EditText) findViewById(R.id.editText24);
        aetText17 = (EditText) findViewById(R.id.editText28);
        aetText18 = (EditText) findViewById(R.id.editText32);
        aetText19 = (EditText) findViewById(R.id.editText36);
        aetText20 = (EditText) findViewById(R.id.editText40);

        float num001 = Float.parseFloat(aetText1.getText().toString());
        float num002 = Float.parseFloat(aetText2.getText().toString());
        float num003 = Float.parseFloat(aetText3.getText().toString());
        float num004 = Float.parseFloat(aetText4.getText().toString());
        float num005 = Float.parseFloat(aetText5.getText().toString());
        float num006 = Float.parseFloat(aetText6.getText().toString());
        float num007 = Float.parseFloat(aetText7.getText().toString());
        float num008 = Float.parseFloat(aetText8.getText().toString());
        float num009 = Float.parseFloat(aetText9.getText().toString());
        float num0010 = Float.parseFloat(aetText10.getText().toString());
        float num0011 = Float.parseFloat(aetText11.getText().toString());
        float num0012 = Float.parseFloat(aetText12.getText().toString());
        float num0013 = Float.parseFloat(aetText13.getText().toString());
        float num0014 = Float.parseFloat(aetText14.getText().toString());
        float num0015 = Float.parseFloat(aetText15.getText().toString());
        float num0016 = Float.parseFloat(aetText16.getText().toString());
        float num0017 = Float.parseFloat(aetText17.getText().toString());
        float num0018 = Float.parseFloat(aetText18.getText().toString());
        float num0019 = Float.parseFloat(aetText19.getText().toString());
        float num0020 = Float.parseFloat(aetText20.getText().toString());

        float w = (float) num001+num002+num003 + num004 + num005 + num006 +
              num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
             num0017+num0018+num0019+num0020;

       // textView142.setText(w + "");
        textView142.setText(String.format(Locale.US,"%.2f", w)+ "");

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.alpha);
        final Button image3 = (Button) findViewById(R.id.button30);
        image3.startAnimation(anim);
    }


    void saveText1() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT1, etText1.getText().toString());
        ed.commit();

    }
    void loadText1() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT1, "");
        etText1.setText(savedText);

    }
    void saveText2() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT2, etText2.getText().toString());
        ed.commit();
    }
    void loadText2() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT2, "");
        etText2.setText(savedText);
    }
    void saveText3() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT3, etText3.getText().toString());
        ed.commit();
    }
    void loadText3() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT3, "");
        etText3.setText(savedText);
    }
    void saveText4() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT4, etText4.getText().toString());
        ed.commit();
    }
    void loadText4() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT4, "");
        etText4.setText(savedText);
    }
    void saveText5() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT5, etText5.getText().toString());
        ed.commit();
    }
    void loadText5() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT5, "");
        etText5.setText(savedText);
    }
    void saveText6() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT6, etText6.getText().toString());
        ed.commit();
    }
    void loadText6() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT6, "");
        etText6.setText(savedText);
    }
    void saveText7() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT7, etText7.getText().toString());
        ed.commit();
    }
    void loadText7() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT7, "");
        etText7.setText(savedText);
    }
    void saveText8() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT8, etText8.getText().toString());
        ed.commit();
    }
    void loadText8() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT8, "");
        etText8.setText(savedText);
    }
    void saveText9() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT9, etText9.getText().toString());
        ed.commit();
    }
    void loadText9() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT9, "");
        etText9.setText(savedText);
    }
    void saveText10() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT10, etText10.getText().toString());
        ed.commit();
    }
    void loadText10() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT10, "");
        etText10.setText(savedText);
    }
    void saveText11() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT11, etText11.getText().toString());
        ed.commit();
    }
    void loadText11() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT11, "");
        etText11.setText(savedText);
    }
    void saveText12() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT12, etText12.getText().toString());
        ed.commit();
    }
    void loadText12() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT12, "");
        etText12.setText(savedText);
    }
    void saveText13() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT13, etText13.getText().toString());
        ed.commit();
    }
    void loadText13() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT13, "");
        etText13.setText(savedText);
    }
    void saveText14() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT14, etText14.getText().toString());
        ed.commit();
    }
    void loadText14() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT14, "");
        etText14.setText(savedText);
    }
    void saveText15() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT15, etText15.getText().toString());
        ed.commit();
    }
    void loadText15() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT15, "");
        etText15.setText(savedText);
    }
    void saveText16() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT16, etText16.getText().toString());
        ed.commit();
    }
    void loadText16() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT16, "");
        etText16.setText(savedText);
    }
    void saveText17() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT17, etText17.getText().toString());
        ed.commit();
    }
    void loadText17() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT17, "");
        etText17.setText(savedText);
    }
    void saveText18() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT18, etText18.getText().toString());
        ed.commit();
    }
    void loadText18() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT18, "");
        etText18.setText(savedText);
    }
    void saveText19() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT19, etText19.getText().toString());
        ed.commit();
    }
    void loadText19() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT19, "");
        etText19.setText(savedText);
    }
    void saveText20() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT20, etText20.getText().toString());
        ed.commit();
    }
    void loadText20() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT20, "");
        etText20.setText(savedText);
    }
    void saveText21() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT21, etText21.getText().toString());
        ed.commit();
    }
    void loadText21() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT21, "");
        etText21.setText(savedText);
    }
    void saveText22() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT22, etText22.getText().toString());
        ed.commit();
    }
    void loadText22() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT22, "");
        etText22.setText(savedText);
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText1();
        saveText2();
        saveText3();
        saveText4();
        saveText5();
        saveText6();
        saveText7();
        saveText8();
        saveText9();
        saveText10();
        saveText11();
        saveText12();
        saveText13();
        saveText14();
        saveText15();
        saveText16();
        saveText17();
        saveText18();
        saveText19();
        saveText20();
        saveText21();
        saveText22();

        saveText01();
        saveText02();
        saveText03();
        saveText04();
        saveText05();
        saveText06();
        saveText07();
        saveText08();
        saveText09();
        saveText010();
        saveText011();
        saveText012();
        saveText013();
        saveText014();
        saveText015();
        saveText016();
        saveText017();
        saveText018();
        saveText019();
        saveText020();


    }

    public void onClickSbros010(View view) {
        TextView bill21 = (TextView) findViewById(R.id.tvResult3);
        bill21.setText(0 + "");
        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }



    public void onClickPlus(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.tvResult3);

        EditText etNum55 = (EditText) findViewById(R.id.editText41);

        TextView etText53 = (TextView) findViewById(R.id.tvResult3);

        float num2 = Float.parseFloat(etText53.getText().toString());

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 + num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");

            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button27);
            image3.startAnimation(anim);

            long mills = 70L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            EditText s = etNum55;
            Toast.makeText(this, "Пополнено", Toast.LENGTH_SHORT).show();
        }

    }


    public void onClickMinus1(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        EditText etNum55 = (EditText) findViewById(R.id.editText6);
        TextView textView2 = (TextView) findViewById(R.id.editText6);
        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText53 = (TextView) findViewById(R.id.tvResult3);

        float num2 = Float.parseFloat(etText53.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button7);
            image3.startAnimation(anim);

            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }



    public void onClickMinus2(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText);
        EditText etNum55 = (EditText) findViewById(R.id.editText);
        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button5);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }


    public void onClickMinus3(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText9);
        EditText etNum55 = (EditText) findViewById(R.id.editText9);
        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button9);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus4(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText13);
        EditText etNum55 = (EditText) findViewById(R.id.editText13);
        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button11);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus5(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText17);
        EditText etNum55 = (EditText) findViewById(R.id.editText17);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button13);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus6(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText21);
        EditText etNum55 = (EditText) findViewById(R.id.editText21);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button15);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus7(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText25);
        EditText etNum55 = (EditText) findViewById(R.id.editText25);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button17);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus8(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText29);
        EditText etNum55 = (EditText) findViewById(R.id.editText29);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button19);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus9(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText33);
        EditText etNum55 = (EditText) findViewById(R.id.editText33);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button21);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus10(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText37);
        EditText etNum55 = (EditText) findViewById(R.id.editText37);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button23);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus11(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText8);
        EditText etNum55 = (EditText) findViewById(R.id.editText8);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button8);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus12(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText4);
        EditText etNum55 = (EditText) findViewById(R.id.editText4);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button6);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus13(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText12);
        EditText etNum55 = (EditText) findViewById(R.id.editText12);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button10);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }

    public void onClickMinus14(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText16);
        EditText etNum55 = (EditText) findViewById(R.id.editText16);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button12);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus15(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText20);
        EditText etNum55 = (EditText) findViewById(R.id.editText20);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button14);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus16(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText24);
        EditText etNum55 = (EditText) findViewById(R.id.editText24);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button16);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus17(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText28);
        EditText etNum55 = (EditText) findViewById(R.id.editText28);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button18);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus18(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText32);
        EditText etNum55 = (EditText) findViewById(R.id.editText32);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button20);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus19(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText36);
        EditText etNum55 = (EditText) findViewById(R.id.editText36);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button22);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }
    public void onClickMinus20(View view) {
        TextView textView = (TextView) findViewById(R.id.tvResult3);
        TextView textView2 = (TextView) findViewById(R.id.editText40);
        EditText etNum55 = (EditText) findViewById(R.id.editText40);

        long mills = 70L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView etText5 = (TextView) findViewById(R.id.tvResult3);
        float num2 = Float.parseFloat(etText5.getText().toString());
        float c = (float) 0;

        if (etNum55.getText().length() == 0)
        {
            Toast.makeText(this, "Заполните поле ввода!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            float num1 = Float.parseFloat(etNum55.getText().toString());
            float b = (float) num2 - num1;
            textView.setText(String.format(Locale.US, "%.2f", b) + "");
            textView2.setText(String.format(Locale.US, "%.2f", c) + "");
            Animation anim = AnimationUtils.loadAnimation(
                    getApplicationContext(), R.anim.alpha);
            final Button image3 = (Button) findViewById(R.id.button24);
            image3.startAnimation(anim);
            TextView textView142 = (TextView) findViewById(R.id.textView4);

            aetText1 = (EditText) findViewById(R.id.editText6);
            aetText2 = (EditText) findViewById(R.id.editText);
            aetText3 = (EditText) findViewById(R.id.editText9);
            aetText4 = (EditText) findViewById(R.id.editText13);
            aetText5 = (EditText) findViewById(R.id.editText17);
            aetText6 = (EditText) findViewById(R.id.editText21);
            aetText7 = (EditText) findViewById(R.id.editText25);
            aetText8 = (EditText) findViewById(R.id.editText29);
            aetText9 = (EditText) findViewById(R.id.editText33);
            aetText10 = (EditText) findViewById(R.id.editText37);
            aetText11 = (EditText) findViewById(R.id.editText8);
            aetText12 = (EditText) findViewById(R.id.editText4);
            aetText13 = (EditText) findViewById(R.id.editText12);
            aetText14 = (EditText) findViewById(R.id.editText16);
            aetText15 = (EditText) findViewById(R.id.editText20);
            aetText16 = (EditText) findViewById(R.id.editText24);
            aetText17 = (EditText) findViewById(R.id.editText28);
            aetText18 = (EditText) findViewById(R.id.editText32);
            aetText19 = (EditText) findViewById(R.id.editText36);
            aetText20 = (EditText) findViewById(R.id.editText40);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());
            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());
            float num006 = Float.parseFloat(aetText6.getText().toString());
            float num007 = Float.parseFloat(aetText7.getText().toString());
            float num008 = Float.parseFloat(aetText8.getText().toString());
            float num009 = Float.parseFloat(aetText9.getText().toString());
            float num0010 = Float.parseFloat(aetText10.getText().toString());
            float num0011 = Float.parseFloat(aetText11.getText().toString());
            float num0012 = Float.parseFloat(aetText12.getText().toString());
            float num0013 = Float.parseFloat(aetText13.getText().toString());
            float num0014 = Float.parseFloat(aetText14.getText().toString());
            float num0015 = Float.parseFloat(aetText15.getText().toString());
            float num0016 = Float.parseFloat(aetText16.getText().toString());
            float num0017 = Float.parseFloat(aetText17.getText().toString());
            float num0018 = Float.parseFloat(aetText18.getText().toString());
            float num0019 = Float.parseFloat(aetText19.getText().toString());
            float num0020 = Float.parseFloat(aetText20.getText().toString());

            float w = (float) num001+num002+num003 + num004 + num005 + num006 +
                    num007+num008+num009+num0010+num0011+num0012+num0013+num0014+num0015+num0016+
                    num0017+num0018+num0019+num0020;

            // textView142.setText(w + "");
            textView142.setText(String.format(Locale.US,"%.2f", w)+ "");
        }
    }

    //SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS

    void saveText01() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT91, xetText1.getText().toString());
        ed.commit();

    }
    void loadText01() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT91, "");
        xetText1.setText(savedText);

    }
    void saveText02() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT92, xetText2.getText().toString());
        ed.commit();
    }
    void loadText02() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT92, "");
        xetText2.setText(savedText);
    }
    void saveText03() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT93, xetText3.getText().toString());
        ed.commit();
    }
    void loadText03() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT93, "");
        xetText3.setText(savedText);
    }
    void saveText04() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT94, xetText4.getText().toString());
        ed.commit();
    }
    void loadText04() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT94, "");
        xetText4.setText(savedText);
    }
    void saveText05() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT95, xetText5.getText().toString());
        ed.commit();
    }
    void loadText05() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT95, "");
        xetText5.setText(savedText);
    }
    void saveText06() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT96, xetText6.getText().toString());
        ed.commit();
    }
    void loadText06() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT96, "");
        xetText6.setText(savedText);
    }
    void saveText07() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT97, xetText7.getText().toString());
        ed.commit();
    }
    void loadText07() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT97, "");
        xetText7.setText(savedText);
    }
    void saveText08() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT98, xetText8.getText().toString());
        ed.commit();
    }
    void loadText08() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT98, "");
        xetText8.setText(savedText);
    }
    void saveText09() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT99, xetText9.getText().toString());
        ed.commit();
    }
    void loadText09() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT99, "");
        xetText9.setText(savedText);
    }
    void saveText010() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT910, xetText10.getText().toString());
        ed.commit();
    }
    void loadText010() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT910, "");
        xetText10.setText(savedText);
    }
    void saveText011() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT911, xetText11.getText().toString());
        ed.commit();
    }
    void loadText011() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT911, "");
        xetText11.setText(savedText);
    }
    void saveText012() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT912, xetText12.getText().toString());
        ed.commit();
    }
    void loadText012() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT912, "");
        xetText12.setText(savedText);
    }
    void saveText013() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT913, xetText13.getText().toString());
        ed.commit();
    }
    void loadText013() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT913, "");
        xetText13.setText(savedText);
    }
    void saveText014() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT914, xetText14.getText().toString());
        ed.commit();
    }
    void loadText014() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT914, "");
        xetText14.setText(savedText);
    }
    void saveText015() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT915, xetText15.getText().toString());
        ed.commit();
    }
    void loadText015() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT915, "");
        xetText15.setText(savedText);
    }
    void saveText016() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT916, xetText16.getText().toString());
        ed.commit();
    }
    void loadText016() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT916, "");
        xetText16.setText(savedText);
    }
    void saveText017() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT917, xetText17.getText().toString());
        ed.commit();
    }
    void loadText017() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT917, "");
        xetText17.setText(savedText);
    }
    void saveText018() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT918, xetText18.getText().toString());
        ed.commit();
    }
    void loadText018() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT918, "");
        xetText18.setText(savedText);
    }
    void saveText019() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT919, xetText19.getText().toString());
        ed.commit();
    }
    void loadText019() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT919, "");
        xetText19.setText(savedText);
    }
    void saveText020() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT920, xetText20.getText().toString());
        ed.commit();
    }
    void loadText020() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT920, "");
        xetText20.setText(savedText);
    }

}
