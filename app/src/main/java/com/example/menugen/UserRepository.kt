package com.example.menugen

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// 앱에서 사용하는 데이터와 그 데이터를 통신하는 역할
class UserRepository(private val DAO: DAO) {
    val readAllData:LiveData<List<Entity>> = DAO.readAllData()

    suspend fun insert(entity: Entity){
        DAO.insert(entity)
    }

    suspend fun deleteAllUser(){
        DAO.deleteAllUsers()
    }

//    suspend fun deleteUser(entity: Entity){
//        DAO.deleteUser()
//    }
}