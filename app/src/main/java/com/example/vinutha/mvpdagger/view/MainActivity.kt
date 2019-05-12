package com.example.vinutha.mvpdagger.view

import android.os.Bundle
import com.example.vinutha.mvpdagger.MainActivityContract
import com.example.vinutha.mvpdagger.MainActivityContract.View
import com.example.vinutha.wiidirect.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), View {

    @Inject
    lateinit var presenter: MainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.setViewToPresenter(this)
    }

    override fun initializeView() {
        supportFragmentManager.beginTransaction().replace(R.id.container,
            FirstFragment()
        ).commit()
    }
}
