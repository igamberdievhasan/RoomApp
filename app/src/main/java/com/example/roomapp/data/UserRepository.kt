package com.example.roomapp.data

import androidx.lifecycle.LiveData

class UserRepository(private val userDAO: UserDAO) {
    val readAllData: LiveData<List<User>> = userDAO.readAllData()

    suspend fun addUser(user: User){
        userDAO.addUser(user)
    }
}