package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mLogo;
    //private Button mTopButton;
    //private Button mBottomButton;
    private Button mOne;
    private Button mTwo;
    private Button mThree;
    private Button mFour;
    private Button mFive;
    private Button mSix;
    protected void dissapear(){


        mOne.setVisibility(View.GONE);
        mTwo.setVisibility(View.GONE);
        mThree.setVisibility(View.GONE);
        mFour.setVisibility(View.GONE);
        mFive.setVisibility(View.GONE);
        mSix.setVisibility(View.GONE);
    }



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mLogo =(TextView)findViewById(R.id.logo);
        mOne =(Button)findViewById(R.id.button1);
        mTwo =(Button)findViewById(R.id.button2);
        mThree =(Button)findViewById(R.id.button3);
        mFour =(Button)findViewById(R.id.buttons4);
        mFive=(Button)findViewById(R.id.button5);
        mSix=(Button)findViewById(R.id.button6) ;







        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLogo.setText(R.string.T_About);
                mOne.setText(R.string.T_Vc);
                mTwo.setText(R.string.T_Dean);
                mThree.setText(R.string.T_Transport);
                mFour.setText(R.string.T_IT_Section);


                mOne.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mLogo.setText(R.string.T_VcMessage);
                        dissapear();
                    }});
                mTwo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText(R.string.T_noDean);
                        dissapear();
                    }});
                mThree.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText((R.string.T_TransportService));
                        dissapear();

                    }});
                mFour.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText(R.string.T_ITdetails);
                        dissapear();
                    }});






            }
        });

        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOne.setText(R.string.T_DeptEng);
                mTwo.setText(R.string.T_Management);
                mThree.setText(R.string.T_PostGrad);

                mFour.setVisibility(View.GONE);
                mFive.setVisibility(View.GONE);
                mSix.setVisibility(View.GONE);





                mOne.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mOne.setText(R.string.Computer);
                        mTwo.setText(R.string.Civil);
                        mThree.setText(R.string.Electrical);
                        mFour.setVisibility(View.VISIBLE);
                        mFive.setVisibility(View.VISIBLE);
                        mSix.setVisibility(View.VISIBLE);
                        mFour.setText(R.string.Electronics);
                        mFive.setText(R.string.Food);
                        mSix.setText(R.string.Mechanical);
                        mOne.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {           //COMPUTER SC. DEPT
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);


                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgCse);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyCse);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusCse);
                                    }
                                });

                            }
                        });
                        mTwo.setOnClickListener(new View.OnClickListener() {    //CIVIL DEPT
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgCivil);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyCivil);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusCivil);
                                    }
                                });


                            }
                        });
                        mThree.setOnClickListener(new View.OnClickListener() {      //Electrical
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgElectrical);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyElectrical);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusElectrical);
                                    }
                                });

                            }
                        });
                        mFour.setOnClickListener(new View.OnClickListener() {       //Electronics and Communication
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgElectronics);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyElectronics);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusElectronics);
                                    }
                                });
                            }
                        });
                        mFive.setOnClickListener(new View.OnClickListener() {       //FOOD
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgFood);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyFood);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusFood);
                                    }
                                });

                            }
                        });
                        mSix.setOnClickListener(new View.OnClickListener() {        //MECHANICAL
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgMech);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyMech);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusMech);
                                    }
                                });

                            }
                        });




                    }
                });
                mTwo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mOne.setText(R.string.Business);
                        mTwo.setText(R.string.Economics);
                        mThree.setVisibility(View.GONE);
                        mFour.setVisibility(View.GONE);
                        mFive.setVisibility(View.GONE);
                        mSix.setVisibility(View.GONE);
                        mOne.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Faculty);
                                mTwo.setText(R.string.Syllabus);
                                mThree.setVisibility(View.GONE);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyB);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusB);
                                        dissapear();
                                    }
                                });
                            }
                        });
                        mTwo.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Faculty);
                                mTwo.setText(R.string.Syllabus);
                                mThree.setVisibility(View.GONE);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyEconomics);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusEconomics);
                                        dissapear();
                                    }
                                });
                            }
                        });


                    }
                });
                mThree.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mOne.setText(R.string.Maths);
                        mTwo.setText(R.string.Physics);
                        mThree.setText(R.string.Chemistry);
                        mFour.setVisibility(View.GONE);
                        mFive.setVisibility(View.GONE);
                        mSix.setVisibility(View.GONE);
                        mOne.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgMaths);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyMaths);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusMaths);
                                    }
                                });

                            }
                        });
                        mTwo.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgPhysics);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyPhysics);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusPhysics);
                                    }
                                });

                            }
                        });
                        mThree.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mOne.setText(R.string.Msg);
                                mTwo.setText(R.string.Faculty);
                                mThree.setText(R.string.Syllabus);
                                mFour.setVisibility(View.GONE);
                                mFive.setVisibility(View.GONE);
                                mSix.setVisibility(View.GONE);
                                mOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.MsgChemistry);
                                        dissapear();
                                    }
                                });
                                mTwo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.FacultyChemistry);
                                        dissapear();
                                    }
                                });
                                mThree.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mLogo.setText(R.string.SyllabusChemistry);
                                    }
                                });

                            }
                        });

                    }
                });
            }
        });
        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOne.setText(R.string.Career);
                mTwo.setText(R.string.Hostel);
                mThree.setText(R.string.T_Transport);
                mFour.setText(R.string.SexualHarras);
                mFive.setText(R.string.AntiRag);
                mSix.setText(R.string.Medical);
                mOne.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText(R.string.CareerDetails);
                        dissapear();
                    }
                });
                mTwo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText(R.string.HostelDetails);
                        dissapear();
                    }
                });
                mThree.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText(R.string.T_TransportService);
                        dissapear();
                    }
                });
                mFour.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText(R.string.SexualHarrasDetails);
                        dissapear();
                    }
                });
                mFive.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText(R.string.AntiRagDetails);
                        dissapear();
                    }
                });
                mSix.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mLogo.setText(R.string.MedicalDetails);
                        dissapear();
                    }
                });




            }
        });
        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLogo.setText(R.string.Contactus);
                dissapear();
            }
        });
        mFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLogo.setText(R.string.loc);
                dissapear();
            }
        });
        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLogo.setText(R.string.BankDetails);
                dissapear();

            }
        });









    }
}
