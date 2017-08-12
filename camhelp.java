
//注册  
//Post   
//123.207.253.163:8080/user/register

key

telephone  
password

返回

{
    "code": 0,
    "msg": "成功",
    "data": {
        "userid": "1"
    }
}

//登录   Post    
//123.207.253.163:8080/user/login
//eg:123.207.253.163:8080/user/login

key 

telephone
password

//返回

{
    "code": 0,
    "msg": "成功",
    "data": {
        "userID": 1,
        "account": null,
        "password": "123456",
        "nickname": null,
        "sex": null,
        "intro": null,
        "avatar": null,
        "telephone": "18084938391",
        "email": null,
        "address": null,
        "birthday": null,
        "roleID": null,
        "bgpicture": null,
        "attentionUser": null,
        "attentionGoods": null,
    }
}

//发布信息
//http://localhost:8080/classify/publish Post
/**
    发布者 usermapperid 必须参数

    /**分类的type
     * 1-活动
     * 2-问题
     * 3-失物
     * 4-寻物*/
    private  Integer categoryType;

    /**标题*/
    private String commonTitle;
    /**简介*/
    private String commonIntro;
    /**内容*/
    private String commonContent;
    /**图片1*/
    private String commonPic1;
    /**图片2*/
    private String commonPic2;
    /**图片3*/
    private String commonPic3;
    /**图片4*/
    private String commonPic4;
    /**创建时间*/
    private Date createtime;
    /**关注数*/
    private int praisenum;
    /**浏览量*/
    private int browsenum;

    /**发布者ID*/
   // private int userId;

    /**活动开始时间*/
    private String expstartTime;
    /**活动结束时间*/
    private String expendTime;

    /**问题类型*/
    private Integer proType;

    /**物品-联系方式*/
    private  String goodscontact;

    private Integer usermapperid;

 */

{
    "code": 0,
    "msg": "成功",
    "data": null
}

//活动等list页面显示
//http://localhost:8080/classify/list  Get

{
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "userID": 1,
            "nickname": null,
            "avatar": null,
            "commonid": 6,
            "categoryType": null,
            "commonTitle": null,
            "commonPic1": null,
            "commonPic2": null,
            "commonPic3": null,
            "commonPic4": null,
            "createtime": null,
            "praisenum": 0
        },
    {

    }
    
    ...

    ]
}


//查看关注的人
//http://localhost:8080/user/attentionuser  Post
/**
      userid

 */
{
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "userID": 2,
            "account": "2",
            "password": "password3",
            "nickname": null,
            "sex": null,
            "intro": null,
            "avatar": null,
            "telephone": null,
            "email": null,
            "address": null,
            "birthday": null,
            "roleID": null,
            "bgpicture": null,
            "attentionUser": null,
            "attentionGoods": null
        },
        {
            "userID": 3,
            "account": "3",
            "password": "password3",
            "nickname": null,
            "sex": null,
            "intro": null,
            "avatar": null,
            "telephone": null,
            "email": null,
            "address": null,
            "birthday": null,
            "roleID": null,
            "bgpicture": null,
            "attentionUser": null,
            "attentionGoods": null
        }
    ]
}

//通过userid返回该人发布的信息
//http://localhost:8080/classify/find/publishbyuser Post
//userid
{
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "commonid": 6,
            "categoryType": null,
            "commonTitle": null,
            "commonIntro": null,
            "commonContent": null,
            "commonPic1": null,
            "commonPic2": null,
            "commonPic3": null,
            "commonPic4": null,
            "createtime": 1502279326,
            "praisenum": 0,
            "browsenum": 0,
            "expstartTime": null,
            "expendTime": null,
            "proType": null,
            "goodscontact": null,
            "usermapperid": 1
        },
        {
           
        },
        
        ...

    ]
}


//查看关注的物
//http://localhost:8080/user/attentiongoods  Post
/**
    userid
 */

 {
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "userID": 2,
            "nickname": null,
            "avatar": null,
            "commonid": 11,
            "categoryType": null,
            "commonTitle": null,
            "commonPic1": null,
            "commonPic2": null,
            "commonPic3": null,
            "commonPic4": null,
            "createtime": null,
            "praisenum": 0
        },

        {

        }

        ...
    ]
 }

 //查看关注物的详细信息
 //http://localhost:8080/classify/details Post
 //commonid

 {
    "code": 0,
    "msg": "成功",
    "data": {
        "commonid": 8,
        "categoryType": null,
        "commonTitle": null,
        "commonIntro": null,
        "commonContent": null,
        "commonPic1": null,
        "commonPic2": null,
        "commonPic3": null,
        "commonPic4": null,
        "createtime": 1502279328,
        "praisenum": 0,
        "browsenum": 0,
        "expstartTime": null,
        "expendTime": null,
        "proType": null,
        "goodscontact": null,
        "usermapperid": 1
    }
}