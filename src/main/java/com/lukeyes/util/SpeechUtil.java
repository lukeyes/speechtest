package com.lukeyes.util;


import java.io.File;

import com.sun.speech.freetts.VoiceManager;

/**
 * Created by luke on 8/29/16.
 */
public class SpeechUtil {

    public static SpeechUtil mInstance = null;

    public static SpeechUtil getInstance() {
        if(mInstance == null) {
            mInstance = new SpeechUtil();
            mInstance.init("mbrola_us1");
        }
        return mInstance;
    }

    com.sun.speech.freetts.Voice helloVoice;

    public void listAllVoices() {

        System.out.println();
        System.out.println("All voices available:");
        VoiceManager voiceManager = VoiceManager.getInstance();
        com.sun.speech.freetts.Voice[] voices = voiceManager.getVoices();
        for (int i = 0; i < voices.length; i++) {
            System.out.println("    " + voices[i].getName()
                    + " (" + voices[i].getDomain() + " domain)");
        }
    }

    public void init(String voiceName) {

        System.setProperty("mbrola.base", "/lib/mbrola");

        String mbrolaBase = System.getProperty("mbrola.base");
        boolean doesExist = new File(mbrolaBase).exists();
        System.out.println("Does Exist - " + doesExist);
        System.out.println("Mbrola base - " + mbrolaBase);

      //  listAllVoices();

        System.out.println();
        System.out.println("Using voice: " + voiceName);

        /* The VoiceManager manages all the voices for FreeTTS.
         */
        VoiceManager voiceManager = VoiceManager.getInstance();
        helloVoice = voiceManager.getVoice(voiceName);
        helloVoice.allocate();

        if (helloVoice == null) {
            System.err.println(
                    "Cannot find a voice named "
                            + voiceName + ".  Please specify a different voice.");
            System.exit(1);
        }
    }

    public void doSpeak(String speakText) {
        //   {
       // helloVoice.allocate();

        /* Synthesize speech.
         */
        FaceUtil.getInstance().setTalking(true);
        helloVoice.speak(speakText);
        FaceUtil.getInstance().setTalking(false);
/*
        String command = String.format("espeak -ven+f3 \"%s\"", speakText);
        Runtime rt = Runtime.getRuntime();
        try {
            Process pr = rt.exec(command);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /* Clean up and leave.
         */
       // helloVoice.deallocate();
    }



}
