DROP TABLE IF EXISTS r_student;
CREATE TABLE r_student(
                          `id` INT(10) NOT NULL   COMMENT '主键自增id' ,
                          `uid` VARCHAR(64) NOT NULL   COMMENT '用户ID' ,
                          `name` VARCHAR(64)    COMMENT '用户名' ,
                          `email` VARCHAR(255)    COMMENT '用户邮箱' ,
                          `phone` INT(20)    COMMENT '用户联系电话' ,
                          `password` VARCHAR(255)    COMMENT '用户密码' ,
                          `wxid` VARCHAR(255)    COMMENT '用户微信唯一识别ID' ,
                          `school_id` INT(10)    COMMENT '学校Id,关联院校表' ,
                          `grade` INT(10)    COMMENT '年级' ,
                          `subject` VARCHAR(255)    COMMENT '专业' ,
                          `profession_id` INT(10)    COMMENT '职业方向ID' ,
                          `desc` VARCHAR(900)    COMMENT '个人简介' ,
                          `location` VARCHAR(255)    COMMENT '所在城市' ,
                          `type` INT(4)    COMMENT '用户状态（0为正常，1为删除，2为冻结）' ,
                          `create_time` INT(100)    COMMENT '创建时间-时间戳' ,
                          `update_time` INT(100)    COMMENT '更新时间-时间戳' ,
                          PRIMARY KEY (id)
)  COMMENT = 'rookie-学生表';
