package com.droidsvs.svsloading

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.droidsvs.droidsvsloading.ProgressDialogUtlis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val loading = ProgressDialogUtlis(this, false)
        loading.setProgressLoading(true)
    }
}
