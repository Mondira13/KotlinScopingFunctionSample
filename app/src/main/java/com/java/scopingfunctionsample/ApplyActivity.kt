package com.java.scopingfunctionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ApplyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apply)
        performApplyOperation() // its nothing to show bcz "person" object is nullable
        performApplyOperationTwo()
    }

    /**
     * The apply function is similar to the run functionality only in terms of referring to the context of the object as “this” and not “it”
     * and also in providing null safety checks
     */
    private fun performApplyOperation() {
        val person: Person? = null
        person?.apply {
            name = "asdf"
            contactNumber = "1234"
            address = "wasd"
        }?.displayInfo()
    }

    /**
     * apply is specially use for that scenarios where we should return an instance by adding specific attributes to them.
     */
    private fun performApplyOperationTwo() {
        Person().apply {
            name = "Poly Pal"
            contactNumber = "123456789"
            address = "West Bengal"
        }. displayInfo()
    }

}