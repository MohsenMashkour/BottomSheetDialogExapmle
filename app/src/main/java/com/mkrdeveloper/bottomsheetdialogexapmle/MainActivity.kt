package com.mkrdeveloper.bottomsheetdialogexapmle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.mkrdeveloper.bottomsheetdialogexapmle.databinding.ActivityMainBinding
import com.mkrdeveloper.bottomsheetdialogexapmle.databinding.SheetLayoutBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var sheetBinding : SheetLayoutBinding
    private lateinit var dialog : BottomSheetDialog



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        sheetBinding = SheetLayoutBinding.inflate(layoutInflater)
        dialog = BottomSheetDialog(this, R.style.BottomSheetTheme)
        dialog.setContentView(sheetBinding.root)

        dialog.window?.attributes?.windowAnimations = R.style.DialogAnimation

        binding.btnOpenSheet.setOnClickListener {
            dialog.show()
        }


        sheetBinding.btnSheet.setOnClickListener {
            val text = sheetBinding.edtSheet.text.toString()
            binding.tvMain.text = text
            dialog.dismiss()
        }

    }
}