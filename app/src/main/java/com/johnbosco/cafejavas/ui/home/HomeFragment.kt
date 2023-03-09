package com.johnbosco.cafejavas.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.johnbosco.cafejavas.R
import com.johnbosco.cafejavas.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val mywebview: WebView =view.findViewById(R.id.ho)
        mywebview.webViewClient=object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        mywebview.loadUrl("https://cafejavas.co.ug/user/home")
        mywebview.settings.javaScriptEnabled
        mywebview.settings.allowContentAccess=true
        mywebview.settings.useWideViewPort=true
        mywebview.settings.domStorageEnabled=true
    }


}