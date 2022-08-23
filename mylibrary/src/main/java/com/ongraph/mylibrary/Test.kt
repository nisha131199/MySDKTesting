package com.ongraph.mylibrary

import android.app.Dialog
import android.content.Context
import android.os.Handler
import android.view.Gravity
import android.view.WindowManager
import android.widget.TextView

object Test {
    fun test(): String {
        return "this is my library"
    }

    fun Context.toast(message: String) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog)
        dialog.findViewById<TextView>(R.id.text).text = message
        dialog.create()
        dialog.show()

        val attr = dialog.window?.attributes
        attr?.gravity = Gravity.BOTTOM
        attr?.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND
        dialog.window?.attributes = attr

        dialog.window?.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)

        Handler().postDelayed({
            dialog.dismiss()
        }, 3000)
    }
}