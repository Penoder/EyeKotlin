package com.ronald.eyekotlin.config

/**
 * http://www.wanandroid.com/blog/show/2
 *
 * @author Penoder
 * @date 18-3-15.
 */
class EyeApi {

    /**
     * 启动页闪屏图
     */
    val SPLASH = "http://openapi.kymjs.com/splash"

    /**
     * 干货集中营 妹子图 后面参数为 pageNum 和 pageSize
     */
    val GET_GANK_GIRLS = "http://gank.io/api/data/福利/10/1"

    /**
     * 获取首页文章列表
     *
     * 方法：GET
     * 参数：页码，拼接在连接中，从0开始。
     */
    val GET_HOME_LIST = "http://www.wanandroid.com/article/list/0/json"

    /**
     * 获取首页 Banner
     *
     * 方法：GET
     * 参数：无
     */
    val GET_HOME_BANNER = "http://www.wanandroid.com/banner/json"

    /**
     * 获取常用网站
     *
     * 方法：GET
     * 参数：无
     */
    val GET_USEFUL_SITES = "http://www.wanandroid.com/friend/json"

    /**
     * 获取搜索热词
     *
     * 方法：GET
     * 参数：无
     */
    val GET_HOT_SEARCH_WORD = "http://www.wanandroid.com//hotkey/json"

    /**
     * 获取体系数据
     *
     * 方法：GET
     * 参数：无
     */
    val GET_TREE = "http://www.wanandroid.com/tree/json"

    /**
     * 获取体系下的文章
     *
     * 方法：GET
     * 参数：
     *      cid 分类的id，上述二级目录的id
     *      页码：拼接在链接上，从0开始。
     */
    val GET_TREE_ARTICLE = "http://www.wanandroid.com/article/list/0/json?cid=60"

    /**
     * 获取导航数据
     *
     * 方法：GET
     * 参数：无
     */
    val GET_NAVIGATION = "http://www.wanandroid.com/navi/json"

    /**
     * 获取项目分类
     *
     * 方法： GET
     * 参数： 无
     */
    val GET_PROJ_CLASSIFY = "http://www.wanandroid.com/project/tree/json"

    /**
     * 获取某一个分类下项目列表数据，分页展示
     *
     * 方法：GET
     * 参数：
     *      cid 分类的id，上面项目分类接口
     *      页码：拼接在链接中，从1开始。
     */
    val GET_PROJ_LIST = "http://www.wanandroid.com/project/list/1/json?cid=294"

}
