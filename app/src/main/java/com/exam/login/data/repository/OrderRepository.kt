package com.exam.login.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.exam.login.AppConfig
import com.exam.login.data.entity.OrderData
import com.exam.login.data.entity.ShoeData

class OrderRepository(var application: Application) {
    val db =(application as AppConfig).database

    suspend fun insertOrderData(orderData: OrderData){
        db.orderDataDao.insertOrderData(orderData)
    }

    fun getOrderData(): LiveData<List<OrderData>> {
        return db.orderDataDao.getOrderData()
    }

    suspend fun deleteOrder(id : Int){
        db.orderDataDao.deleteOrder(id)
    }

    suspend fun deleteAll() {
        db.orderDataDao.deleteAllOrders()
    }

}