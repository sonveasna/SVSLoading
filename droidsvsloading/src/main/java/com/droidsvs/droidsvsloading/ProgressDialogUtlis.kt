
package com.droidsvs.droidsvsloading

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog

class ProgressDialogUtlis(private val mContext: Context, private val isCancelable: Boolean) : AlertDialog(mContext) {
	
	override fun show() {
		super.show()
		setCancelable(isCancelable)
		window!!.setBackgroundDrawable(ContextCompat.getDrawable(mContext, R.color.transparent_100))
		setContentView(R.layout.customize_view_loading)
	}
	
	override fun dismiss() {
		super.dismiss()
	}
	
	fun setProgressLoading(loading: Boolean) {
		if (loading) {
			show()
		} else {
			dismiss()
		}
	}
}