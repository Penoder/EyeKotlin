package com.ronald.eyekotlin.entity

/**
 * 基础返回数据类
 *
 * @author Penoder
 * @date 18-3-15.
 */
class CommonEntity<T> {

    /**
     * 错误码， errorCode = 0 时表示成功
     */
    var errorCode: Int = -1

    /**
     * 错误消息
     */
    var errorMsg: String? = ""

    /**
     * 返回的数据，泛型
     */
    var data: T? = null

}