package com.java.scopingfunctionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class RunActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_run)
        performRunOperation()
        performRunOperationTwo()
    }

    /**
     * “run” operator can be used to initialize an object and return the result of it.
     * The “run” operator is similar to the “let” operator in terms of accepting a return value that is different from the object on which the scope function is being applied to.
     */
    private fun performRunOperation() {
        Person().run {
            name = "Mou Pal"
            contactNumber = "0987654321"
            return@run "The details of the Person is: ${displayInfo()}"
        }
    }

    /**
     * The difference is run refers to the context of the object as “this” and not “it”.
     * The “run” operator also helps in easy null checks similar to the “let” operator
     */
    private fun performRunOperationTwo() {
        val name = Personsss().name?.run {
            "The name of the Person is: $this"
        }
        val address = Person().address?.run {
            "The address of the Person is: $this"
        }
        print(name)
        print(address)
        Log.i("tag",name.toString())
        Log.i("tag",address.toString())
    }

}


