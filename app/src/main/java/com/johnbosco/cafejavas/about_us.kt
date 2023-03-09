package com.johnbosco.cafejavas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class about_us : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_about_us, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val mywebview: WebView =view.findViewById(R.id.an)
        mywebview.webViewClient=object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        mywebview.loadUrl("https://cafejavas.co.ug/user/home#footer")
        mywebview.settings.javaScriptEnabled
        mywebview.settings.allowContentAccess=true
        mywebview.settings.useWideViewPort=true
        mywebview.settings.domStorageEnabled=true
    }

}