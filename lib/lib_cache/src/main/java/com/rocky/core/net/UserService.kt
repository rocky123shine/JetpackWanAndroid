package com.rocky.core.net

import com.rocky.base.net.NetResult
import com.rocky.common.constants.UrlDefinition
import com.rocky.core.model.CoinEntity
import com.rocky.core.model.CoinRecordEntity
import com.wj.sampleproject.entity.UserInfoEntity
import retrofit2.http.*


interface UserService {
    /** 通过用户名[username]、密码[password]登录并返回用户信息 */
    @FormUrlEncoded
    @POST(UrlDefinition.LOGIN)
    suspend fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): NetResult<UserInfoEntity>

    /** 通过用户名[username]、密码[password]注册用户并返回用户信息 */
    @FormUrlEncoded
    @POST(UrlDefinition.REGISTER)
    suspend fun register(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("repassword") repassword: String = password
    ): NetResult<UserInfoEntity>

    /** 用户退出登录 */
    @GET(UrlDefinition.LOGOUT)
    suspend fun logout(): NetResult<Any>

    /** 获取用户积分信息 */
    @GET(UrlDefinition.USER_COINS)
    suspend fun coinsInfo(): NetResult<CoinEntity>

    /** 根据页码 [pageNum] 获取积分变动记录 */
    @GET(UrlDefinition.USER_COINS_LIST)
    suspend fun coinsList(@Path("pageNum") pageNum: Int): NetResult<ArrayList<CoinRecordEntity>>

    /** 根据页码 [pageNum] 获取积分排行榜 */
    @GET(UrlDefinition.COINS_RANKING)
    suspend fun coinsRanking(@Path("pageNum") pageNum: Int): NetResult<ArrayList<CoinEntity>>

}