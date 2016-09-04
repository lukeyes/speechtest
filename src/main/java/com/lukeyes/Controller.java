package com.lukeyes;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import org.springframework.web.bind.annotation.*;



@RestController
public class Controller {

    @GetMapping("/api/v1/speak/{speech}")
    public void speak(@PathVariable String speech) throws Exception {
        saySpeech(speech);
    }

    @PostMapping("/api/v1/speak")
    public void speak(@RequestBody SpeechCommand speech) throws Exception {
        saySpeech(speech.getSpeech());
    }

    private void saySpeech(String text) throws Exception {

        SpeechUtil.getInstance().doSpeak(text);
    }
}