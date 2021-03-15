package com.java.scopingfunctionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_let)
        performLetOperation()
        performLetOperationTwo()
        performLetOperationThree()
    }

    /**
     * It is not necessary to write “return@let”. This is only done to enhance code readability.
     * In Kotlin, if the last statement in a “let” block is a non-assignment statement, it is by default a return statement.
     */
    private fun performLetOperation() {
        val person = Person().let {
            return@let "The name of the Person is: ${it.name}"
        }
        print(person)
        Log.i("tag",person.toString())
    }

    /**
     * there was no return value in the let block
     */
    private fun performLetOperationTwo() {
        val person = Person().let {
            it.name = "NewName"
        }
        print(person)
        Log.i("tag",person.toString())
    }

    /**
     * the “name” parameter of the “Personsss” class nullable and we want to print the name of the person only if it is a not null value,
     */
    private fun performLetOperationThree() {
        val name = Personsss().name?.let {
            "The name of the Person is: $it"
        }
        val mobileNumber = Personsss().contactNumber?.let {
            "The contactNumber of the Person is: $it"
        }
        print(name)
        print(mobileNumber)
        Log.i("tag",name.toString())
        Log.i("tag",mobileNumber.toString())
    }

}


class Person() {
    var name: String = "Mondira Pal"
    var contactNumber: String = "9865467556"
    var address: String = "Kolkata"

    fun displayInfo() {
        print(
            "\n Name: $name\n " +
                    "Contact Number: $contactNumber\n " +
                    "Address: $address"
        )
        Log.i("tag","\n Name: $name\n " +
                "Contact Number: $contactNumber\n " +
                "Address: $address")
    }

}

class Personsss {
    var name: String? = null
    var contactNumber: String = "9865467556"
    var address: String = "Kolkata"

    fun displayInfo()  = print("\n Name: $name\n " +
            "Contact Number: $contactNumber\n " +
            "Address: $address")

}