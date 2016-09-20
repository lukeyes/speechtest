package com.lukeyes.controller;

import com.lukeyes.domain.FaceStatus;
import com.lukeyes.domain.SpeechCommand;
import com.lukeyes.util.FaceUtil;
import com.lukeyes.util.SpeechUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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

    @RequestMapping("/api/v1/status/face")
    public FaceStatus currentFaceStatus() {
        FaceStatus currentStatus = FaceUtil.getInstance().getCurrent();
        return currentStatus;
    }

    @GetMapping("/api/v1/emotion/{emotion}")
    public void setEmotion(@PathVariable String emotion) {
        FaceUtil.getInstance().setEmotion(emotion);
    }

    @GetMapping("/api/v1/lines")
    public List<String> getLines() {
        List<String> lineList = new ArrayList();
        lineList.add("Hello");
        lineList.add("Goodbye");
        lineList.add("Yes");
        lineList.add("No");
        return lineList;
    }


    private void saySpeech(String text) throws Exception {

        SpeechUtil.getInstance().doSpeak(text);
    }
}