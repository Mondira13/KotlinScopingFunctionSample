package com.java.scopingfunctionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AlsoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_also)
        performAlsoOperation()
        performAlsoOperationTwo()
    }

    /**
     * The “also” function is similar to the let functionality only in terms of referring to the context of the object as “it” and not “this” and also in providing null safety checks.
     */
    private fun performAlsoOperation() {
        val name = Person().also {
            print("Current name is: ${it.name}\n")
            Log.i("tag","Current name is: ${it.name}\n")
            it.name = "Mou"
        }.run {
            "Modified name is: $name\n"
        }
        print(name)
        Log.i("tag",name.toString())
    }

    /**
     * we can see the usage of the readable lambda parameters,
     * The advantage of using “also” operator is that while doing a chain of operations, this operator helps in evaluating the current operating value if required.
     */
    private fun performAlsoOperationTwo() {
        val name = Person().also { currentPerson ->
            print("Current name is: ${currentPerson.name}\n")
            Log.i("tag","Current name is: ${currentPerson.name}\n")
            currentPerson.name = "Rahul"
        }.run {
            "Modified name is: $name\n"
        }
        print(name)
        Log.i("tag",name.toString())
    }

}