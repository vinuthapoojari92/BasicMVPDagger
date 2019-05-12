package com.example.vinutha.mvpdagger.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.vinutha.mvpdagger.FirstFragmentContract
import com.example.vinutha.wiidirect.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class FirstFragment : DaggerFragment(), FirstFragmentContract.View {

    @Inject
    lateinit var presenter: FirstFragmentContract.Presenter

    lateinit var textView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.first_fragment, container, false)
        textView = view.findViewById(R.id.text)
        presenter.setViewToPresenter(this)
        return view
    }

    override fun initializeView() {
        textView.text = getString(R.string.text)
    }
}