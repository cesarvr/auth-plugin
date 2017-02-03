package com.pdf.generator;


import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.print.PrintManager;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * This class echoes a string called from JavaScript.
 */
public class PluginEntryClass extends CordovaPlugin {

    private final static String APPNAME = "PluginEntryClass";
    private WebView offscreenWebview = null;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("hello")) {
            this.pdfPrinter(args, callbackContext);

            return true;
        }
        return false;
    }
}
