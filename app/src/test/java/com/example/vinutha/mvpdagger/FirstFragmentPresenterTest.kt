package com.example.vinutha.mvpdagger

import com.example.vinutha.mvpdagger.presenter.FirstFragmentPresenter
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations


class FirstFragmentPresenterTest {
    @Mock
    lateinit var view: FirstFragmentContract.View

    @InjectMocks
    lateinit var presenter: FirstFragmentPresenter

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testSetViewToPresenter() {
        //arrange

        //act
        presenter.setViewToPresenter(view)

        //assert
        verify(view).initializeView()
    }
}