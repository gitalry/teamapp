package com.example.jamesg.webeappenin;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Introduction extends AppIntro {

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

      */

    @Override
    public void init(Bundle savedInstanceState) {
        //super.init(savedInstanceState);

    // Add your slide's fragments here.
                // AppIntro will automatically generate the dots indicator and buttons.
                addSlide(SampleSlide.newInstance(R.layout.fragment_first_fragment));
                addSlide(SampleSlide.newInstance(R.layout.fragment_second_fragment));
                addSlide(SampleSlide.newInstance(R.layout.fragment_third_fragment));
//                addSlide(first_fragment);
//                addSlide(second_fragment);
//                addSlide(third_fragment);
//                addSlide(fourth_fragment);

                // Instead of fragments, you can also use our default slide
                // Just set a title, description, background and image. AppIntro will do the rest.
                //addSlide(AppIntroFragment.newInstance(title, description, image, background_colour));

                // OPTIONAL METHODS
                // Override bar/separator color.
                setBarColor(Color.parseColor("#3F51B5"));
                setSeparatorColor(Color.parseColor("#2196F3"));

                // Hide Skip/Done button.
                showSkipButton(true);
                setProgressButtonEnabled(true);

                // Turn vibration on and set intensity.
                // NOTE: you will probably need to ask VIBRATE permisssion in Manifest.
                setVibrate(true);
                setVibrateIntensity(30);
            }

            @Override
            public void onSkipPressed(Fragment currentFragment) {
                super.onSkipPressed(currentFragment);
                // Do something when users tap on Skip button.
            }

            @Override
            public void onDonePressed(Fragment currentFragment) {
                super.onDonePressed(currentFragment);
                // Do something when users tap on Done button.
            }

            @Override
            public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
                super.onSlideChanged(oldFragment, newFragment);
                // Do something when the slide changes.
            }
        }

