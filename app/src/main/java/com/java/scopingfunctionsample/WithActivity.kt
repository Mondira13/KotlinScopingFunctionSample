package com.java.scopingfunctionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class WithActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with)
        performWithOperation()
        performWithOperationTwo() // its nothing to show bcz "person" object is nullable
        performRunOperation() // its nothing to show bcz "person" object is nullable
    }

    /**
     * The “with” operator is completely similar to the run operator.
     * It also refers to the context of the object as “this”, similar to how the “run” operator uses it.
     */
    private fun performWithOperation() {
        val person = with(Person()) {
            return@with "The name of the Person is: ${this.name}"
        }
        print(person)
        Log.i("tag",person.toString())
    }

    /**
     * the context of the object referred to as “this” is a nullable type of Person.
     * So performing a null check using a “with” operator is difficult.
     */
    private fun performWithOperationTwo() {
        val person: Person? = null
        with(person) {
            this?.name = "asdf"
            this?.contactNumber = "1234"
            this?.address = "wasd"
            this?.displayInfo()
        }
    }

    /**
     * the context of the object referred to as “this” is a nullable type of Person.
     * So performing a null check using a “run” operator is quite easier than "with" operator.
     */
    private fun performRunOperation() {
        val person: Person? = null
        person?.run {
            name = "asdf"
            contactNumber = "1234"
            address = "wasd"
            displayInfo()
        }
    }

}